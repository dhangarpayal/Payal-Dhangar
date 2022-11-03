/*
 B)write java programming to check if a particular element exists in a linked list code
 PAYAL DHANGAR
 3-11-22
 */





package array;

import java.util.LinkedList;
 class element {

	public static void main(String[] args) {
		
		 // create an empty linked list
		  LinkedList <String> list = new LinkedList <String> ();
		          list.add("Red");
		          list.add("Green");
		          list.add("Black");
		          list.add("White");
		        
		          System.out.println("Original linked list: " + list);
		           
		     // Checks whether the color "Green" exists or not.
		    if (list.contains("Green")) {
		       System.out.println("Color Green is present in the linked list.");
		    } else {
		       System.out.println("Color Green is not present in the linked list.");
		     }
		    
		     // Checks whether the color "Orange" exists or not.
		    if (list.contains("Orange")) {
		       System.out.println("Color Orange is present in the linked list.");
		    } else {
		       System.out.println("Color Orange is not present in the linked list.");
		     }
		    
		 }
		}
