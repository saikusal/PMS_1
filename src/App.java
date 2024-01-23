
public class App {
	
	public static void main(String args[]) {
//				Product product = new Product();
		
//				product.CreateProduct();
		
		
//		ProductTemplate P1 = ()->{
//			
//			
//			System.out.println("Product Created");
//		};
//		
//		P1.CreateProduct();
		
		
//		ProductTemplate P2= new ProductTemplate() {
//
//			@Override
//			public void CreateProduct() {
//				// TODO Auto-generated method stub
//				
//				System.out.println("Product Created");
//			}
//				
//			};
//			
//			P2.CreateProduct();
		
		
//		ProductTemplate P3 = (int a, int b)->a+b;
//		
//		int ProductPrice = P3.ProductPrice(23,45);
//		
//		System.out.println(ProductPrice);
//		
		Electronics E1 = new Electronics();
		E1.printproductTagLine();
		E1.ProductPrice(23, 45);
		
		Clothing C1 = new Clothing();
		C1.printproductTagLine();
		C1.ProductPrice(23,45);
		
		ProductTemplate.ProTemp();
			
		}
		
				
	}


