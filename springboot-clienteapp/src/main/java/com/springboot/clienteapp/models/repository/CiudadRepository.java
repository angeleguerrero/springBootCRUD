package com.springboot.clienteapp.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.clienteapp.models.entity.Ciudad;

public interface CiudadRepository extends CrudRepository<Ciudad, Long> {

}
