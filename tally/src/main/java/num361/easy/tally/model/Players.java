package num361.easy.tally.model;

public class Players {
	
	//player names
	private Integer a = 0;
	private Integer b = 0;
	private Integer c = 0;
	private Integer d = 0;
	private Integer e = 0;
	
	//Constructors
	public Players() {}
	
	public Players(Integer a, Integer b, Integer c, Integer d, Integer e) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}
	
	//Getters and Setters
	public Integer getA() {
		return a;
	}
	
	public void setA(Integer a) {
		if (a <= 1 || a >= -1) {
			this.a = a;
		}else {
			System.out.println("Score can only increment/decrement by 1");
		}
	}
//-----------------------------	
	public Integer getB() {
		return b;
	}
	
	public void setB(Integer b) {
		if (b <= 1 || b >= -1) {
			this.b = b;
		}else {
			System.out.println("Score can only increment/decrement by 1");
		}
	}
//------------------------------	
	public Integer getC() {
		return c;
	}
	
	public void setC(Integer c) {
		if (c <= 1 || c >= -1) {
			this.c = c;
		}else {
			System.out.println("Score can only increment/decrement by 1");
		}
	}
//-------------------------------	
	public Integer getD() {
		return d;
	}
	
	public void setD(Integer d) {
		if (d <= 1 || d >= -1) {
			this.d = d;
		}else {
			System.out.println("Score can only increment/decrement by 1");
		}
	}
//------------------------------
	public Integer getE() {
		return e;
	}
	
	public void setE(Integer e) {
		if (e <= 1 || e >= -1) {
			this.e = e;
		}else {
			System.out.println("Score can only increment/decrement by 1");
		}
	}
	
		
	
}
