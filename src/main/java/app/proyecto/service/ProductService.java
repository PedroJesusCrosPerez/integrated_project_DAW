package app.proyecto.service;

import app.proyecto.entity.Product;

import java.util.List;
import java.util.Optional;

/*
CRUD:
Create
Retrieve / Read
Update
Delete
 */
public interface ProductService {

    // READ / SELECT *
    List<Product> findAll();
    List<Product> findAllByYear(Integer year);
    Optional<Product> findById(Long id);
    Optional<Product> findByName(String name);

    // CREATE / UPDATE
    Product save(Product product);

    // DELETE
    void deleteById(Long id);
    void deleteAll();

    // Más lógica de negocio:
    // 1. Productos fabricados
    // 2. Beneficios obtenidos
    // 3. .....
}