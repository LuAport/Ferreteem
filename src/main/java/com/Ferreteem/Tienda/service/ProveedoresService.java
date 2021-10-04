package com.Ferreteem.Tienda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ferreteem.Tienda.interfaces.IProveedores;
import com.Ferreteem.Tienda.interfeceService.IProveedoresService;
import com.Ferreteem.Tienda.model.Proveedores;

@Service
public class ProveedoresService implements IProveedoresService{
	
	@Autowired
	private IProveedores data;

	@Override
	public List<Proveedores> listar() {
		return (List<Proveedores>)data.findAll();
	}

	@Override
	public Optional<Proveedores> listarId(long id) {
		Optional<Proveedores> Proveedores = data.findById(id);
		if(Proveedores != null)
		{
			return Proveedores;
		}
		return null;
	}

	@Override
	public int save(Proveedores p) {
		int res = 0;
		Proveedores Proveedores=data.save(p);
		if(!Proveedores.equals(null))
			res=1;
		
		return res;
	}

	@Override
	public void delete(long Nit) {
		data.deleteById(Nit);
		
	}

}
