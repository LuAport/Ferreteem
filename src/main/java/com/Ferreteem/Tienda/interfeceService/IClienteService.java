package com.Ferreteem.Tienda.interfeceService;

import java.util.List;
import java.util.Optional;

import com.Ferreteem.Tienda.model.Cliente;

public interface IClienteService {

	public List<Cliente> listar();
	public Optional<Cliente>listarId(long id);
	public int save(Cliente p);
	public void delete(long id);
}
