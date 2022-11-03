/*
 c)write a java program to compare two set and retain element which are same
  on  sets use retainAll method
  
  PAYAL DHANGAR
  3-11-22
 */


package array;

import java.util.*;
 class same_element {

	public static void main(String[] args) {
		// Create a empty value set
        HashSet<String> list = new HashSet<String>();
     // use add() method to add values  set
          list.add("Green");
          list.add("White");
          list.add("Black");
          list.add("Red");
          System.out.println("Frist element: "+list);
          HashSet<String> list1= new HashSet<String>();
          list1.add("Red");
          list1.add("Pink");
          list1.add("Black");
          list1.add("Orange");
          System.out.println("Second element: "+list1);
          list1.retainAll(list);
          System.out.println("SAME ELEMENT:");
          System.out.println(list1);
     }

	}


