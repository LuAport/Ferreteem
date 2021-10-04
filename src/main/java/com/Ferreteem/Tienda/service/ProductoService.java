package com.Ferreteem.Tienda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ferreteem.Tienda.interfaces.IProducto;
import com.Ferreteem.Tienda.interfeceService.IProductoService;
import com.Ferreteem.Tienda.model.Producto;

@Service
public class ProductoService implements IProductoService{
	
	@Autowired
	private IProducto data;

	@Override
	public List<Producto> listar() {
		return (List<Producto>)data.findAll();
	}

	@Override
	public Optional<Producto> listarId(long id) {
		Optional<Producto> Producto = data.findById(id);
		if(Producto != null)
		{
			return Producto;
		}
		return null;
	}

	@Override
	public int save(Producto p) {
		int res = 0;
		Producto Producto=data.save(p);
		if(!Producto.equals(null))
			res=1;
		return res;
	}

	@Override
	public void delete(long cod) {
		data.deleteById(cod);
		
	}

}
