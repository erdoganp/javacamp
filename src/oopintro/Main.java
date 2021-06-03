package oopintro;

public class Main {

	public static void main(String[] args) {
		
		
		Product product1=new Product();
		
		product1.setId(1);
		product1.setName("Asus K53SV");
		product1.setDiscount(10);
		product1.setUnitPrice(5000);
		
		
		Product product2=new Product();
		
		product1.setId(2);
		product1.setName("HP");
		product1.setDiscount(15);
		product1.setUnitPrice(6000);
		
		Product product3=new Product();
		
		product1.setId(3);
		product1.setName("MSI");
		product1.setDiscount(10);
		product1.setUnitPrice(10000);
		
		
		
		ProductManager productManager=new ProductManager();
		
		productManager.addProduct(product1);
		productManager.addProduct(product2);
		productManager.addProduct(product3);

	
		Product[] products= {
				product1,
		        product2,
		        product3};
		
 		
		
		for(Product product: products) {
			System.out.println(product.getName()+"listeye eklendi ve "+ product.getUnitPriceAfterDiscount()+ "fiyatına düştü");
		}
	
	
	}

}
