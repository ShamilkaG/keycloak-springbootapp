package com.keycloak.user.repo;

import com.keycloak.user.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
