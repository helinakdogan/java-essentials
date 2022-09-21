package oopIntro;

public class Product {  //this -> Product
	
	//encapsulation
	private int id;                              //private -> sadece bu class içinde kullanılabilir      //this.id bu yani classtaki id
	private String name;
	private double unitPrice;
	private String detail; 
	private double discount;
	
	public Product() {
			
	}
	
	public Product(int id, String name, double unitPrice, String detail, double discount) {
		super();                                       //bu classın parametresizini çalıştır yani ilk cons.
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		
	}
	

	// get -> okuma işlemi      set -> yazma işlemi
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	
	public double getUnitPriceAfterdiscount() {
		return this.unitPrice - (this.unitPrice * this.discount / 100);
	}
}
 