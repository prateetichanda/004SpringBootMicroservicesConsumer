package com.example.demo

import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.cloud.client.ServiceInstance


class microserviceclient {
	fun getEmployee(client:DiscoveryClient):Unit
	{
		var instances:ServiceInstance  = client.getInstances("microservices-producer").get(0)
		println("service is instantiated "+instances)
		
	}
}