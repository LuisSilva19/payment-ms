package com.microservices;

import com.microservices.domain.Payment;
import com.microservices.dto.PaymentDTO;
import com.microservices.enums.Status;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.math.BigDecimal;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MicroservicesApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesApplication.class, args);
	}

}
