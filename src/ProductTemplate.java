

public interface ProductTemplate {
	
	int ProductPrice(int a, int b);
	
	default void printproductTagLine() {
		
		System.out.println("We provide Everything");
		
	}
	
	static void ProTemp() {
		
		System.out.println("Static Method");
	}

}
