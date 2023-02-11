package oopsDemos;

import java.util.ArrayList;

public class UsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList aList=new ArrayList();
		
		aList.add(10);
		aList.add("java");
		aList.add(false);
		System.out.println("no.of items in list" + aList.size());
		System.out.print("Items are :");
		for(Object item : aList)
		{
			System.out.print(item);
		}
		aList.add(2, "programs");
		
		System.out.println("3rd item in list" + aList.get(2));
		System.out.print("Items are :");
		for(Object item : aList)
		{
			System.out.print(item + " ");
		}
		aList.remove(1);
		System.out.print("Items are :");
		for(Object item : aList)
		{
			System.out.print(item);
		}
	}

}
