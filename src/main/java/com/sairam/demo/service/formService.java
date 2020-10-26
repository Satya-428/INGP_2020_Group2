package com.sairam.demo.service;

import java.util.List;

import com.sairam.demo.module.Form;

public interface formService {

	List<Form> findAll();
	Form save(Form form);
	Form findById(Long id);
//	Form findByPassport_number(String passport_number);
//	List<Form> findBypassport_number(String passport_number);

}
