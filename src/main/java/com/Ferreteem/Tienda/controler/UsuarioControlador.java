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

import com.Ferreteem.Tienda.interfeceService.IUsuarioService;
import com.Ferreteem.Tienda.model.Usuario;


@Controller
@RequestMapping
public class UsuarioControlador {
	
	@Autowired
	private IUsuarioService service;
	

	
	@GetMapping("/listarUsuarios")
	public String listar(Model model)
	{
		List<Usuario> Usuarios=service.listar();
		//for(int i=0; i<Usuarios.size(); i++)
		//{
		//	System.out.println(Usuarios.get(i).getCedula());
		//}
		model.addAttribute("Usuarios",service.listar());
		return "UsuarioIndex";
	}
	
	@GetMapping("/crearUsuario")
	public String agregar(Model model)
	{
		model.addAttribute("Usuario", new Usuario());
		return "UsuarioForm";
	}
	
	@PostMapping("/guardarUsuario")
	public String save(@Validated Usuario p, Model model)
	{
		service.save(p);
		return "redirect:/listarUsuarios";
	}
	
	@GetMapping("/editarUsuario/{Cedula}")
	public String editar(@PathVariable int Cedula,Model model)
	{
		Optional<Usuario> Usuario=service.listarId(Cedula);
		model.addAttribute("Usuario",Usuario);
		return "UsuarioForm"; 	
	}
	
	@GetMapping("/eliminarUsuario/{Cedula}")	
	public String delete(@PathVariable int Cedula,Model model)
	{
		service.delete(Cedula);
		return"redirect:/listarUsuarios";
	}
	
	@PostMapping("/validarUsuario")
	public String validar(@Validated Usuario p, Model model)
	{
		boolean valido = service.validarUsuario(p.getUsuario(), p.getClave());
		if (valido) {
			return "redirect:/listarUsuarios";
		}else {
			return "redirect:/?error=true";
		}
				
	//}
	//@GetMapping("/Menu")
	//public String Mostrar Menu(){
		//return"Menu";
	//}
	
	//	
	//{
	//@GetMapping("Index")
	//public String mostrarIndex() {
		//return "Index";
	}

}

