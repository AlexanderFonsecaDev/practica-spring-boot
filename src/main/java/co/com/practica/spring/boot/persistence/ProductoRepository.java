package co.com.practica.spring.boot.persistence;

import co.com.practica.spring.boot.persistence.crud.IProductoCrudRepository;
import co.com.practica.spring.boot.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {

    private IProductoCrudRepository iProductoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) iProductoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria) {
        return (List<Producto>) iProductoCrudRepository.findByIdCategoriaOrederByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidadStock, boolean estado){
        return iProductoCrudRepository.findByCantidadStockLessThanAndEstado(cantidadStock,estado);
    }

    public Optional<Producto> getProducto(int idProducto){
        return iProductoCrudRepository.findById(idProducto);
    }

    public Producto save(Producto producto){
        return iProductoCrudRepository.save(producto);
    }

    public  void delete(int id){
        iProductoCrudRepository.deleteById(id);
    }

}
