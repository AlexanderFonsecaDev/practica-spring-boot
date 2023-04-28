package co.com.practica.spring.boot.persistence.crud;

import co.com.practica.spring.boot.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IProductoCrudRepository extends CrudRepository<Producto,Integer> { }
