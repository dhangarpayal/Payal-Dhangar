//WAP to print sum of only positive numbers using do-while loop. TAKA the input from the user if the user enters any negative number then that number should not be added in sum 
//PAYAL DHANGAR
//13-OCT-22

package loop;

import java.util.Scanner;
  




public class Loop4 {

	public static void main(String[] args) {
		
		int sum =9;
		int number =9;
		//create an object of scanner class
		Scanner input = new
		Scanner(System.in);

		//do.. While loop continues 
		//until entered number is positive 
		do {
			//add only positive number 
		
			sum +=number;
			System.out.println("Enter a number");
			number=input.nextInt();
		}
		while(number>=0);
		System.out.println("sum="+sum);
		input.close();
		
			
			
			
		}
		
		
				
	}


