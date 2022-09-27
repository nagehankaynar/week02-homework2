package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj="Vade oranı";
		
		Product product1 = new Product();
		
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitInStock(3);
		product1.setImageUrl("delonghi.jpg");
		
		              //set value ayarlamak değer atamak
	/*	product1.name = "Delonghi Kahve Makinesi";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitInStock = 3;
		product1.imageUrl = "delonghi.jpg";*/

		Product product2 = new Product();
		
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(7500);
		product2.setDiscount(7);
		product2.setUnitInStock(3);
		product2.setImageUrl("smeg.jpg");
		
/*		
product2.name = "Smeg Kahve Makinesi";
product2.unitPrice = 7500;
product2.discount = 7;
product2.unitInStock = 3;
product2.imageUrl = "smeg.jpg";*/

Product product3 = new Product();

product3.setName("Kitchen Kahve Makinesi");
product3.setUnitPrice(7500);
product3.setDiscount(7);
product3.setUnitInStock(3);
product3.setImageUrl("kitchen.jpg");

/*
product3.name = "Delonghi Kahve Makinesi";
product3.unitPrice = 7500;
product3.discount = 7;
product3.unitInStock = 3;
product3.imageUrl = "kitchen.jpg";*/



Product[] products = {product1, product2,product3};

     System.out.println("<ul>");
     for(Product product: products) {
	System.out.println("<li>" +product.getName() + "</li>");
	
}
	System.out.println("</ul>");	
	
	IndividualCustomer individualCustomer = new IndividualCustomer();
	individualCustomer.setId(8750680);
	individualCustomer.setCustomerNumber("bireysel müşteri");
	individualCustomer.setPhone("benim telefonum");
	individualCustomer.setFirstName("Nagehan");
	individualCustomer.setLastName("Kaynar");
	
	System.out.println(individualCustomer.getPhone());
	System.out.println(individualCustomer.getFirstName());
	System.out.println(individualCustomer.getLastName());
		
	}

}





//burada atama yapılıyor get işlemi
//System.out.println(product1.name);
