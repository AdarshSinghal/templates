package com.sample.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.data.service.SampleService;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

	@Autowired
	private SampleService sampleService;

	@GetMapping
	public String hello() {
		return sampleService.hello();
	}
}
