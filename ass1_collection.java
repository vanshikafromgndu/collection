package collection_ass;
import java.util.*;
public class ass1_collection {
public static void main(String[] args) {
	/* Assignment 1:
		create 2 objects of the set interface in same class
		LinkedHashSet (L1 & L2)
		L1  - 1st object will be ( add two int, two float ,two char, one boolean)
		L2  - 2nd object will be be Integer type only and take 10 different random numbers from user console.
		(a) add two more elements
		(b) remove any elemnt
		(c) check if any string is presen or not
		(d) Check if any value of "5" present or not
		(e) clear the set */
	
	LinkedHashSet<Object>l1=new LinkedHashSet<>();
	l1.add(20);
	l1.add(50);
	
	l1.add("hello");
	l1.add("bye");
	
	l1.add(3.14f);
    l1.add(6.28f);
    
    l1.add(true);
    
    l1.add('A');
    l1.add('B');
    
    System.out.println("l1 contains:"+l1);
    
    LinkedHashSet<Object>l2=new LinkedHashSet<>();
    Scanner A=new Scanner(System.in);
    System.out.println("plz enter 10 unique numbers:");
    while(l2.size()<10)
    {
    	System.out.println("enter number"+(l2.size()+1)+":");
    	int num=A.nextInt();
    	l2.add(num);
    }
    l2.add("hello");
    System.out.println("Initial L2 contents: " + l2);
    
    // add two more elements
    l2.add(32);
    l2.add(54);
    System.out.println("after adding two more elements"+l2);
    
    //remove anyone element
    l2.remove(2);
    System.out.println("after removing one element:"+l2);
    
    //check i l2 contains any string
    System.out.println("check if it contains any string:"+l2.contains("hello"));
    
    //check if 5 is present
    System.out.println("check if it contains 5 in l2"+l2.contains(5));
    
    //clear the set
    l2.clear();
    System.out.println("after clearing the list:"+l2);
    
    
}
}
