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
public class Customer{
	private String str;
	private int years;
	public Customer(Customer c){
		str = c.getName();
		years = c.getAge();
	}
	public Customer(String n, int y){
		str = n;
		years = y;
	}
	void setAge(int y){
		years = y;
	}
	void setName(String s){
		str = s;
	}
	public String toString(){
		return "name: " + str + "age: " + years;
	}
	int getAge(){
		return years;
	}
	String getName(){
		return str;
	}

}