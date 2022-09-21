package nLayeredDemo;

import java.util.ArrayList;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;


public class Main {

	public static void main(String[] args) {
		
		//ToDo: Spring IoC ile çözülecek
		ProductService productService = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());	
		
		Product product1 = new Product(1,3,"ELMA",12,50);
		productService.add(product1);
		
		int[] sayilar = {1,2,3,4,5};
		ArrayList<Integer> sayilar2 = new ArrayList<Integer>();
		sayilar2.add(8); //dizi olsa yeni ekleyemezdik, şimdi istediğin kadar ekle
		
		
		

	}

}
