package com.cloud.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author huangfeichang
 * @date 2017年11月21日 下午6:22:25
 *
 */
@Service
public class HelloService {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private LoadBalancerClient loadBalancerClient;

	public String hiService(String name) {
		// SERVICE-HI/hi == 服务名/方法
        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
    }
}
