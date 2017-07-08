package com.walking.techie.handler;

import com.walking.techie.common.repository.UserRepository;
import com.walking.techie.model.Employee;
import com.walking.techie.model.Product;
import com.walking.techie.model.User;
import com.walking.techie.primary.repository.EmployeeRepository;
import com.walking.techie.secondary.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveTransactionHandler implements SaveTransaction {

  @Autowired
  private UserRepository userRepository;
  @Autowired
  private ProductRepository productRepository;
  @Autowired
  private EmployeeRepository employeeRepository;

  @Override
  public void save() {
    //user details
    User user = new User();
    user.setName("John");
    user.setAge(28);
    user.setEmail("john@gmail.com");

    // product details
    Product product = new Product();
    product.setName("Insurance");
    product.setPrice(10000);

    //Employee details
    Employee employee = new Employee();
    employee.setName("Walking Techie");
    employee.setAge(26);
    employee.setEmail("walkingtechie@gmail.com");

    //save in DB
    userRepository.save(user);
    productRepository.save(product);
    employeeRepository.save(employee);
  }
}
