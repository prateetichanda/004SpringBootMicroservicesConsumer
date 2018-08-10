package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.netflix.discovery.EurekaNamespace
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.ConfigurableApplicationContext

@SpringBootApplication
@EnableEurekaClient
open class Application

fun main(args: Array<String>) {
	var context:ConfigurableApplicationContext=runApplication<Application>(*args)
	try
	{
	var microServiceClient=context.getBean(microserviceclient::class)
	}
	catch(ex:Exception)
	{
	}
	println("Hello from consumer")
	
	
}
