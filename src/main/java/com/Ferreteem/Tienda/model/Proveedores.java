package com.Ferreteem.Tienda.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Proveedores")
public class Proveedores {
	
	@Id
	private long Nit_Prov;
	private String Nombre_Prov;
	private String Direccion_Prov;
	private String Telefono_Prov;
	private String Ciudad_Prov;
	
	public Proveedores()
	{
		
	}

	public Proveedores(long Nit, String Nombre, String Direccion, String Telefono, String Ciudad) {
		super();
		Nit_Prov = Nit;
		Nombre_Prov = Nombre;
		Direccion_Prov = Direccion;
		Telefono_Prov = Telefono;
		Ciudad_Prov = Ciudad ;
	}

	public long getNit_Prov() {
		return Nit_Prov;
	}

	public void setNit_Prov(long nit_Prov) {
		Nit_Prov = nit_Prov;
	}

	public String getNombre_Prov() {
		return Nombre_Prov;
	}

	public void setNombre_Prov(String nombre_Prov) {
		Nombre_Prov = nombre_Prov;
	}

	public String getDireccion_Prov() {
		return Direccion_Prov;
	}

	public void setDireccion_Prov(String direccion_Prov) {
		Direccion_Prov = direccion_Prov;
	}

	public String getTelefono_Prov() {
		return Telefono_Prov;
	}

	public void setTelefono_Prov(String telefono_Prov) {
		Telefono_Prov = telefono_Prov;
	}

	public String getCiudad_Prov() {
		return Ciudad_Prov;
	}

	public void setCiudad_Prov(String ciudad_Prov) {
		Ciudad_Prov = ciudad_Prov;
	}

	

}
