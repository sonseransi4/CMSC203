/* 
* Class: CMSC203
* Instructor: Khandan Monshi
* Description: Property Manager Plot class that checks for encompassing and overlapping
* Due: 4/22/2025 
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
assignment independently.  
 * I have not copied the code from a student or any source.  
 * I have not given my code to any student. 
 * Print your Name here: Sonse Ransibrahmanakul
*/ 


public class Plot {
    private int x;
    private int y;
    private int dep;
    private int wid;
//constructors
    public Plot() {
        this.x = 0;
        this.y = 0;
        this.dep = 1;
        this.wid = 1;
    }

    public Plot(int x, int y, int depth, int width) {
        this.x = x;
        this.y = y;
        this.dep = depth;
        this.wid = width;
    }

    public Plot(Plot newPlot) {
        this.x = newPlot.getX();
        this.y = newPlot.getY();
        this.dep = newPlot.getDepth();
        this.wid = newPlot.getWidth();
    }
//getters and setters
    public int getX() {
    	return x; 
    }
    
    public int getY() { 
    	return y; 
    	}
    
    public int getDepth() {
    	return dep;
    	}
    
    
    public int getWidth() { 
    	return wid; 
    }

    public void setX(int x) {
    	this.x = x; 
    	}
    public void setY(int y) 
    { 
    	this.y = y;
    	}
    public void setDepth(int depth) { 
    	this.dep = depth;
    	}
    public void setWidth(int width) { 
    	this.wid = width; 
    	}
//checks overlapping, and encompassing
    public boolean overlaps(Plot plot) {
        return !(x + wid <= plot.getX() || x >= plot.getX() + plot.getWidth() || y + dep <= plot.getY() ||
        		y >= plot.getY() + plot.getDepth());   
    }

    public boolean encompasses(Plot plot) {
        return (x <= plot.getX() &&y <= plot.getY() && x + wid >= plot.getX() + plot.getWidth() &&
        		y + dep >= plot.getY() + plot.getDepth());
    }

    public String toString() {
        return x + "," + y + "," + dep + "," + wid;
    }
    
    
    
}
