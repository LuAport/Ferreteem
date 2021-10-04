package com.Ferreteem.Tienda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ferreteem.Tienda.interfaces.IUsuario;
import com.Ferreteem.Tienda.interfeceService.IUsuarioService;
import com.Ferreteem.Tienda.model.Usuario;

@Service
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	private IUsuario data;

	@Override
	public List<Usuario> listar() {
		return (List<Usuario>)data.findAll();
	}

	@Override
	public Optional<Usuario> listarId(long id) {
		Optional<Usuario> Usuario = data.findById(id);
		if(Usuario != null)
		{
			return Usuario;
		}
		return null;
	}

	@Override
	public int save(Usuario p) {
		int res = 0;
		Usuario Usuario=data.save(p);
		if(!Usuario.equals(null))
			res=1;
		
		return res;
	}

	@Override
	public void delete(long cedula) {
		data.deleteById(cedula);
		
	}

	public boolean validarUsuario(String usuario, String clave) {
		Usuario usuarioBD = data.findByUsuarioAndPassword(usuario, clave);
		if(usuarioBD != null) {
			return true;
		}
		else return false;
	}
}
