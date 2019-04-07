package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Testing1 {

	public static void main(String[] args) {
		
		ArrayList<String> stds = new ArrayList<>();
		stds.add("Roopali");
		stds.add("abs");
		stds.add("xyz");
	
		LinkedList<String> stds1 = new LinkedList<>();
		stds1.add("Roopali");
		stds1.add("abs");
		stds1.add("xyz");
		
		Vector<String> v = new Vector<>();
		v.add("Roopali");
		v.add("abs");
		v.add("xyz");
		
		for(String s:stds)
		{
			System.out.println(s);
		}
		
	}
	
	//collection is a framework which helps us to handle the data which is growing or shrinking in nature.
	// we multiple interfaces like List , Set
	//list has arraylist, linkedlist and vector(duplicate data)
	//set has hashset, linked hashset, tree (unique data)
}
