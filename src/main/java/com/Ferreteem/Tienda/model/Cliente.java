package com.Ferreteem.Tienda.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Clientes")
public class Cliente {
	
	@Id
	private long Cedula_Cli;
	private String Nombre_Cli;
	private String Direccion_Cli;
	private String Telefono_Cli;
	private String Correo_Cli;
	
	public Cliente()
	{
		
	}

	public Cliente(long cedula, String nombre, String direccion, String telefono, String correo) {
		super();
		Cedula_Cli = cedula;
		Nombre_Cli = nombre;
		Direccion_Cli = direccion;
		Telefono_Cli = telefono;
		Correo_Cli = correo;
	}

	public long getCedula_Cli() {
		return Cedula_Cli;
	}

	public void setCedula_Cli(long cedula_Cli) {
		Cedula_Cli = cedula_Cli;
	}

	public String getNombre_Cli() {
		return Nombre_Cli;
	}

	public void setNombre_Cli(String nombre_Cli) {
		Nombre_Cli = nombre_Cli;
	}

	public String getDireccion_Cli() {
		return Direccion_Cli;
	}

	public void setDireccion_Cli(String direccion_Cli) {
		Direccion_Cli = direccion_Cli;
	}

	public String getTelefono_Cli() {
		return Telefono_Cli;
	}

	public void setTelefono_Cli(String telefono_Cli) {
		Telefono_Cli = telefono_Cli;
	}

	public String getCorreo_Cli() {
		return Correo_Cli;
	}

	public void setCorreo_Cli(String correo_Cli) {
		Correo_Cli = correo_Cli;
	}


}
