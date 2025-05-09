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
public class Alcohol extends Beverage{
	boolean notweekday;
	public Alcohol(String n, Size e, boolean b){
		notweekday = b;
		enum2 = e;
		enum1 = Type.valueOf("ALCOHOL");
		name = n;
	}
	public void setWeekend(boolean bool){
		notweekday = bool;
	}
	public String toString(){
		String str = "name: " + name + " size: " + enum2 + " weekend: " + notweekday + " price: " + pricCalc();
		return str;
	}
	public double pricCalc(){
		double end;
		if (notweekday == true){
			end = .60;
		}
		else{
			end = 0;
		}
		return addSizePrice() + end;
	}
	public boolean notweekday(){
		if(notweekday == true)
			return true;
			return false;
	}
	
	public boolean equals(Alcohol anotherBev){
		if(!this.name.equals(anotherBev.name) || this.enum2 != anotherBev.enum2 || this.enum1 != anotherBev.enum1)
			return false;
			return true;
	}
}