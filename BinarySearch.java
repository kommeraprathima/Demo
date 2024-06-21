package dsa.search;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[6];
		int l=0;
		int m=2;
		int h=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter searching element");
		int s=sc.nextInt();
		System.out.println("enter elements in ascending order");
		for(int i=0;i<6;i++) {
			array[i]=sc.nextInt();
		}
		for (int i=0;i<6;i++) {
			if(s<array[m]) {
				h=m;
				m=m/2;
			}else if(s>array[m]) {
				l=m;
				m=(h+l)/2;
			}else if(s==array[m]) {
				System.out.print(m);
				break;
			}
		}
		System.out.println("search element not found");

	}

}
