public class AutoBoxing {
	public static void main(String[] args){
		
		Integer x = new Integer(666); // empacotado
		int y = x.intValue(); // desempacotar
		y++; // incrementa
		x = new Integer(y); // reempacotar
		System.out.println(x.intValue());
		
		Integer z = 555;
		z++; // desempacota, incrementa e reempacota
		System.out.println(z);
		
		Boolean v = new Boolean("true");
		if(v){
			System.out.println(v);
		}
		
		
	}
}