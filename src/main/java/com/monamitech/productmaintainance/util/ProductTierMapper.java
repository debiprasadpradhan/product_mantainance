package com.monamitech.productmaintainance.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.monamitech.productmaintainance.json.ProductTier;

public class ProductTierMapper implements RowMapper<ProductTier> {

	@Override
	public ProductTier mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductTier productTier = new ProductTier();
		productTier.setEndvalue(rs.getString("Lndme_productTierEndValue"));
		productTier.setIntrate(rs.getString("Lndme_productTierIntRate"));
		productTier.setStartvalue(rs.getString("Lndme_productTierStartValue"));
		productTier.setTerm(rs.getString("Lndme_productTierTerm"));
		return productTier;
	}

}
