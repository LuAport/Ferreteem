package com.Ferreteem.Tienda.interfeceService;

import java.util.List;
import java.util.Optional;

import com.Ferreteem.Tienda.model.Usuario;

public interface IUsuarioService {

	public List<Usuario> listar();
	public Optional<Usuario>listarId(long id);
	public int save(Usuario p);
	public void delete(long id);
	public boolean validarUsuario(String usuario, String clave);
	
}
