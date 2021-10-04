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

import com.Ferreteem.Tienda.interfeceService.IProveedoresService;
import com.Ferreteem.Tienda.model.Proveedores;


@Controller
@RequestMapping
public class ProveedoresControlador {
	
	@Autowired
	private IProveedoresService service;
	

	
	@GetMapping("/listarProveedores")
	public String listar(Model model)
	{
		List<Proveedores> Proveedores=service.listar();
		model.addAttribute("Proveedores",service.listar());
		return "ProveedoresIndex";
	}
	
	@GetMapping("/crearProveedores")
	public String agregar(Model model)
	{
		model.addAttribute("Proveedores", new Proveedores());
		return "ProveedoresForm";
	}
	
	@PostMapping("/guardarProveedores")
	public String save(@Validated Proveedores p, Model model)
	{
		service.save(p);
		return "redirect:/listarProveedores";
	}
	
	@GetMapping("/editarProveedores/{Nit_Prov}")
	
	public String editar(@PathVariable long Nit_Prov,Model model)
	{
		Optional<Proveedores> Proveedores=service.listarId(Nit_Prov);
		model.addAttribute("Proveedores",Proveedores);
		return "ProveedoresForm"; 	
	}
	
	@GetMapping("/eliminarProveedores/{Nit_Prov}")	
	public String delete(@PathVariable long  Nit_Prov,Model model)
	{
		service.delete(Nit_Prov);
		return"redirect:/listarProveedores";
	}
	
}
