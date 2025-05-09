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
import java.util.ArrayList;
import java.util.Random;
public class Order implements OrderInterface, Comparable<Order> {
    public int num;
    private int time;
    private Day day;
    private Customer person;
    
    private ArrayList<Beverage> beverages;

    public Order(int time, Day day, Customer customer) {
        this.time = time;
        this.day = day;
        this.person = new Customer(customer);
        this.num = generateOrder();
        
        this.beverages = new ArrayList<>();
        
    }

    
    /**
	 * adds coffee order to this order
	 * @param bevName beverage name
	 * @param size beverage size of type SIZE
	 * @param extraShot true if the coffee beverage has extra shot , false otherwise
	 * @param extraSyrup true if the coffee beverage has extra syrup , false otherwise
	 */
    public void addNewBeverage(String name, Size size, boolean extraShot, boolean extraSyrup) {
        beverages.add(new Coffee(name, size, extraShot, extraSyrup));
    }
    /**
	 * Adds the Smoothie beverage to this order
	 * @param bevName beverage name
	 * @param size beverage size
	 * @param numOfFruits number of fruits added 
	 * @param addProtein true if protein is added, false otherwise
	 */
    public void addNewBeverage(String name, Size size, int fruits, boolean protein) {
        beverages.add(new Smoothie(name, size, fruits, protein));
    }
    
    /**
	 * adds alcohol order to this order
	 * @param bevName beverage name
	 * @param size beverage size
	 */ 
    public void addNewBeverage(String name, Size size) {
        beverages.add(new Alcohol(name, size, isWeekend()));
    }

    public double calcOrderTotal() {
        return beverages.stream().mapToDouble(Beverage::pricCalc).sum();
    }

    public int findNumOfBeveType(Type type) {
        return (int) beverages.stream().filter(b -> b.getType() == type).count();
    }
    
    /**
	 * 
	 * @return true if the day is a weekend day (Saturday or Sunday)
	 */
    public boolean isWeekend() {
        return day == Day.SATURDAY || day == Day.SUNDAY;
    }

    public Beverage getBeverage(int index) {
        return beverages.get(index);
    }

    public int compareTo(Order other) {
        return Integer.compare(this.num, other.num);
    }
    
    
    public int generateOrder() {
        return new Random().nextInt(80001) + 10000;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order #: ").append(num)
          .append(", Time: ").append(time)
          .append(", Day: ").append(day)
          
          .append(", Customer: ").append(person.toString())
          .append("\nBeverages:\n");
        for (Beverage b : beverages) 
        {
            sb.append("- ").append(b.toString()).append("\n");
        }
        return sb.toString();
    }

    int getOrderNo() { 
    	return num; 
    }
    
    public int getOrderTime() {
    	return time; 
    }
    
    
    public Day getOrderDay() { 
    	return day; 
    }
    
    public Customer getCustomer() {
    	return new Customer(person); 
    }
    public int getTotalItems() { 
    	return beverages.size(); 
    }
    
    
    
}