/*
 increasing and decreasing order
 name:payal Dhangar
 date: 20/10/2022
 */



package javacore;
import java.util.Scanner;
public class Order {

		 public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int[] a = new int[7];
		        int i, j, temp;
		        System.out.println("Please Enter 7 elements in the Array");
		        for (i = 0; i < 7; i++) {
		            a[i] = sc.nextInt();
		        }
		        for (i = 0; i < 7; i++) {
		            for (j = i + 1; j < 7; j++) {
		                if (a[i] > a[j]) {
		                    temp = a[i];
		                    a[i] = a[j];
		                    a[j] = temp;
		                }
		            }
		        }
		        System.out.println("Increasing Order:-");
		        for (j = 0; j < 7; j++) {
		            System.out.println(a[j]);
		        }
		        for (i = 0; i < 7; i++) {
		            for (j = i + 1; j < 7; j++) {
		                if (a[i] < a[j]) {
		                    temp = a[i];
		                    a[i] = a[j];
		                    a[j] = temp;
		                }
		            }
		        }
		        System.out.println("Decreasing Order:-");
		        for (j = 0; j < 7; j++) {
		            System.out.println(a[j]);
		        }
		    
	}

}
