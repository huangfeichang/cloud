/**
 * 
 */
package com.cloud.application;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author huangfeichang
 * 服务名 - 方法 定位
 *
 */
@FeignClient(value="service-hi")
public interface SchedualServiceHi {
	// java.lang.IllegalStateException: Method sayHiFromClientOne not annotated with HTTP method type (ex. GET, POST)
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
