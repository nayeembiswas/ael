package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.response.CommonResponse;
import com.example.demo.response.MessageResponse;
import com.example.demo.utill.CommonUtils;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("sec-api")
public class HelloController {

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);
	

	
	@Autowired
	private CommonUtils commonUtils;
	
	
	@GetMapping("/hello")
    public CommonResponse hello(){
		try {
    		return commonUtils.generateSuccessResponse(new MessageResponse("Hello from Spring Security"));
		} catch (Exception e) {
			return commonUtils.generateErrorResponse(e);
		}
    }


}
