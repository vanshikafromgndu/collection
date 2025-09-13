package collectionass;
import java.util.*;
public class assi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Use HashMap
Add 10 fruits into it and do the following operations:
1) print map
2) get all keys and values
3) remove 4th fruit using value and 7th fruit using index
4) check if map contains "banana" and "apple" fruit
5) check if it contains 4th key or not
6) hashcode of map
7) clear map

		 */
		HashMap<Integer,String>fruits=new HashMap<>();
		fruits.put(1, "Mango");
		fruits.put(2, "Apple");
		fruits.put(3, "Banana");
		fruits.put(4, "orange");
		fruits.put(5, "Guava");
		fruits.put(6, "Pineapple");
		fruits.put(7, "Kiwi");
		fruits.put(8, "Pear");
		fruits.put(9, "Grapes");
		fruits.put(10, "Strawberry");
		// 1)
		System.out.println(fruits);
		
		// 2)
		System.out.println("all Keyset from fruits:"+fruits.keySet());
		System.out.println("all valueset from fruits:"+fruits.values());
		
		// 3)
		List<Map.Entry<Integer, String>> entryList = new ArrayList<>(fruits.entrySet());
		 if (entryList.size() >= 4) {
	            String fourthFruit = entryList.get(3).getValue();
	            fruits.values().removeIf(value -> value.equals(fourthFruit));
	            System.out.println("\n3) Removed 4th fruit by value: " + fourthFruit);
	        }
		 if (entryList.size() >= 7) {
	            int seventhFruitKey = entryList.get(6).getKey();
	            fruits.remove(seventhFruitKey);
	            System.out.println("Removed 7th fruit by index: Key " + seventhFruitKey);
	        }
		 
		 System.out.println("Map after removals:");
		 System.out.println(fruits);
		 
		 //4)Check if map contains "banana" and "apple"
		 System.out.println("fruit contain banana"+fruits.containsValue("Banana"));
		 System.out.println("fruit contain apple"+fruits.containsValue("apple"));
		 
		// 5)Check if it contains 4th key
		 System.out.println("fruit contain 4th key "+fruits.containsKey(4));
		 
		 // 6)Hashcode of map
		 System.out.println("HashCode of map: " + fruits.hashCode());
		 
		 // 7)Clear the map
		 fruits.clear();
		 System.out.println("after clearing:"+fruits);
	}

}
