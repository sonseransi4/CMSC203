
/**
 * Represents Management Company Object
 * 
 * @author Farnaz Eivazi, 7/8/2022
 *
 */

//Although ManagementCompany.java was already supplied,
//Changed up some methods like the toString,GetPropertiesCount, and addProperty
//to get it working with the JUnit GFA Test

public class ManagementCompany {
	
    private final int MAX_PROPERTY = 5;
    private final int MGMT_WIDTH = 10;
    private final int MGMT_DEPTH = 10;
    private String name;
    private String taxID;
    private double mgmFee;
    private Property[] properties;
    private Plot plot;
    /**
	 * Creates a ManagementCompany object using empty strings, 
	 * creates a default Plot with maximum width and depth and 
	 * it initializes the properties array.
	 * 
	 */
    
    public ManagementCompany() {
        name = "";
        
        taxID = "";
        mgmFee = 0;
        properties = new Property[MAX_PROPERTY];
        plot = new Plot(0, 0, MGMT_DEPTH, MGMT_WIDTH);
    }

    public ManagementCompany(String name, String taxID, double mgmFee) {
        this();
        this.name = name;
        this.taxID = taxID;
        this.mgmFee = mgmFee;
    }
    /**
	 * Creates a ManagementCompany object using the given values
	 * creates a Plot using the given values and 
	 * it initializes the properties array. 
	 * This constructor should call an appropriate existing constructor.
	 * 
	 * @param name   	management Company name
	 * @param taxID  	tax Id
	 * @param mgmFee 	management Fee
	 */
    public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
        this.name = name;
        
        this.taxID = taxID;
        this.mgmFee = mgmFee;
        this.properties = new Property[MAX_PROPERTY];
        this.plot = new Plot(x, y, depth, width);
    }

    public int addProperty(Property property) 
    {
        if (property == null) return -2;

        for (int i = 0; i < MAX_PROPERTY; i++) 
        {
            if (properties[i] == null) {
                Plot propPlot = property.getPlot();

                if (!plot.encompasses(propPlot))
                    return -3;

                for (int j = 0; j < MAX_PROPERTY; j++) 
                {
                    if (properties[j] != null && properties[j].getPlot().overlaps(propPlot))
                        return -4;
                }

                properties[i] = new Property(property);
                return i;
            }
        }
        return -1;
    }

    public int addProperty(String name, String city, double rent, String owner) {
        return addProperty(new Property(name, city, rent, owner));
    }
    /**
	 * Adds a new property to the properties array, this method should call an appropriate existing overloaded method.
	 * 
	 * @param name  	property name
	 * @param city  	city where the property is located
	 * @param rent  	rent amount
	 * @param owner 	the owner's name
	 * @param x     	The x coordinate of the plot
	 * @param y     	The y coordinate of the plot
	 * @param width 	The width coordinate of the plot
	 * @param depth 	The depth coordinate of the plot
	 * 
	 * @return -1 if the array is full, 
	 * -2 if the Property object is null,
	 * -3 if management company does not encompass the property plot, 
	 * -4 if property plot overlaps ANY of properties in array, 
	 * otherwise return the index of the array where the property was added.
	 */
    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
        return addProperty(new Property(name, city, rent, owner, x, y, width, depth));
    }

    public Property getHighestRentProperty()
    {
        Property highest = null;
        double maxRent = 0;

        for (Property p : properties) {
            if (p != null && p.getRentAmount() > maxRent) {
                maxRent = p.getRentAmount();
                highest = p;
            }
        }

        return highest;
    }

    public double totalRent()
    {
        double total = 0;
        for (Property p : properties) 
        {
            if (p != null) total += p.getRentAmount();
        }
        return total;
    }

    public boolean isPropertiesFull() 
    {
        for (Property p : properties) 
        {
            if (p == null)
            	return false;
        }
        return true;
    }

    public int getPropertiesCount() {
        int count = 0;
        for (Property p : properties) 
        {
            if (p != null) count++;
        }
        return count;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("List of the properties for ").append(name).append(", taxID: ").append(taxID).append("\n");
        sb.append("______________________________________________________\n");

        for (Property p : properties) 
        {
            if (p != null) 
            {
                sb.append(p.toString()).append("\n");
            }
        }

        sb.append("______________________________________________________\n");
        sb.append("\n");
        sb.append(" total management Fee: ").append(String.format("%.2f", (mgmFee / 100) * totalRent()));
        return sb.toString();
    }

    public Plot getPlot() {
        return new Plot(plot);
    }

    public String getName() {
        return name;
    }
    
    
    
    
}
