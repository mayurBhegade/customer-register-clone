package com.SpringCrud.SpringAngular.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringCrud.SpringAngular.DTO.CustomerDTO;
import com.SpringCrud.SpringAngular.DTO.CustomerSaveDTO;
import com.SpringCrud.SpringAngular.DTO.CustomerUpdateDTO;
import com.SpringCrud.SpringAngular.Entity.Customer;
import com.SpringCrud.SpringAngular.Repository.CustomerRepository;
@Service
public class CustomerServiceIMPL implements CustomerService

{
	@Autowired
	CustomerRepository customerRepository;
	
	
	

	@Override
	public String addCustomer(CustomerSaveDTO customerSaveDTO) 
	{
		Customer customer = new Customer(
				
				customerSaveDTO.getCustomername(),
				customerSaveDTO.getCustomerAddress(),
				customerSaveDTO.getMobile()

			);	
				customerRepository.save(customer);
				return customer.getCustomername();
				
	}
	

	@Override
	public java.util.List<CustomerDTO> getAllCustomers()
	{
		java.util.List<Customer> getCustomers= customerRepository.findAll();
		java.util.List<CustomerDTO> customerDTOList = new ArrayList<>();
		for (Customer a : getCustomers)
		{
			CustomerDTO customerDTO = new CustomerDTO(
					
					a.getCustomerid(),
					a.getCustomername(),
					a.getCustomerAddress(),
					a.getMobile()
			);
			customerDTOList.add(customerDTO);
		}
		return customerDTOList;
	}


	@Override
	public String updateCustomer(CustomerUpdateDTO customerUpdateDTO)
	{
		if(customerRepository.existsById(customerUpdateDTO.getCustomerid()))
		{
			Customer customer = customerRepository.getById(customerUpdateDTO.getCustomerid());
			
			customer.setCustomername(customerUpdateDTO.getCustomername());
			customer.setCustomerAddress(customerUpdateDTO.getCustomerAddress());
			customer.setMobile(customerUpdateDTO.getMobile());
			customerRepository.save(customer);
			
		}
		else
			{
				System.out.println("Customer ID does not Exist...!");
			}
		return null;
		}
	

	@Override
	public boolean deleteCustomer(int id)	
	{
		if(customerRepository.existsById(id))
		{
			customerRepository.deleteById(id);
		}
		else
		{
			System.out.println("customer id not found");
		}
		return false;
	}
	}
		

