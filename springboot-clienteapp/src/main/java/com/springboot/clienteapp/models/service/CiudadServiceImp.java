package com.springboot.clienteapp.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.clienteapp.models.entity.Ciudad;
import com.springboot.clienteapp.models.repository.CiudadRepository;


@Service
public class CiudadServiceImp implements ICiudadService {
	@Autowired
	private CiudadRepository ciudadRepository;
	
	@Override
	public List<Ciudad> ListaCiudades() {

		return (List<Ciudad>) ciudadRepository.findAll();
	}

}
