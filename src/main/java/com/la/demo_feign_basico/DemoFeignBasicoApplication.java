package com.la.demo_feign_basico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DemoFeignBasicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFeignBasicoApplication.class, args);
	}

}
