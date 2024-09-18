
package com.rays.ctl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.DemoResponse;
import com.rays.common.ORSResponse;
import com.rays.dto.Person;
import com.sun.net.httpserver.Authenticator.Result;

@RestController
@RequestMapping(value = "Demo")
public class DemoCtl {

	@GetMapping
	public DemoResponse display() {

		DemoResponse res = new DemoResponse();
		Person dto1=new Person();
		dto1.setFirstName("Anju");
		dto1.setLastName("Thakur");
		dto1.setLoginId("Anju@123");
		dto1.setPassword("456");
		
		Person dto2=new Person();
		dto2.setFirstName("Akit");
		dto2.setLastName("Great Chamr");
		dto2.setLoginId("Jatav@123");
		dto2.setPassword("hi khde");
		
		Map map = new HashMap();
		map.put("dto1", dto1);
		map.put("dto2", dto2);
		
		res.setResult(map);
		res.setData("Person object");

		
		

		

		return res;
	}
	@GetMapping("testORSResponse")
	public ORSResponse testORSresponse() {
		ORSResponse res=new ORSResponse();
		
		Map errors = new HashMap();
		errors.put("firstName", "first name is required");
		errors.put("lastName", "last name is required");
		errors.put("loginId", "login id is required");
		errors.put("password", "password is required");
		
          res.addInputError(errors);
          Person dto = new Person();

  		dto.setFirstName("sagar");
  		dto.setLastName("yash");
  		dto.setLoginId("pqr@gmail.com");
  		dto.setPassword("pqr123");
  		
  		res.addData(dto);
  		res.addMessage("login and password invalid");
  		res.addResult("Token", "axcvbnmxcvbn");
  		res.setSuccess(true);
		
		
		return res;
		
	}
}
