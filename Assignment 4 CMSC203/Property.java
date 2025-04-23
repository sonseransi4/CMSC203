/* 
* Class: CMSC203
* Instructor: Khandan Monshi
* Description: Property Manager Property Class with constructors and getters
* Due: 4/22/2025 
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
assignment independently.  
 * I have not copied the code from a student or any source.  
 * I have not given my code to any student. 
 * Print your Name here: Sonse Ransibrahmanakul
*/ 


public class Property {
    private String name = "";
    private String town = "";
    
    private String owner = "";
    private double rent = 0.0;
    private Plot plot;

    public Property() {
        this.plot = new Plot();
    }
//constructor
    public Property(String name, String town, double rent, String owner) {
        this.name = name;
        this.town = town;
        
        this.rent = rent;
        this.owner = owner;
        this.plot = new Plot();
    }
//constructor with x, y, width,depth
    public Property(String name, String town, double rent, String owner, int x, int y, int wid, int dep) {
        this.name = name;
        this.town = town;
        
        this.rent = rent;
        this.owner = owner;
        this.plot = new Plot(x, y, dep, wid);
    }

    public Property(Property otherProperty) {
        this.name = otherProperty.name;
        this.town = otherProperty.town;
        this.rent = otherProperty.rent;
        this.owner = otherProperty.owner;
        this.plot = new Plot(otherProperty.plot);
        
    }
//Getters
    public String getPropertyName() { 
    	return name;
    	}
    
    public String getCity() { 
    	return town; 
    	
    	}
    public String getOwner() {
    	return owner; 
    	}
    
    public double getRentAmount() { 
    	return rent; 
    	}
    
    public Plot getPlot() {
    	return new Plot(plot); 
    	
    	}

    
    public String toString() {
        return name + "," + town + "," + owner + "," + rent;
    }
    
    
    
}
