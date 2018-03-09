package com.cloud.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author huangfeichang
 * @date 2017年11月21日 下午6:27:39
 *
 */
@SpringBootApplication // spring boot 启动必须
@EnableEurekaClient // client 向注册中心注册服务
@RestController // 执行并且返回数据
@EnableConfigServer // 配置中心必须
public class ServiceHiApplication {
	@Value("${server.port}")
	String port;

	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class, args);
	}
	
	@RequestMapping(value="/hi", method = RequestMethod.GET)
	public String name(@RequestParam String name) {
		return name + "===>" + port;

	}

}
