package oopIntro;

public class Main {

    public static void main(String[] args) {
	 Product product1=new Product(2,"Lenovo v15",15000,"32 GB Ram");
	 product1.id=1;
	 product1.name="Lenovo v14";
	 product1.unitPrice=15000;
	 product1.detail="16 GB Ram";




        Product product2=new Product();
		product2.id=2;
		product2.name="Lenovo v15";
		product2.unitPrice=15000;
		product2.detail="32 GB Ram";

		Product product3=new Product();
		product3.id=3;
		product3.name="HP 15 ";
		product3.unitPrice=1500;
		product3.detail="8 GB Ram";

		Product[] products={product1,product2,product3};

		for (Product product: products) {
			System.out.print(product.id+" ");
			System.out.println(product.name);
		}
		Category category1=new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		Category category2=new Category();
		category2.id=1;
		category2.name="Ev/Bahce";
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
    }
}
