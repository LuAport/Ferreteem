package com.Ferreteem.Tienda.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Producto")
public class Producto {
	
	@Id
	private long Codigo_Prod;
	private String Nombre_Prod;
	private long Nit_Prov_Prod;
	private double Precio_Compra;
	private double IVA_prod;
	private double Precio_Vta;

	public Producto()
	{
		
	}

	public Producto(long cod, String nombre, long nit, double precioCompra, double iva, double preciovta) {
		super();
		
		
		Codigo_Prod=cod;
		Nombre_Prod=nombre;
		Nit_Prov_Prod= nit;
		Precio_Compra= precioCompra;
		IVA_prod= iva;
		Precio_Vta= preciovta;
		
	}

	public long getCodigo_Prod() {
		return Codigo_Prod;
	}

	public void setCodigo_Prod(long codigo_Prod) {
		Codigo_Prod = codigo_Prod;
	}

	public String getNombre_Prod() {
		return Nombre_Prod;
	}

	public void setNombre_Prod(String nombre_Prod) {
		Nombre_Prod = nombre_Prod;
	}

	public long getNit_Prov_Prod() {
		return Nit_Prov_Prod;
	}

	public void setNit_Prov_Prod(long nit_Prov_Prod) {
		Nit_Prov_Prod = nit_Prov_Prod;
	}

	public double getPrecio_Compra() {
		return Precio_Compra;
	}

	public void setPrecio_Compra(double precio_Compra) {
		Precio_Compra = precio_Compra;
	}

	public double getIVA_prod() {
		return IVA_prod;
	}

	public void setIVA_prod(double iVA_prod) {
		IVA_prod = iVA_prod;
	}

	public double getPrecio_Vta() {
		return Precio_Vta;
	}

	public void setPrecio_Vta(double precio_Vta) {
		Precio_Vta = precio_Vta;
	}

	

}
