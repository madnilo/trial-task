package com.khursheed.trialtask.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.khursheed.trialtask.model.Federated;
import com.khursheed.trialtask.model.Response;
import com.khursheed.trialtask.repository.FederatedRepository;


@RestController
@RequestMapping("/provisioning")
public class FederatedResource {
	Response response;
	
	@Autowired
	private FederatedRepository federatedRepository;

	@RequestMapping(method = RequestMethod.POST, path="/v1/updateFedId")
	public ResponseEntity<Response> updateFederatedID(@RequestBody Federated fed){
		
		if(fed.getId() != 0L && federatedRepository.exists(fed.getId())){
			response = new Response();
			response.setErrorDescription("Conflicting data");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
		}
		
		else if(fed.getLogoImage() != null 
				&& (fed.getLogoImage().getImg().isEmpty() || fed.getLogoImage().getType().isEmpty())){
			response = new Response();
			response.setErrorDetail("logo_image");
			response.setErrorDescription("Missing mandatory attribute");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);

		}
		
		else{
		
			fed = federatedRepository.save(fed);
			
			response = new Response();
			response.setEmail(fed.getEmail());
			response.setIamUserId(fed.getId());
			response.setTenantId(fed.getTenantId());			
			
			return ResponseEntity.status(HttpStatus.OK).body(response);
		}
	}
}
