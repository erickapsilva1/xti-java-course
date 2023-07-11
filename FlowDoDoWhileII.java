import java.util.ArrayList;
import java.util.Scanner;

public class FlowDoDoWhileII {
	public static void main(String[] args){
		
		ArrayList<String> products = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("List your products. Type END to exit: ");
		
		String product;

		while(!"FIM".equals(product = scanner.nextLine().toUpperCase())){
			products.add(product);
		}
		
		System.out.println(products.toString());
	}
}