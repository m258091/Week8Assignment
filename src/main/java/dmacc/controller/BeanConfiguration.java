package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computer;
import dmacc.beans.Manufacturer;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Computer computer() {
		Computer bean = new Computer();
		bean.setMake("Apple");
		bean.setModel("MacBook Air");
		bean.setYear(2015);
		return bean;
	}
	
	@Bean
	public Manufacturer manufacturer() {
		Manufacturer bean = new Manufacturer("IBM", "White Plains", "NY");
		return bean;
	}

}
