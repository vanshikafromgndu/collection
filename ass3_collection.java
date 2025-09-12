package collection_ass;
import java.util.*;
public class ass3_collection {
public static void main(String[] args) {
	/* Assignment 3:
		Create object of ArrayList and add
		6 fruits
		2 cities
		2 hobbies
		do following operations:
		- print the arraylist
		- remove one hobby
		- search("cricket")
		- remove 1 city & remove 1 fruit
		- print 4th & 6th element
		- replace the hobby "Singing" with new hobby "Dancing"
		- reverse the arraylist
		- add "Kerala" at 4th position and add "Mango" at 2nd position */
	
	ArrayList<String>A1=new ArrayList<>();
	
	//add 6 fruits
	A1.add("mango");
	A1.add("Apple");
	A1.add("Banana");
	A1.add("Orange");
	A1.add("Gvava");
	A1.add("Pineapple");
	
	//add 2 cities
	A1.add("Delhi");
	A1.add("Mumbai");
	
	//add 2 hobbies
	A1.add("Cricket");
	A1.add("Singing");
	
	//search for cricket
	System.out.println("do A1 contain cricket:"+A1.contains("cricket"));
	
	//remove any city and fruit
	A1.remove("Delhi");
	A1.remove("Apple");
	System.out.println("after removing A1"+A1);
	
	//print 4th and 6th element
	System.out.println("4th element:"+A1.get(3)+"6th element:"+A1.get(5));
	
	//replace singing to dancing
	int index=A1.indexOf("Singing");
	if(index!=-1)
	{
		A1.set(index, "Dancing");
	}
	
	System.out.println("after replacing singing with dancing:"+A1);

	  //Reverse the ArrayList
	System.out.println("reverse array:"+A1.reversed());
	
	//Add "Kerala" at 4th position (index 3)
	if (A1.size() >= 3) {
        A1.add(3, "Kerala");
    }
	
	//Add "Mango" at 2nd position (index 1)
	if (A1.size() >= 1) {
       A1.add(1, "Mango");
    }
	System.out.println("A1:"+A1);
}
}
