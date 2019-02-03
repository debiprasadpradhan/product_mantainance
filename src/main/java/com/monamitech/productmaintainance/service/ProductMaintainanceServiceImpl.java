package com.monamitech.productmaintainance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.monamitech.productmaintainance.dao.IProductMaintainanceDao;
import com.monamitech.productmaintainance.json.ProductRequest;
import com.monamitech.productmaintainance.json.ProductResponse;

@Component
public class ProductMaintainanceServiceImpl implements IProductMaintainanceService {

	@Autowired
	private IProductMaintainanceDao productMaintainanceDao;

	public ProductResponse getProductDetails(@RequestBody ProductRequest req) throws Exception {
		ProductResponse productResponse = null;
		productResponse = productMaintainanceDao.getProductDetails(req);
		return productResponse;

	}

	@Override
	public List<ProductResponse> getProductList(ProductRequest req) throws Exception {
		List<ProductResponse> productResponse = null;
		productResponse = productMaintainanceDao.getProductList(req);
		return productResponse;
	}

}
