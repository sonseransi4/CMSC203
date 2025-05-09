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
abstract class Beverage{
	String name;
	Type enum1;
	
	Size enum2;
	abstract double pricCalc();
	boolean equals(Beverage other){
		if(name!=other.name||this.enum1!=other.enum1||this.enum2!=other.enum2){
			return false;}
		else{
			return true;
		}
		}
	double addSizePrice(){
		if(Size.valueOf("SMALL")==enum2)
		{
			double basePrice=getBasePrice();
		return basePrice;
		}
		else if(Size.valueOf("MEDIUM")==enum2)
		{
			double mediumPrice=getBasePrice()+.5;
		return mediumPrice;
		}
		else
		{
			return getBasePrice()+1;
		}
		}
	double getBasePrice()
	{
		final double base=2.0;
	double finalPrice=base;
	return finalPrice;
	}
	
	void setSize(Size sizeParam)
	{
		this.enum2=sizeParam;
	}
	
	void setType(Type typeParam)
	{
		this.enum1=typeParam;
	}
	
	String getName()
	{
		String nm=name;return nm;
	}
	
	Size getSize()
	{
		Size sz=enum2;return sz;
	}
	
	
	Type getType()
	{
		Type tp=enum1;return tp;
	}
	void setName(String newName)
	{
		name=newName;
	}
	public String toString(){
		String str="Name:"+name+" Size:"+enum2+" Type:"+enum1;
		String finalStr=str;
		return finalStr;
	}
	
	
	
	
}
