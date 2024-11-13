package ma.enset.studetapp.repository;
import ma.enset.studetapp.etities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product>findByNameContains(String mc);
    List<Product>findByPriceGreaterThan(double Price);
    @Query("select p from Product p where p.name like :x")
    List<Product>seach(@Param("x")String mc);
    @Query("select p from Product p where p.price>:x")
    List<Product>seachByPrice(@Param("x")double price);
}