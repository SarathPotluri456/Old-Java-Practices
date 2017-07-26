import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> li=new LinkedList<String>();
		li.add("Sarath");
		li.add("babu");
		li.add("hai");
		li.add("Goodmor");
		li.add("Goodnight");
		System.out.println("The list of strings are:"+li);
		System.out.println("the size of linked list is:"+li.size());
		li.addFirst("Super");
		li.addLast("Ending");
		System.out.println("The list of strings are:"+li);
		System.out.println("the size of linked list is:"+li.size());
		li.add(2,"Buddy");
		System.out.println("The list of strings are:"+li);
		System.out.println("the size of linked list is:"+li.size());
		li.removeFirst();
		li.removeLast();
		System.out.println("The list of strings are:"+li);
		System.out.println("the size of linked list is:"+li.size());
		Iterator i=li.iterator();
		System.out.println("the output with iterator");
		while(i.hasNext())
		{
			System.out.println("" +i.next());
		}
		ListIterator ii=li.listIterator();
		System.out.println("the out put u will get as FIFO");
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}
		System.out.println("the output u will get as LIFO");
		while(ii.hasPrevious())
		{
			System.out.println(ii.previous());
		}
		
		
		
		
	

	}

}
