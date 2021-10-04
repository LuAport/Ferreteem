package com.Ferreteem.Tienda.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Ferreteem.Tienda.model.Cliente;


@Repository
public interface ICliente extends CrudRepository<Cliente, Long> {

}
