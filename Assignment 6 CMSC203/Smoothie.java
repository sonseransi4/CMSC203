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
public class Smoothie extends Beverage
{
	int num;
	boolean bool;
	public Smoothie(String n, Size e, int nu, boolean pro){
		enum2 = e;
		num = nu;
		bool = pro;
		name = n;
		enum1 = Type.valueOf("SMOOTHIE");
	}
	 double pricCalc(){
		double proteinPrice = 0.00;
		if (bool == true){
			proteinPrice = 1.50;
		}
		return addSizePrice() + num*.5 + proteinPrice;
	}
	 int getnum(){
		 return num;
	}
	 void setProtein(boolean n){
		bool = n;
	}
	 void setFruits(int nu) {
		num = nu;
	}
	 boolean equals(Smoothie bev){
		if(name != bev.getName() || enum2 != bev.getSize() || enum1 != bev.getType())
			return false;
			return true;
	}
	 boolean getAddProtein(){
		return bool;
	}
	public String toString(){
		return "name: " + name + " size: " + enum2 + " protein: " + bool + " fruits: " + num + " price: " + pricCalc();
	}


}