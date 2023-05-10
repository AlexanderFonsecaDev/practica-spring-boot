package co.com.practica.spring.boot.domain.repository;

import co.com.practica.spring.boot.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();

    Optional<List<Product>> getByCategory(int categoryId);

    Optional<List<Product>> getScarseProducts(int quantity);

    Optional<Product> getProductById(int productId);

    Product saveProduct(Product product);

    void deleteProduct(int productId);
}
