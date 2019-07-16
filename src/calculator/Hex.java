package calculator;

public class Hex {

	private int hex; 
	
	public Hex (String hex)
	{
		int s = hex.length(), z = 1, x, a = 0;
		this.hex = 0;
		
		for (int i = hex.length() - 1; i >= 0; i--) {
			if (hex.charAt(i) >= '0' && hex.charAt(i) <= '9')
				this.hex = (int) (this.hex + (hex.charAt(i) - '0') * Math.pow(16, hex.length() - i - 1));
			else
				this.hex = (int) (this.hex + (hex.charAt(i) - 'A') * Math.pow(16, hex.length() - i - 1));
		}
	}
	
	public Hex multiply(Hex hex) {
		Hex temp = new Hex(this.hex * hex.hex);
		
		return temp;
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
	
	public Hex power(Hex hex) {
		return null;
	}
	
	public Hex root(Hex hex) {
		return null;
	}
	
	public String toString() {
		return "xcvbjkjuy";
	}
}
