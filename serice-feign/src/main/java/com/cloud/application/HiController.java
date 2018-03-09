/**
 * 
 */
package com.cloud.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangfeichang
 *
 */
@RestController
public class HiController {
	@Value(value = "${foo}")
	String foo;

	@Autowired
	private SchedualServiceHi schedualServiceHi;

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHi(@RequestParam String name) {
		System.err.println("qwe");
		return schedualServiceHi.sayHiFromClientOne(name + foo);
	}
}
