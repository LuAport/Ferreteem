package com.Ferreteem.Tienda.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Ferreteem.Tienda.interfeceService.IClienteService;
import com.Ferreteem.Tienda.model.Cliente;


@Controller
@RequestMapping
public class ClienteControlador {
	
	@Autowired
	private IClienteService service;
	

	
	@GetMapping("/listarClientes")
	public String listar(Model model)
	{
		List<Cliente> Clientes=service.listar();
		model.addAttribute("Clientes",service.listar());
		return "ClienteIndex";
	}
	
	@GetMapping("/crearCliente")
	public String agregar(Model model)
	{
		model.addAttribute("Cliente", new Cliente());
		return "ClienteForm";
	}
	
	@PostMapping("/guardarCliente")
	public String save(@Validated Cliente p, Model model)
	{
		service.save(p);
		return "redirect:/listarClientes";
	}
	
	@GetMapping("/editarCliente/{Cedula}")
	
	public String editar(@PathVariable int Cedula,Model model)
	{
		Optional<Cliente> Cliente=service.listarId(Cedula);
		model.addAttribute("Cliente",Cliente);
		return "ClienteForm"; 	
	}
	
	@GetMapping("/eliminarCliente/{Cedula}")	
	public String delete(@PathVariable int Cedula,Model model)
	{
		service.delete(Cedula);
		return"redirect:/listarClientes";
	}
	
}
