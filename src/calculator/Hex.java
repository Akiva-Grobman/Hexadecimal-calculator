package calculator;

public class Hex {

	private int hex; 
	
	public Hex (String hex) {
		this.hex = 0;
		for (int i = hex.length() - 1; i >= 0; i--) {
			if (hex.charAt(i) >= '0' && hex.charAt(i) <= '9')
				this.hex = (int) (this.hex + (hex.charAt(i) - '0') * Math.pow(16, hex.length() - i - 1));
			else if(hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F')
				this.hex = (int) (this.hex + (hex.charAt(i) - 'A' + 10) * Math.pow(16, hex.length() - i - 1));
		}
		if(hex.length() > 0 && hex.charAt(0) == '-') {
			this.hex *= -1;
			System.out.println(this.hex + " k");
		}
	}
	
 	public Hex(int hex) {
 		this.hex = hex;
	}

 	public Hex multiply(Hex hex) {
		Hex temp = new Hex(this.hex * hex.hex);
		return temp;
	}
 	
	public Hex divide(Hex hex) {
		
		Hex temp = new Hex(this.hex / hex.hex);
		
		return temp;
		
	}
	
	public Hex add(Hex hex) {
		Hex	temp = new Hex (this.hex + hex.hex); 
		return temp;
	}
	
	public Hex substract(Hex hex) {
		Hex	temp = new Hex (this.hex - hex.hex); 
		return temp;
	}
	
	public Hex power(Hex hex) {
		Hex temp = new Hex((int) Math.pow(this.hex, hex.hex));
		return temp;
	}
	
	public Hex root(Hex hex) {
		return null;
	}
	
	private String converter() {
		String hex = "";
		int temp1, temp2 = this.hex;
		if (this.hex == 0) {
			return "0";
		}
		if(this.hex < 0) {
			temp2 = -this.hex;
		}
		while(temp2 > 0) {
			temp1 = temp2 % 16;
			if(temp1 <= 9) {
				hex = temp1 + hex;
			} else {
				switch(temp1) {
					case 10: {
						hex = 'A' + hex;
						break;
					}
					case 11: {
						hex = 'B' + hex;
						break;
					}
					case 12: {
						hex = 'C' + hex;
						break;
					}
					case 13: {
						hex = 'D' + hex;
						break;
					}
					case 14: {
						hex = 'E' + hex;
						break;
					}
					case 15: {
						hex = 'F' + hex;
						break;
					}
				}
			}
			temp2 = temp2 / 16;
		}
		if(this.hex < 0) {
			hex = '-' + hex;
		}
		return hex;
	}
	
 	public String toString() {
 		return converter();
	}
}
