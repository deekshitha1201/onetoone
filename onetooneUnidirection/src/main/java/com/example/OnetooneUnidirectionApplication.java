package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Entity.Address;
import com.example.Entity.Order;
import com.example.Repository.OrderRepository;

@SpringBootApplication
public class OnetooneUnidirectionApplication implements CommandLineRunner {
	@Autowired
	private OrderRepository or;
	
	public static void main(String[] args) {
		SpringApplication.run(OnetooneUnidirectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Order o=new Order();
		o.setId(1);
		o.setName("deekshu");
		o.setPrice(2000);
		Address a=new Address();
		a.setId(2);
		a.setCity("srikakulam");
		o.setAd(a);
		or.save(o);
	}

}
