package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

//hangi tabloya hangi id tipiyle
public interface ProductDao extends JpaRepository<Product,Integer>{

}
