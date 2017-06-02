package com.khursheed.trialtask.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.khursheed.trialtask.model.Federated;
import com.khursheed.trialtask.model.Response;

@RestController
@RequestMapping("/provisioning")
public class FederatedResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Response> updateFederatedID(@RequestBody Federated fed){
		
		
		
		return null;
	}
}
