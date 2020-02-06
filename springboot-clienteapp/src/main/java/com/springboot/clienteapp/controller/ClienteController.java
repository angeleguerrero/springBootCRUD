package com.springboot.clienteapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.clienteapp.models.entity.Ciudad;
import com.springboot.clienteapp.models.entity.Cliente;
import com.springboot.clienteapp.models.service.ICiudadService;
import com.springboot.clienteapp.models.service.IClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {


	
//	LISTAR CIUDAD CBOX
	@Autowired
	private ICiudadService ciudadService;
//	LISTAR CLIENTES
	@Autowired
	private IClienteService clienteService;

	@GetMapping("/listarClientes")
	public String listarClientes(Model model) {
		
		List<Cliente> listadoClientes = clienteService.listarTodos();
		model.addAttribute("Titulo" , "Listado de Clientes");		
		model.addAttribute("Clientes", listadoClientes);
		
		return "/viewes/clientes/list/listarClientes";
	}
	
//	CREAR CLIENTE
	@GetMapping("/crearClientes")
	public String crearClientes(Model model) {
		
		Cliente clientes = new Cliente();
		List<Ciudad>listaCiudades = ciudadService.ListaCiudades();
		
		model.addAttribute("Titulo", "Formulario: Nuevo Cliente");
		model.addAttribute("Clientes", clientes);
		model.addAttribute("Ciudades", listaCiudades);
		
		return "/viewes/clientes/forms/crearClientes";
	}
	
	
	
	
}
