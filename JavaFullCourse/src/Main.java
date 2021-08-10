  
import java.util.Scanner;  //ACCEPTING USER INPUT
import javax.swing.JOptionPane;	//CREATING SIMPLE GUI - 5 

import java.lang.reflect.Array;
import java.util.ArrayList; // import for Array list - 18
import java.util.Random; //GENERATE RANDOM NUMBERS - 7







public class Main {
	
	

	public static void main(String[] args) {
		

		System.out.println("I love Pizza");
		
		//COMMENT
		
		/*
		 * 
		 * MULTI LINE COMMENT
		 */

//-1		VARIABLES	VARIABLES 	VARIABLES 	VARIABLES 	VARIABLES 	VARIABLES 	VARIABLES 	VARIABLES 	VARIABLES 
		
//		Declaration
		//int x;
		
		
//		Assignment
		//x = 123;
		
		
//		Initialisation
		//int x = 123;
		
		
//		DECLARING LONG, FLOAT, Boolean, DOUBLE, CHAR  VARIABLES	**must have a Capital L at the end of integers
		//long x = 234533455663345664L;
		//float y = 3.14f
		//boolean z = true;
		//double a = 2.14;
		//char symbol = '@'
		
		
		
		
		
		
		
//-2		SWAPPING TWO VARIABLES	
		/*
		 * String x = "Water"; String y = "Coke"; String temp;
		 * 
		 * //e.g variable swap temp = x; x = y; y = temp;
		 * 
		 * 
		 * 
		 * System.out.println("X: " +x); System.out.println("Y: " +y);
		 */
		
		
		
		
		
		
//-3		ACCEPTING USER INPUT:	SCANNER 
		//import java.util.Scanner; - import command, write at top of code before public class ...
		
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Enter your name ...."); String user_name =
		 * scanner.nextLine();
		 * 
		 * System.out.println("How old are you?"); int user_age = scanner.nextInt();
		 * 
		 * //can't use scanner.nextLine after scanner.nextInt... use scanner.nextLine();
		 * to clear scanner before requesting new string from user ...
		 * scanner.nextLine();
		 * 
		 * System.out.println("Enter your pkace of birth ...."); String place_name =
		 * scanner.nextLine();
		 * 
		 * 
		 * 
		 * System.out.println("your name is " +user_name +". You are " +user_age
		 * +"yrs old and born in " +place_name);
		 */
		
		
//-4		EXPRESSIONS - A combination of OPERANDS (values, variables, numbers, quantity) and OPEATORS (+ - * /)
		
		/*
		 * int friends = 10;
		 * 
		 * //Increment by 1 friends++;
		 * 
		 * 
		 * //Decrement by 1 friends--;
		 * 
		 * 
		 * //modulus - prints remainder o division friends = friends % 3;
		 * 
		 * 
		 * //cast integer division to print decimal double new_friends = 20;
		 * 
		 * new_friends = (double) new_friends / 3;
		 * 
		 * System.out.println(new_friends);
		 */
		
		
		
//-5		SIMPLE GUI APPLICATION
		
		/*
		 * String name =JOptionPane.showInputDialog("Enter your name");
		 * JOptionPane.showMessageDialog(null, "Hello "+name);
		 * 
		 * 
		 * int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		 * //convert string to INT JOptionPane.showMessageDialog(null, "Hello "+name +
		 * ", you are "+age+ " years old");
		 * 
		 * 
		 * Double height =
		 * Double.parseDouble(JOptionPane.showInputDialog("Enter your height in cm"));
		 * //convert string to Double JOptionPane.showMessageDialog(null, "Hello "+name
		 * + ", you are "+age+ " years old and "+height+ "cm tall" );
		 */
		
		
//-6		USING MATH METHODS
		//Math.min. Math.max; .sqrt .abs[removes minus sign] .floor
		
		
		
		/*
		 * //FIND THE HYPOTENUSE OF TRIANGLE //z = (x^2) * (y^2)
		 * 
		 * double x; double y; double z;
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * 
		 * System.out.println("Enter side x: "); x = scanner.nextDouble();
		 * 
		 * 
		 * System.out.println("Enter side y: "); y = scanner.nextDouble();
		 * 
		 * z = ( (x*x) + (y*y) );
		 * 
		 * 
		 * 
		 * System.out.println(Math.sqrt(z) );
		 * 
		 * scanner.close();
		 */
		
		
		
//-7		GENERATING RANDOM NUMBERS
		/*
		 * Random random = new Random();
		 * 
		 * //int x = random.nextInt(); //Returns range -2billion to + 2billion //int x =
		 * random.nextInt(6); //Returns index 0 - 5 //int x = random.nextInt(6)+1;
		 * //Returns index 1 - 6
		 * 
		 * //Double y = random.nextDouble(); // Returns values between 0 & 1
		 * 
		 * //boolean z = random.nextBoolean(); //Returns True or False
		 * 
		 * 
		 * System.out.println(x); System.out.println(y); System.out.println(z);
		 */
		
		
//-8		IF STATEMENTS
		//PERFORMS A BLOCK OF CODE IF A CONDITION IS MET
		
		/*
		 * int age = 13;
		 * 
		 * if (age == 75) { System.out.println("Ok Boomer!");
		 * 
		 * 
		 * } else if (age >= 18) // to check condition before reaching else statement
		 * 
		 * { System.out.println("you are an adult.");
		 * 
		 * } else if (age >= 13) { System.out.println("you are a teenager");
		 * 
		 * } else { System.out.println("you are not an adult"); }
		 */
		
		
		
		
		
//-9		SWITCHES - statement that allows a variable to be tested for equality against a list of values.
		
		//Days of the week
		
		/*
		 * String day = "Friday";
		 * 
		 * switch(day) { case "Sunday": System.out.println("It is Sunday!"); break; //
		 * stops code block when condition is met
		 * 
		 * case "Monday": System.out.println("It is Monday!"); break;
		 * 
		 * case "Tuesday": System.out.println("it is Tuesday!"); break;
		 * 
		 * case "Wednesday": System.out.println("It is Wednesday"); break;
		 * 
		 * case "Thursday" : System.out.println("It is Thursday!"); break;
		 * 
		 * case "Friday": System.out.println("It is Friday!"); break;
		 * 
		 * case "Saturday" : System.out.println("It is Saturday!"); break;
		 * 
		 * default: System.out.println("This is not a day!"); // Prints if case doesn't
		 * match }
		 */
		
		
		
		
//-10		logical operators = used to connect two or more 

		/*
		 * // && = ( AND ) both conditions must be true // || = ( OR ) either condition
		 * must be true // ! = ( NOT ) reverses boolean value of condition
		 * 
		 * 
		 * //&& int temp = 25;
		 * 
		 * if (temp>30) { System.out.println("It is hot outside"); } else if (temp>=20
		 * && temp <=30) { System.out.println("It is warm outside"); } else {
		 * System.out.println("it is cold outside"); }
		 * 
		 * 
		 * 
		 * 
		 * // || Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("you are playing a game! Press q or Q to quit"); String
		 * response = scanner.next();
		 * 
		 * if (response.equals("q") || response.equals("Q")) {
		 * System.out.println("You quit the game");
		 * 
		 * } else { System.out.println("You are still playing the game!"); }
		 * 
		 * scanner.close();
		 * 
		 * 
		 * 
		 * // ! System.out.println("you are playing a game! Press q or Q to quit");
		 * String response1 = scanner.next();
		 * 
		 * if ( !response1.equals("q") && !response1.equals("Q")) {
		 * System.out.println("You are still playing the game!");
		 * 
		 * } else { System.out.println("You quit the game"); }
		 * 
		 * scanner.close();
		 */
		
		
	
		
//-11		WHILE LOOP // DO WHILE - Executes a block of code provided the conditon remains true
		
		/*
		 * Scanner scanner = new Scanner(System.in); 
		 * String name = "";
		 * 
		 * 
		 * while (name.isBlank()) { 
		 * System.out.println("Enter your name"); 
		 * name = scanner.nextLine(); }
		 * 
		 * System.out.println("Hello "+name);
		 */
		
		
		/*
		 * //Do WHILE lOOP - perform block of code at least once before checking
		 * condition Scanner scanner = new Scanner(System.in); String name = "";
		 * 
		 * do { System.out.println("Enter your name: "); name = scanner.nextLine();
		 * 
		 * } while (name.isBlank());
		 * 
		 * System.out.println("Hello "+name);
		 */
		
		
		
		
//-12		FOR LOOP - executes a block of cde for a limited amount of time
		
		/*
		 * for(int i = 10; i>0; i-=3) { System.out.println(i); }
		 * 
		 * System.out.println("Happy new year");
		 * 
		 * 
		 * //OR
		 * 
		 * for (int i = 0; i >=0;) { System.out.println(i); i--; }
		 */
		
		
		
		
		
//-13		NESTED LOOP - Loop inside a Loop
		//EXAMPLE: create a nestd loop with rows and colums 
		
		/*
		 * int rows; int columns; String symbol =""; //or char data type
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * 
		 * 
		 * System.out.println("Enter number of rows: "); rows = scanner.nextInt();
		 * 
		 * System.out.println("Enter number of columns: "); columns = scanner.nextInt();
		 * 
		 * 
		 * System.out.println("Enter symbol: "); symbol = scanner.next();
		 * 
		 * 
		 * scanner.close();
		 * 
		 * 
		 * for (int i = 1; i <= rows; i++) { System.out.println();
		 * 
		 * for(int j = 1; j<= columns; j++ ) { System.out.print(symbol); } }
		 */
		
		
		
//-14		ARRAYS - Uses to store mulyiple values in one vaiable; can only e the same data type
		
		/*
		 * String[] cars = {"Toyota", "Tesla", "Ford"};
		 * 
		 * System.out.println(cars[0]); //Toyota
		 * 
		 * cars[0] = "Toyota V2"; //changes value of cars[0] index 0
		 * 
		 * 
		 * //Another way to set size of array String[] carsARRAY = new String[3];
		 * 
		 * carsARRAY[0]= "Toyota"; carsARRAY[1]= "G.E"; carsARRAY[2]= "Tesla";
		 * 
		 * 
		 * 
		 * 
		 * //Iteratng over an array for(int i=0; i<carsARRAY.length; i++) {
		 * System.out.println(carsARRAY[i]); }
		 */
		
		
		
		
		
//-15		2D Array - Multi-Dimensional Array. - An array of arrays
		
		/*
		 * //METHOD 1 String[][] cars = new String[3][3];
		 * 
		 * cars[0][0] = "Camero"; cars[0][1] = "Covette"; cars[0][2] = "Silverado";
		 * cars[1][0] = "Mustang"; cars[1][1] = "Ranger"; cars[1][2] = "F-150";
		 * cars[2][0] = "Ferrari"; cars[2][1] = "Lambo"; cars[2][2] = "Tesla";
		 * 
		 * 
		 * 
		 * 
		 * //METHOD 2 String[][] carsType2 ={ { "Camero", "Covette", "Silverado"}, {
		 * "Mustang", "Ranger", "F-150"}, { "Ferrari", "Lambo", "Tesla"} };
		 * 
		 * System.out.println(carsType2[0][1]);
		 * 
		 * 
		 * //print 2D array for(int i=0; i<cars.length; i++) { System.out.println();
		 * 
		 * for(int j=0; j<cars[i].length; j++) { System.out.print(cars[i][j] +" "); } }
		 */
	    
		
		
//-16		STRING METHODS - has access to useful methods
		//String name = "Book";
		
		//boolean result = name.equalsIgnoreCase("book");
		//int result = name.length();
		//char result = name.charAt(0);
		//int result = name.indexOf("k");
		//boolean result = name.isEmpty();
		//String result = name.toUpperCase();
		//String reult = name.toLowerCase();
		//String result = name.trim();
		//String result = name.replace('k', 'm');
		
		//WRITE VARIABLE NAME FOLLOWED BY A DOT TO REVEAL OTHER STRING METHODS 
		
		
		
		
		/* System.out.println(result); */
		
		
		
		
		
//-17		WRAPPER CLASSES - they provide a way to use primitive data types as reference data types (e.g in ArrayList). boolean(Primitivve) for Boolean (wrapper)
		/*
		 * //LEARN AUTO-BOXING && UNBOXING
		 * 
		 * //autoboxing - the automatic conversion that the Java Compiler makes between
		 * the primitive types and their corresponding object wrapper classes ( e.g.
		 * Boolean auto-converts to boolean primitive type) //unboxing - the reverse of
		 * autoboxing. Automatic conversion of wrapper class to primitic types (e.g.
		 * boolean primitive type to Boolean wrapper class)
		 * 
		 * 
		 * //wrapper class [SLOWER] || Primiticve type [FASTER] Boolean a = true; //
		 * unboxes to boolean a = true Character b = '@'; // unboxes to Char b = '@'
		 * Integer c = 123; //unboes to int c = 123 Double d = 3.14; // ..double String
		 * e = "Bro";
		 * 
		 * //Reference daatypes have access to datatypes methods e.g. a. {control +
		 * spacear}
		 * 
		 * //sample if(a==true) { System.out.println("This is true"); }
		 */
		
		
		
//-18		ARRAYLIST IN JAVA
		
		/*
		 * //create an arrayList
		 * 
		 * //wrapper class [integer, String, Double, Character, Boolean etc ]
		 * ArrayList<String> food = new ArrayList<String>();
		 * 
		 * 
		 * food.add("pizza"); food.add("hamburger"); food.add("hotdog");
		 * 
		 * 
		 * food.set(0, "sushi"); //changes value at index 0 food.remove(2); //removes
		 * index 2 food.clear(); //empties the arrayList
		 * 
		 * 
		 * //return array values for(int i = 0; i<food.size(); i++) {
		 * System.out.println(food.get(i)); }
		 */
		
		
		
		
//-19		2D ARRAYLIST - List of arraylists
		
		//		//normal arrayList
		//		ArrayList<String> produceList =  new ArrayList<String>();
		//		produceList.add("Tomatoes");
		//		produceList.add("zucchini");
		//		produceList.add("peppers");
		//		
		//		
		//		ArrayList<String> drinkList =  new ArrayList<String>();
		//		drinkList.add("malt");
		//		drinkList.add("fanta");
		//		drinkList.add("soda");
		//		
		//		
		//		ArrayList<String> bakeryList =  new ArrayList<String>();
		//		bakeryList.add("flour");
		//		bakeryList.add("icing");
		//		bakeryList.add("sugar");
		//		
		//		
		//		//CREATING 2D ARRAYLIST
		//		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
		//		
		//		groceryList.add(produceList);
		//		groceryList.add(drinkList);
		//		groceryList.add(bakeryList);
		//		
		//		
		//		//print
		//		System.out.println(groceryList.get(0).get(1));
		
	
		
		
//-20		FOR EACH LOOP or ENHANCED FOR LOOP- transvering technique to iterate through the elements in an array/collection, less steps, more readable but less fexible.
		
		
		//		//e.g
		//		
		//		//String[] animals = {"cat", "dog", "rat", "cat"}; //array 
		//		
		//		
		//		ArrayList<String> animals = new ArrayList<String>(); //example with array list
		//		
		//		animals.add("cat");
		//		animals.add("rat");
		//		
		//		
		//		
		//		//FOR EACH LOOP
		//		for(String i : animals ) {
		//			System.out.println(i);
		//		}
		//		
		
		
		
	
	}
	
	
//-21		METHODS - a block of code tat is executed when called upon ...usually outside the main method
	
		//	static void hello(String name) {
		//		System.out.println("Hello " +name);
		//		
		//		//call in main with hello("sample_name")
		//}
	
	
	
//-22	METHOD WITH RETURN STATEENT
		//	static int add(int x, int y ) {
		//		
		//		int z = x+ y;
		//		return z;
		//		
		//	}
	
	
}
