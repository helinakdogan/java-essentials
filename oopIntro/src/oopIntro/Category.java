package oopIntro;

public class Category {
	private int id;
	private String name;
	

	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	//parametre yok çünkü sadece okuma
	public String getName() { 
		return name + "!";
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
}
