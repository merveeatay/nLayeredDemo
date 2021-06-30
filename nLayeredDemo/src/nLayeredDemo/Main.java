package nLayeredDemo;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.entities.concretes.Product;


public class Main {
	

	public static void main(String[] args) {
		
		ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
		
		Product product = new Product(1,2,"�r�n1",12,50);
		productService.add(product);
		
	}
 
}
