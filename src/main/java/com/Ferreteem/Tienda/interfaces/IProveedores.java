package com.Ferreteem.Tienda.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Ferreteem.Tienda.model.Proveedores;


@Repository
public interface IProveedores extends CrudRepository<Proveedores, Long> {

}
