/*
 wRITE A JAVA to change priorityQueue to maximum priorityqueue(you can use any loop
 PAYAL DHANGAR
 3-11-22
 */



package array;

import java.util.*;


class Maximum_no {

	public static void main(String[] args) {
		PriorityQueue<Integer> set = new PriorityQueue<>(10, Collections.reverseOrder());
	      
		   // Add numbers in the Queue
		   set.add(20);
		   set.add(22);
		   set.add(36);
		   set.add(25);
		   set.add(16);
		   set.add(70);
		   set.add(82);
		   set.add(89);
		   set.add(14);
		   System.out.println("\nOriginal Priority Queue: "+set);

		System.out.print("\nMaximum Priority Queue: ");
		Integer val = null;
		while( (val = set.poll()) != null) {
		    System.out.print(val+"  ");
		      }
			  System.out.print("\n");
		  }

	}

