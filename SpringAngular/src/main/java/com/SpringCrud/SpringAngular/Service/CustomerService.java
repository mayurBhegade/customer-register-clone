package com.SpringCrud.SpringAngular.Service;

import java.util.List;

import com.SpringCrud.SpringAngular.DTO.CustomerDTO;
import com.SpringCrud.SpringAngular.DTO.CustomerSaveDTO;
import com.SpringCrud.SpringAngular.DTO.CustomerUpdateDTO;

public interface CustomerService {

	public String addCustomer(CustomerSaveDTO customerSaveDTO);

	public List<CustomerDTO> getAllCustomers();

	public String updateCustomer(CustomerUpdateDTO customerUpdateDTO);

	public boolean deleteCustomer(int id);



	
	
}
	