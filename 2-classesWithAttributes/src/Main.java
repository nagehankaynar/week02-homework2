
public class Main {

	public static void main(String[] args) {
		//Product product1 = new Product(0, null, null, 0, 0, null, null);
		
		Product product = new Product();
		
		product.setName("Laptop"); 
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(7500);
		product.setStockAmount(3);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getId());

	}

}
