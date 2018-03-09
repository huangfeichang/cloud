/**
 * 
 */
package com.cloud.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangfeichang
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ApplicationServiceFeign {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new SpringApplicationBuilder(ApplicationServiceFeign.class).web(true).run(args);
	}

	@Value("${foo}")
	String foo;

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHi(@RequestParam String name) {
		System.err.println("qwe");
		return foo;
	}

}
