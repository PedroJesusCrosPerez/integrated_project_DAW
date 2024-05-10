package app.proyecto.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import app.proyecto.entity.Product;
import app.proyecto.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductRestController {

    private final ProductRepository productRepository;

    /**
     * Obtenemos todos los productos
     *
     * @return
     */
    @GetMapping("/")
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    /**
     * Obtenemos un product en base a su ID
     *
     * @param id
     * @return Null si no encuentra el product
     */
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        return optionalProduct.map(product -> ResponseEntity.ok().body(product))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * Insertamos un nuevo product
     *
     * @param nuevo
     * @return product insertado
     */
    @PostMapping("/product")
    public ResponseEntity<Product> insert(@RequestBody Product newProduct) {
        Product savedProduct = productRepository.save(newProduct);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
    }

    /**
     *
     * @param editar
     * @param id
     * @return
     */
    @PutMapping("/product/{id}")
    public ResponseEntity<Product> update(@RequestBody Product updateProduct, @PathVariable Long id) {
        if (!productRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        updateProduct.setId(id);
        Product updatedProduct = productRepository.save(updateProduct);
        return ResponseEntity.ok().body(updatedProduct);
    }

    /**
     * Borra un product del catálogo en base a su id
     * @param id
     * @return
     */
    @DeleteMapping("/product/{id}")
    public ResponseEntity<Product> delete(@PathVariable Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Product productToDelete = optionalProduct.get();
        productRepository.deleteById(id);
        return ResponseEntity.ok().body(productToDelete);
    }

}