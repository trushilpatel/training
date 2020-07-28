import org.springframework.data.jpa.repository.JpaRepository;

import com.trushil.springBootREST.entity.Product;

interface ProductRepository extends JpaRepository<Product,Integer> {

}
