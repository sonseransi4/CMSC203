/* 
* Class: CMSC203  
* Instructor: Khandan Monshi
* Description: Beverage
* Due: 5/11/25
* I pledge that I have completed the programming  
 * assignment independently. I have not copied the code  
 * from a student or any source. I have not given my code  
 * to any student. 
Print your Name here: Sonse Ransibrahmanakul 
*/ 
public class Coffee extends Beverage{
	boolean shot, syrup = false;
	public Coffee(String name, Size enum2, boolean shot, boolean syr){
		this.name = name;
		this.enum2 = enum2;
		this.shot = shot;
		this.syrup = syr;
		enum1 = Type.valueOf("COFFEE");
	}
	public double pricCalc(){
		double shotPrice = 0;
		double syrupPrice = .50;
		if(shot == true){
			shotPrice = .50;
		}
		
		
		if(syrup == true){
			return addSizePrice() + shotPrice + syrupPrice;
		}
		return addSizePrice() + shotPrice;
	}
	
	
	
	public boolean getExtraSyrup(){
		boolean bool = syrup;
		return bool;
	}
	public void setExtraShot(boolean bool){
		shot = bool;
	}
	public void setExtraSyrup(boolean bool){
		syrup = bool;
	}
	public String toString(){
		String str = "name: " + name + " size: " + enum2 + " shot: " + shot + " syrup: " + syrup + " price: " + pricCalc();
		return str;
	}
	
	
	public boolean equals(Coffee coffee){
		if(!this.name.equals(coffee.name) || this.enum2 != coffee.enum2 || this.enum1 == coffee.enum1 && this.shot != coffee.shot || this.syrup != coffee.syrup)
			return false;
			return true;
	}
	
	public boolean getExtraShot(){
		boolean bool = shot;
		return bool;
	}
	
}