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
import java.util.*;

public class BevShop implements BevShopInterface {
    private ArrayList<Order> orders = new ArrayList<>();
    private Order ord;
    private int numAlc;

    public boolean isValidTime(int time) {
        return time >= MIN_TIME && time <= MAX_TIME;
    }

    public int getMaxNumOfFruits() { 
    	return MAX_FRUIT; 
    	}
    public int getMinAgeForAlcohol() { 
    	return MIN_AGE_FOR_ALCOHOL; 
    	}
    public boolean isMaxFruit(int num) { 
    	return num > MAX_FRUIT; 
    	}
    public int getMaxOrderForAlcohol() { 
    	return MAX_ORDER_FOR_ALCOHOL; 
    	}
    public boolean isEligibleForMore() { 
    	return numAlc < MAX_ORDER_FOR_ALCOHOL;
    	}

    public int getNumOfAlcoholDrink() {
        return numAlc;
    }

    public boolean isValidAge(int age) {
        return age >= MIN_AGE_FOR_ALCOHOL;
    }

    public void startNewOrder(int time, Day day, String name, int age) {
        Customer c = new Customer(name, age);
        ord = new Order(time, day, c);
        orders.add(ord);
        numAlc = 0;
    }

    public void processCoffeeOrder(String name, Size size, boolean shot, boolean syrup) {
        ord.addNewBeverage(name, size, shot, syrup);
    }

    public void processAlcoholOrder(String name, Size size) {
        if (isEligibleForMore()) {
            ord.addNewBeverage(name, size);
            numAlc++;
        }
    }

    public void processSmoothieOrder(String name, Size size, int fruits, boolean protein) {
        ord.addNewBeverage(name, size, fruits, protein);
    }

    public int findOrder(int orderNo) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNo() == orderNo)
                return i;
        }
        return -1;
    }

    public double totalOrderPrice(int orderNo) {
        int idx = findOrder(orderNo);
        return idx != -1 ? orders.get(idx).calcOrderTotal() : 0;
    }

    public double totalMonthlySale() {
        return orders.stream().mapToDouble(Order::calcOrderTotal).sum();
    }

    public int totalNumOfMonthlyOrders() {
        return orders.size();
    }

    public Order getCurrentOrder() {
        return ord;
    }

    public Order getOrderAtIndex(int index) {
        return orders.get(index);
    }

    public void sortOrders() {
        orders.sort(Comparator.naturalOrder());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Order o : orders) {
            sb.append(o.toString()).append("\n");
        }
        sb.append("Total Monthly Sale: ").append(totalMonthlySale());
        return sb.toString();
    }
}