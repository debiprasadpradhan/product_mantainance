package com.monamitech.productmaintainance.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.monamitech.productmaintainance.json.ProductRequest;
import com.monamitech.productmaintainance.json.ProductResponse;
import com.monamitech.productmaintainance.json.ProductTier;
import com.monamitech.productmaintainance.util.ProductMapper;
import com.monamitech.productmaintainance.util.ProductTierMapper;

@Transactional
@Component
public class ProductMaintainanceDaoImpl implements IProductMaintainanceDao {

	private final String GET_PRODUCT_DETAILS_QUERY = "SELECT Lndme_productStatus,Lndme_productCode,Lndme_ProductName,Lndme_productMinValue,Lndme_productMaxValue FROM Lendme_Product where Lndme_productCode=? and Lndme_productType_Code=(SELECT Lndme_productType_Code FROM Lendme_ProductBank where Lndme_BankCode=?)";
	private final String GET_PRODUCT_TIER_QUERY = "SELECT * FROM Lendme_ProductTier where Lndme_productCode=? ";
	
	private final String PRODUCT_LIST="SELECT Lndme_productStatus,Lndme_productCode,Lndme_ProductName FROM Lendme_Product where Lndme_productType_Code=(SELECT Lndme_productType_Code FROM Lendme_ProductBank where Lndme_BankCode=?)";

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	JdbcTemplate jdbcTemplate;

	
	public ProductResponse getProductDetails(@RequestBody ProductRequest req) throws Exception {
		ProductResponse productResponse=null;
		List<ProductTier> productTiersList=null;
		try {
			productResponse = jdbcTemplate.queryForObject(GET_PRODUCT_DETAILS_QUERY,
					new Object[] { req.getProductCode(), req.getOrganization() }, new ProductMapper());
			productTiersList = jdbcTemplate.query(GET_PRODUCT_TIER_QUERY, new Object[] { req.getProductCode() },
					new ProductTierMapper());
		}catch(Exception e) {
			System.out.println(e);
			throw e;
		}
		productResponse.setProductTiers(productTiersList);
		
		//TODO
		//Need to handle status 1 and 2 also
		return productResponse;
	}
	
	public List<ProductResponse> getProductList(@RequestBody ProductRequest req) throws Exception {
		List<ProductResponse> productListResponse=null;
		try {
			productListResponse = jdbcTemplate.query(PRODUCT_LIST,
					new Object[] { req.getOrganization() }, new ProductMapper());
		}catch(Exception e) {
			System.out.println(e);
			throw e;
		}
		//TODO
		//Need to handle status 1
		return productListResponse;
	}

}
