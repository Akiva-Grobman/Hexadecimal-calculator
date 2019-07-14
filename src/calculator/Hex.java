package calculator;

public class Hex {

	private  String temp;
	private int hex; 
	
	public Hex (String hex)
	{
		int s = hex.length(), z = 1, x, a = 0;
		
		 for (int i = 0; i < hex.length(); i++) {

			x = hex.charAt(hex.length()-z);
		
			if(x >= 'A' && x <= 'F')
				x = x - 'A' + 10;
			if(x >= '0' && x >= '9' )
			    x = x - '0';
		
			this.hex = x * (int)Math.pow(16, a);
			a++;
			
			z++;
		}

		
		
	}
	
	public Hex multiply(Hex hex) {
		Hex temp = new Hex(this.hex * hex.hex);
		
		return temp;
	}
	
	public Hex(Hex hex)
	{
		this.hex = hex.hex;
	}
	
	
 	public Hex(int hex) {
 		this.hex = hex;
	}

	public Hex divide(Hex hex2) {
		
		Hex temp = new Hex (Math.floorDiv(this.hex, hex));
		
		return temp;
	}
	
	public Hex add(Hex hex2) {
		
	Hex	temp = new Hex (this.hex + hex); 
				
		return temp;
	}
	
	public Hex substract(Hex hex2) {
		
		Hex	temp = new Hex (this.hex - hex); 
		
		return temp;
	}
	
	public String toString( String temp) {
		int x;
		return this.temp = temp;
				  
				
				
				
	}
	
	
	
	
	
	
	
}
