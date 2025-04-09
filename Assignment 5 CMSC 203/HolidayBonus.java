/* 

* Class: CMSC203  

* Instructor: Huseyin Aygun

* Description: Holiday Bonus

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming assignment  

* independently. I have not copied the code from a student or   * any source. I have not given my code to any student. 

* Print your Name here: Sonse Ransibrahmanakul

*/ 
//Holiday Bonus Class
public class HolidayBonus {
    public static double[] calculateHolidayBonus(double[][] list){
        double[] row = new double[list.length];
        int index = 0;
        for (double[] part : list){
            if (part.length > index){
                index = part.length;}}
        for (int x = 0; x < list.length; x++){
            row[x] = 0;}
        for (int x = 0; x < index; x++){
            int biggest = TwoDimRaggedArrayUtility.getHighestInColumnIndex(list, x);
            int smallest = TwoDimRaggedArrayUtility.getLowestInColumnIndex(list, x);
            for (int part = 0; part < list.length; part++){
                if (x >= list[part].length) {
                    continue;}
                else if (part == biggest){
                    row[part] += 5000;} 
                else if (part == smallest){
                    row[part] += 1000;} 
                else{
                    row[part] += 2000;}}}
        return row;}
    public static double calculateTotalHolidayBonus(double[][] list){
        double sum = 0;
        for (double doub : calculateHolidayBonus(list)){
            sum += doub;}
        return sum;}}
