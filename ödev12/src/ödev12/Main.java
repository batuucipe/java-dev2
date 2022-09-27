package ödev12;

public class Main {

	public static void main(String[] args) {
		Product product=new Product(1,"laptop","asus laptop",5000,3,"kırmızı");
	//	product.setId(1);
		//product.setDescription("Hp");
	//	product.setName("laptop");
//		product.setPrice(5000);
	//	product.setRenk("kırmızı");
		//product.setStockAmount(3);
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		
	}

}
