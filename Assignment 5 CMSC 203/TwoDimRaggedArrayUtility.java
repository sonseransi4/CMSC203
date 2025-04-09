/* 

* Class: CMSC203  

* Instructor: Huseyin Aygun

* Description: TwoDimRaggedArrayUtility

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming assignment  

* independently. I have not copied the code from a student or   * any source. I have not given my code to any student. 

* Print your Name here: Sonse Ransibrahmanakul

*/ 
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
//public class
public class TwoDimRaggedArrayUtility{
	public static double getLowestInArray(double[][] list){
		double tiniest = 10000;
		for (int x = 0; x < list.length; x++){
			for (int y = 0; y < list[x].length; y++){
				if (list[x][y] < tiniest){
					tiniest = list[x][y];}}}
		return tiniest;}
	public static void writeToFile(double[][] list, File txt) throws FileNotFoundException{
	    PrintWriter printwriter = new PrintWriter(txt);
	    for (int x = 0; x < list.length; x++){
	    	for (int y = 0; y < list[x].length; y++){
	    		printwriter.print(list[x][y]);
	    		printwriter.print(" ");}
	    	printwriter.print("\n");}
	    printwriter.close();}
	public static double getTotal(double[][] list){
	    double sumtotal = 0;
	    for (int x = 0; x < list.length; x++){
	    	for (int y = 0; y < list[x].length; y++){
	    		sumtotal += list[x][y];}}
	    return sumtotal;}
	public static double getAverage(double[][] list){
	    double divisor = 0;
	    for (int x = 0; x < list.length; x++){
	    	for (int y = 0; y < list[x].length; y++){
	    		divisor++;}}
	    return getTotal(list)/divisor;}
	public static double[][] readFile(File txt) throws FileNotFoundException{
		Scanner keyboard = new Scanner(txt);
		int lines = 0;
		while (keyboard.hasNextLine()){
			lines++;
			keyboard.nextLine();}
		keyboard.close();
		double[][] list = new double[lines][];
		Scanner boardkey = new Scanner(txt);
		for (int x = 0; x < list.length; x++){
			String temp = boardkey.nextLine();
			String[] tempsplit = temp.split(" ");
			list[x] = new double[tempsplit.length];
			for (int y = 0; y < list[x].length; y++){
				list[x][y] = Double.valueOf(tempsplit[y]);}}
		boardkey.close();
		return list;}
	public static double getRowTotal(double[][] list, int indice){
	    double sumtotal = 0;
	    for (double temp : list[indice]){
	    	sumtotal += temp;}
	    return sumtotal;}
	public static double getHighestInRow(double[][] list, int indice){
	    double biggest = 0;
	    for (int x = 0; x < list.length; x++){
	    	if (list[indice][x] > biggest){
	    		biggest = list[indice][x];}}
	    return biggest;}
	public static int getHighestInRowIndex(double[][] list, int indice){
		double biggest = 0;
		int marker = 0;
	    for (int x = 0; x < list.length; x++){
	    	if (list[indice][x] > biggest){
	    		biggest = list[indice][x];
	    		marker = x;}}
	    return marker;}
	public static double getLowestInRow(double[][] list, int indice){
		double tiniest = 10000;
	    for (int x = 0; x < list.length; x++){
	    	if (list[indice][x] < tiniest){
	    		tiniest = list[indice][x];}}
	    return tiniest;}
	public static int getLowestInRowIndex(double[][] list, int indice){
		double tiniest = 10000;
		int marker = 0;
	    for (int x = 0; x < list.length; x++){
	    	if (list[indice][x] < tiniest){
	    		tiniest = list[indice][x];
	    		marker = x;}}
	    return marker;}
	public static double getLowestInColumn(double[][] list, int indice){
		double tiniest = 0;
		int lines = 0;
		while (tiniest == 0){
			if(list[lines].length > indice){
				tiniest = list[lines][indice];}
			lines++;}
		while(lines < list.length){
			if (list[lines].length > indice){
				if (list[lines][indice] < tiniest){
					tiniest = list[lines][indice];}}
			lines++;}
		return tiniest;}
	public static double getHighestInColumn(double[][] list, int indice){
		double biggest = 0;
		int lines = 0;
		while (biggest == 0){
			if (list[lines].length > indice){
				biggest = list[lines][indice];}
			lines++;}
		while(lines < list.length){
			if (list[lines].length > indice){
				if(list[lines][indice] > biggest){
					biggest = list[lines][indice];}}
			lines++;}
		return biggest;}
	public static double getHighestInArray(double[][] list){
		double biggest = 0;
		for (int x = 0; x < list.length; x++){
			for (int y = 0; y < list[x].length; y++){
				if (list[x][y] > biggest){
					biggest = list[x][y];}}}
		return biggest;}
	public static int getHighestInColumnIndex(double[][] list, int indice){
		double biggest = 0;
		int lines = 0;
		int marker = 0;
		while (biggest == 0){
			if (list[lines].length > indice){
				biggest = list[lines][indice];
				marker = lines;}
			lines++;}
		while(lines < list.length){
			if (list[lines].length > indice){
				if(list[lines][indice] > biggest){
					biggest = list[lines][indice];
					marker = lines;}}
			lines++;}
		return marker;}
	public static int getLowestInColumnIndex(double[][] list, int indice){
		double tiniest = 0;
		int lines = 0;
		int marker = 0;
		while (tiniest == 0){
			if(list[lines].length > indice){
				tiniest = list[lines][indice];
				marker = lines;}
			lines++;}
		while(lines < list.length){
			if (list[lines].length > indice){
				if (list[lines][indice] < tiniest){
					tiniest = list[lines][indice];
					marker = lines;}}
			lines++;}
		return marker;}
	public static double getColumnTotal(double[][] list, int indice){
	    double sumtotal = 0;
	    int lines = 0;
	    while (lines < list.length){
	    	if (list[lines].length - 1 >= indice){
	    		sumtotal += list[lines][indice];}
	    	lines++;}
	    return sumtotal;}}

