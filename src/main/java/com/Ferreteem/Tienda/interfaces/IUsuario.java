package com.Ferreteem.Tienda.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Ferreteem.Tienda.model.Usuario;


@Repository
public interface IUsuario extends CrudRepository<Usuario, Long> {
	@Query(value="select* from T_usuarios where usuario=:usuario and clave=:clave", nativeQuery =true)
	Usuario findByUsuarioAndPassword(String usuario, String clave);
}
