package com.monamitech.productmaintainance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.monamitech.productmaintainance.auditclient.AuditTrailRequest;
import com.monamitech.productmaintainance.auditclient.AuditTrainClient;
import com.monamitech.productmaintainance.json.ProductRequest;
import com.monamitech.productmaintainance.json.ProductResponse;
import com.monamitech.productmaintainance.service.IProductMaintainanceService;
import com.monamitech.productmaintainance.util.ProductMaintainace;

@RestController
@RequestMapping("/product_maintainance")
public class ProductMaintainanceController {

	@Autowired
	private IProductMaintainanceService productMaintainanceService;

	@Autowired
	private AuditTrainClient auditClient;

	@PostMapping(value = "/product_details")
	@ResponseBody
	public ProductResponse getProductDetails(@RequestBody ProductRequest req) throws Exception {
		ProductResponse productResponse = null;
		try {
			productResponse = productMaintainanceService.getProductDetails(req);
		} catch (Exception ex) {
			AuditTrailRequest auditTrailRequest = new AuditTrailRequest();
			auditTrailRequest.setActivity(ProductMaintainace.AUDIT_ACTIVITY);
			auditTrailRequest.setData(ex.getMessage());
			auditTrailRequest.setEventName(ProductMaintainace.AUDIT_EVENT);
			auditTrailRequest.setSystemName(ProductMaintainace.SYSTEM_NAME);
			auditTrailRequest.setUser(ProductMaintainace.USER);
			auditTrailRequest.setLogType(ProductMaintainace.ERROR_LEVEL);
			auditClient.saveLogsToAudit(auditTrailRequest);
		}
		return productResponse;

	}
	
	@PostMapping(value = "/list_of_product_details")
	@ResponseBody
	public List<ProductResponse> getListOfProductls(@RequestBody ProductRequest req) throws Exception {
		List<ProductResponse> productResponse = null;
		try {
			productResponse = productMaintainanceService.getProductList(req);
		} catch (Exception ex) {
			AuditTrailRequest auditTrailRequest = new AuditTrailRequest();
			auditTrailRequest.setActivity(ProductMaintainace.AUDIT_ACTIVITY);
			auditTrailRequest.setData(ex.getMessage());
			auditTrailRequest.setEventName(ProductMaintainace.AUDIT_EVENT);
			auditTrailRequest.setSystemName(ProductMaintainace.SYSTEM_NAME);
			auditTrailRequest.setUser(ProductMaintainace.USER);
			auditTrailRequest.setLogType(ProductMaintainace.ERROR_LEVEL);
			auditClient.saveLogsToAudit(auditTrailRequest);
		}
		return productResponse;

	}

}
