package app.proyecto.service;

import app.proyecto.entity.Product;
import app.proyecto.repository.ProductRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<Product> findAllByYear(Integer year) {
        Objects.requireNonNull(year);
        return this.repository.findAllByYear(year);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public Optional<Product> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Product save(Product manufacturer) {
        this.repository.save(manufacturer);
        return manufacturer;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteAll() {

    }
}
