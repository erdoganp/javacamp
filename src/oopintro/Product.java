package oopintro;

public class Product {

	private int id;
	private String name;
	private double unitPrice;
	private int discount;
	private double unitPriceAfterDiscount;
	
	public Product() {}
	public Product(int id,String name,double unitPrice,int discount) {
		
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.discount=discount;
		
	}

	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice=unitPrice;
	}
	public double getUnitPrice() {
		return this.unitPrice;
	}
	
	public void setDiscount(int discount) {
		this.discount=discount;
	}
	public int  getDiscount() {
	  return this.discount;
	}
	
	
	public double getUnitPriceAfterDiscount() {
		
		return this.unitPrice - (this.unitPrice * this.discount / 100);
	}
	

}
	
