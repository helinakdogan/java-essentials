package oopIntro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "lenovo v14", 15000, "16gb ram", 10); //referans, instance
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("lenovo v15");
		product2.setUnitPrice(16000);
		product2.setDetail("32gb ram");
		product2.setDiscount(10);
		
		System.out.println(product2.getUnitPriceAfterdiscount());
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("bahçe");
		
		System.out.println(category1.getName());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Product product3 = new Product();
		
		
		
		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
			System.out.println(product.name);
		};
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "bilgisayar";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "ev/bahçe";

		ProductManager productManager = new ProductManager();
		productManager.addToCart(product2); */
	}
}
