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

import com.Ferreteem.Tienda.interfeceService.IProductoService;
import com.Ferreteem.Tienda.model.Producto;


@Controller
@RequestMapping
public class ProductoControlador {
	
	@Autowired
	private IProductoService service;
	

	
	@GetMapping("/listarProducto")
	public String listar(Model model)
	{
		List<Producto> Productos=service.listar();
		model.addAttribute("Productos",service.listar());
		return "ProductoIndex";
	}
	
	@GetMapping("/crearProducto")
	public String agregar(Model model)
	{
		model.addAttribute("Producto", new Producto());
		return "ProductoForm";
	}
	
	@PostMapping("/guardarProducto")
	public String save(@Validated Producto p, Model model)
	{
		service.save(p);
		return "redirect:/listarProducto";
	}
	
	@GetMapping("/editarProducto/{cod}")
	
	public String editar(@PathVariable int cod,Model model)	
	{
		Optional<Producto> Producto=service.listarId(cod);
		model.addAttribute("Producto",Producto);
		return "ProductoForm"; 	
	}
	
	@GetMapping("/eliminarProducto/{cod}")	
	public String delete(@PathVariable long cod ,Model model)
	{
		service.delete(cod);
		return"redirect:/listarProducto";
	}
	
}
