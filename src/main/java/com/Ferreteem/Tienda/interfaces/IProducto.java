package com.Ferreteem.Tienda.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Ferreteem.Tienda.model.Producto;



@Repository
public interface IProducto extends CrudRepository<Producto, Long> {

}
