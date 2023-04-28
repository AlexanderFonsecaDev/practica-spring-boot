package co.com.practica.spring.boot.persistence;

import co.com.practica.spring.boot.persistence.crud.IProductoCrudRepository;
import co.com.practica.spring.boot.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private IProductoCrudRepository iProductoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) iProductoCrudRepository.findAll();
    }

}
