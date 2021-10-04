package com.Ferreteem.Tienda.interfeceService;

import java.util.List;
import java.util.Optional;

import com.Ferreteem.Tienda.model.Proveedores;

public interface IProveedoresService {

	public List<Proveedores> listar();
	public Optional<Proveedores>listarId(long id);
	public int save(Proveedores p);
	public void delete(long id);
}
