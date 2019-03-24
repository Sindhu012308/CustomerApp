package com.sindhu.customer.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sindhu.customer.dal.entities.CustomerData;
import com.sindhu.customer.dal.repos.CustomerDataRepos;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerdalApplicationTests {
	@Autowired
	private CustomerDataRepos customerDataRepos;
	
	@Test
	public void testCreateCustomer() {
		CustomerData customer = new CustomerData();
		//customer.setId(1);
		customer.setName("sindhu");
		customer.setEmail("Sindhu@gmail.com");
		
		customerDataRepos.save(customer);		
	}
	
	@Test
	public void testReadCustomer() {
		CustomerData customer = customerDataRepos.findById(1l).get();
		System.out.println(customer);
	}
	
	@Test
	public void testUpdateStudent() {
		CustomerData customer = customerDataRepos.findById(1l).get();
		customer.setEmail("katta@gmail.com");
		
		customerDataRepos.save(customer);
	}

	@Test
	public void testDeleteCustomer() {
		CustomerData customer = new CustomerData();
		customer.setId(1l);
		
		customerDataRepos.delete(customer);		
	}
	
}

