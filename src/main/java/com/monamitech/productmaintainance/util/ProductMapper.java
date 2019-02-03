/**
 * 
 */
package com.monamitech.productmaintainance.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.monamitech.productmaintainance.json.ProductResponse;

public class ProductMapper implements RowMapper<ProductResponse> {

	@Override
	public ProductResponse mapRow(ResultSet rs, int count) throws SQLException {
		ProductResponse productResponse = new ProductResponse();
		productResponse.setStatus(rs.getInt("Lndme_productStatus"));
		productResponse.setProductCode(rs.getString("Lndme_productCode"));
		productResponse.setProductName(rs.getString("Lndme_ProductName"));
		productResponse.setProductMinValue(rs.getDouble("Lndme_productMinValue"));
		productResponse.setProductMaxValue(rs.getDouble("Lndme_productMaxValue"));
		return productResponse;

	}

}
