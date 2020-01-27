package com.springboot.clienteapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.clienteapp.models.entity.Cliente;
import com.springboot.clienteapp.models.service.IClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/listarClientes")
	public String listarClientes(Model model) {
		
		List<Cliente> listadoClientes = clienteService.listarTodos();
		model.addAttribute("Titulo" , "Listado de Clientes");		
		model.addAttribute("Clientes", listadoClientes);
		
		return "/viewes/clientes/list/listarClientes";
	}
	
	
	@GetMapping("/crearClientes")
	public String crearClientes(Model model) {
		
		return "/viewes/clientes/forms/crearClientes";
	}
	
	
	
	
}
