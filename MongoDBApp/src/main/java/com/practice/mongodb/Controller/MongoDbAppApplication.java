package com.practice.mongodb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.mongodb.CustomerRepo;
import com.practice.mongodb.Model.Customer;

@SpringBootApplication
public class MongoDbAppApplication implements CommandLineRunner{
	
	@Autowired
	private CustomerRepo customerRepo;

	public static void main(String[] args) {
		SpringApplication.run(MongoDbAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Customer c1=new Customer("1","Komal","Malhotra");
		Customer c2=new Customer("2","Kindson","Thomas");
		Customer c3=new Customer("3","Anuj","Kapadia");
		Customer c4=new Customer("4","Vijay","Shankar");
		Customer c5=new Customer("5","Vijay","Kumar");
		
		customerRepo.save(c1);
		customerRepo.save(c2);
		customerRepo.save(c3);
		customerRepo.save(c4);
		customerRepo.save(c5);
		
		
		System.out.println("************");
		
		List<Customer> cust=customerRepo.findAll();
		
		for(Customer c:cust) {
			System.out.println(c.toString());
		}
		
	}

}
