package com.question2;
//author -sejal ganachari
import java.util.HashSet;
	import java.util.Iterator;

	public class States {
		HashSet<String> h1=new HashSet<>();    //creating HashSet 
		void addState(String stateName)   //creating method addState
		{
			h1.add(stateName);             //adding stateName
		}
		
		  public String retrieveState(String stateName)  //creating method retrieveState
		{
			Iterator itr=h1.iterator();     //displaying states using iterator
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			if(h1.contains(stateName))  //checking stateName is there or not
			{
				return stateName;
			}
			else
			{
			     return null;
			}
			
		}

}
