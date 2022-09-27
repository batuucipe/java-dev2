package derssss2;

public class main {

	public static void main(String[] args) {
		String mesaj="vade oranı:";
		
		Product product1= new Product();
		 product1.setName("Delongi Kahve Makinesi");
		 product1.setDiscount(7);
		 product1.setUnitsInStock(3);
		 product1.setUnitprice(7500);
		 product1.setImageUrl("image1.jpg");
		
	
		 
		 
		 Product product2= new Product();
		
		 product2.setName("Smeg Kahve Makinesi");
		 product2.setDiscount(7);
		 product2.setUnitsInStock(3);
		 product2.setUnitprice(7500);
		 product2.setImageUrl("image2.jpg");
		
		 
		 
		 
		 Product product3= new Product();
		
		
		 product3.setName("kitchen Aid Kahve Makinesi");
		 product3.setDiscount(7);
		 product3.setUnitsInStock(3);
		 product3.setUnitprice(7500);
		 product3.setImageUrl("image3.jpg");
		
		
		
		
		Product[] products= {product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" +product.getName()+"</li>");
		}
		System.out.println("</ul>");
		
		IndıvıdualCustomer IndıvıdualCustomer= new IndıvıdualCustomer();
		IndıvıdualCustomer.setId(1);
		IndıvıdualCustomer.setCustomerNumber("1245");
		IndıvıdualCustomer.setPhone("05222222222222");
		IndıvıdualCustomer.setFirstname("engin");
		IndıvıdualCustomer.setLastname("demirog");
		
		
		
}
	}
