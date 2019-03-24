package com.sindhu.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.sindhu.customer.dal.entities.CustomerData;

public interface CustomerDataRepos extends CrudRepository<CustomerData, Long> {

}
