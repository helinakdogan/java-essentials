package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data                             //lombok
@Entity                           //Spring framework classın katmanını soruyor, anotasyon yöntemi (class hakkında bilgi toplar) //Product bir Entitydir - veri tabanı nesnesi                        
@Table(name="products")           //veri tabanında hangi tabloya karşılık geliyor

public class Product {
	
	@Id                           //1.33??????
	@GeneratedValue 
	@Column(name="product_id")    //veri tabanında hangi kolona denk geliyor
	private int id;
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitpPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	public Product() {};
	
	public Product(int id, int categoryId, String productName, double unitpPrice, short unitsInStock, String quantityPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitpPrice = unitpPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnit = quantityPerUnit;
	}

}
