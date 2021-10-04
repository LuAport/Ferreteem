package com.Ferreteem.Tienda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ferreteem.Tienda.interfaces.ICliente;
import com.Ferreteem.Tienda.interfeceService.IClienteService;
import com.Ferreteem.Tienda.model.Cliente;

@Service
public class ClienteService implements IClienteService{
	
	@Autowired
	private ICliente data;

	@Override
	public List<Cliente> listar() {
		return (List<Cliente>)data.findAll();
	}

	@Override
	public Optional<Cliente> listarId(long id) {
		Optional<Cliente> Cliente = data.findById(id);
		if(Cliente != null)
		{
			return Cliente;
		}
		return null;
	}

	@Override
	public int save(Cliente p) {
		int res = 0;
		Cliente Cliente=data.save(p);
		if(!Cliente.equals(null))
			res=1;
		
		return res;
	}

	@Override
	public void delete(long cedula) {
		data.deleteById(cedula);
		
	}

}
