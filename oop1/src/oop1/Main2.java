package oop1;

public class Main2 {

	public static void main(String[] args) {
	String mesaj = "vade oranı";
	Product product1 = new Product();
	
	product1.setName("buzdolabı");
	product1.setUnitPrice(10000);

	Product product2 = new Product();
	product2.setName("ütü");
	product2.setUnitPrice(2000);
	
	Product product3 = new Product();
	product3.setName("fırın");
	product3.setUnitPrice(6000);
	
	Product[] products = {product1, product2,product3};
	
	for(Product product : products) {
	
		System.out.println(product.getName());
		System.out.println(product.getUnitPrice());
		System.out.println("*******");
	}

	}

}
