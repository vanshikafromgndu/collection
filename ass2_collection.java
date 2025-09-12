package collection_ass;
import java.util.*;
public class ass2_collection {
	public static void main(String[] args) {
		TreeSet<Object>t1=new TreeSet<>();
		t1.add("C++");
		t1.add("java");
		t1.add("Python");
		t1.add("HTML");
		t1.add("CSS");
		
		System.out.println("show tree set"+t1);
		
		//remove two lang
		t1.remove("html");
		t1.remove("c++");
		System.out.println("after removing elements from t1:"+t1);
		
		//add three more lang
		t1.add("kotlin");
		t1.add("MySql");
		t1.add("php");
		System.out.println("after adding 3 lang in t1: "+t1);
		
		//check t1 contain java or not
		System.out.println("check if t1 contain java or not:"+t1.contains("java"));
		
		//clear the tree set
		t1.clear();
		System.out.println("t1:"+t1);
	}
}
