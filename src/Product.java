
public class Product implements ProductTemplate {

	public void CreateProduct() {
		// TODO Auto-generated method stub
		System.out.println("Product Inserted");
		
		System.out.println("Product Created");
		
	}

	@Override
	public int ProductPrice(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	
	
}
