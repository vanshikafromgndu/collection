package collectionass;
import java.util.*;
public class assi4 {
	public static void main(String[] args) {
	/*
	 * Assignment 4:
Use LinkedList only in the below program
   - Add  6 months (May, June, July, August, April, November)
   - Add 'December' month as last
   - Add 'January' month as first
   - Add 'March' and then add 'Febuary' using the index based 
   - Add 'September' and then add 'October' using the index based

(1) Print the linkedlist in such a way that proper order of months are displayed
(2) Get all the even months and print them 
(3) Get all the odd months and print them
(4) Use iterator to fetch and print all months 
(5) Print the first and last month of the year together
(6) remove your birthday month from the linkedList and print it
(7) Check whether this linkedList contains any winter month inside it or not?
(8) Fetch the first and last months using peek()
(9) Remove the first and last months using poll()


	 */
			LinkedList <String>l1=new LinkedList<String>();
			l1.add("May");
			l1.add("June");
			l1.add("July");
			l1.add("August");
			l1.add("April");
			l1.add("November");
			l1.addLast("December");
			l1.addFirst("January");
			l1.add(1,"March");
			l1.add(1,"Febuary");
			l1.add(8,"September");
			l1.add(9,"october");
			System.out.println(l1);
			System.out.println("Month in properorder");
			//1
			l1.add(3,"April");
			l1.remove(8);
			System.out.println(l1);
			
			//2
			System.out.println("even");
			for(int i=0;i<l1.size();i++)
			{
				if(i%2==0)
				{
					String str=l1.get(i);
					System.out.print(str+" ");
				}
			}
			
			//3
			System.out.println("odd");
			for(int i=0;i<l1.size();i++)
			{
				if(i%2!=0)
				{
					String str=l1.get(i);
					System.out.print(str+" ");
				}
			}
			//4
			for(int i=0;i<l1.size();i++)
			{
				System.out.println(l1.get(i));
			}
			
			//5
			System.out.println("1st and 12th month:");
			System.out.println(l1.get(0)+" "+l1.get(11));
			
			//6
			String bd=l1.get(1);
			System.out.println("birth month:"+bd);
			l1.remove(1);
			
			//7
			
			
			//8
			System.out.println("print first and lat month:");
			System.out.println(l1.peekFirst()+" "+l1.peekLast());
			
			//9
			System.out.println("first and lat month:");
			System.out.println(l1.pollFirst()+" "+l1.pollLast());
	}
}
