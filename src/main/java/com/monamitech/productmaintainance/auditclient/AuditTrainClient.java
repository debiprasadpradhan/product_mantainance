package com.monamitech.productmaintainance.auditclient;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Component
public class AuditTrainClient {
	@Value("${audit.trail.authtoken.url}")
	private String auditClientUrl;
	@Value("${audit.trail.save.url}")
	private String auditSaveUrl;

	public String getAuthToken() {
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add("Content-Type", "application/json");
		RestTemplate restTemplate = new RestTemplate();
		TokenGenerate userv = new TokenGenerate();
		userv.setUsername("admin");
		userv.setPassword("admin");
		HttpEntity<TokenGenerate> request = new HttpEntity<TokenGenerate>(userv, headers);

		ResponseEntity<Object> result = (ResponseEntity<Object>) restTemplate.postForEntity(auditClientUrl, request,
				Object.class);
		@SuppressWarnings("unchecked")
		Map<String, String> mapbody = (Map<String, String>) result.getBody();

		return mapbody.get("Authorization");
	}

	public void saveLogsToAudit(AuditTrailRequest auditTrailRequest) {
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		String authtoken = getAuthToken();
		headers.add("Authorization", authtoken);
		headers.add("Content-Type", "application/json");

		RestTemplate restTemplate = new RestTemplate();

		HttpEntity<AuditTrailRequest> request = new HttpEntity<AuditTrailRequest>(auditTrailRequest, headers);
		ResponseEntity<Object> result = (ResponseEntity<Object>) restTemplate.postForEntity(auditSaveUrl, request,
				Object.class);
	}
}
