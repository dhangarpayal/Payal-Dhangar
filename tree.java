/*
 D)write java progeam to get the element in a tree set which is strictly greater than or equal
  to the given element code
  PAYAL DHANGAR
  3-11-22
 */

package array;
import java.util.TreeSet;
 class tree {

	public static void main(String[] args) {
		 // creating TreeSet 
		   TreeSet <Integer>tree_num = new TreeSet<Integer>();
		   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
		     
		   // Add numbers in the tree
		   tree_num.add(10);
		   tree_num.add(22);
		   tree_num.add(36);
		   tree_num.add(25);
		   tree_num.add(16);
		  
		   
		   System.out.println("Greater than or equal to 22 : "+tree_num.ceiling(22));
		   System.out.println("Greater than or equal to 16: "+tree_num.ceiling(16));
		   }    

	}


