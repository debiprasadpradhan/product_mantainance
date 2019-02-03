package com.monamitech.productmaintainance.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.monamitech.productmaintainance.json.ProductRequest;
import com.monamitech.productmaintainance.json.ProductResponse;

@Component
public interface IProductMaintainanceDao {

	public ProductResponse getProductDetails(@RequestBody ProductRequest req) throws Exception;

	public List<ProductResponse> getProductList(@RequestBody ProductRequest req) throws Exception;

}
