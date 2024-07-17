package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.model.Customer;

import java.util.List;
import java.util.UUID;

/**
 * FECIT AH DIE:12.07.24
 */
public interface CustomerService {

    List<Customer> listCustomers();

    Customer getCustomerById(UUID id);
}
