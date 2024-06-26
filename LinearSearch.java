package dsa.search;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the search num");
		int searchElement = sc.nextInt();
		System.out.println("enter the length of an array");
		int n = sc.nextInt();
		int elements[] = new int[n];
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++) {
			elements[i] = sc.nextInt();
		}
		int result = search(elements, n, searchElement);
		if (result == 0) {
			System.out.println("search element is not found");
		} else
			System.out.println("search element is found and is at"+result);
	}

	private static int search(int[] elements, int n, int searchElement) {
		for (int j = 0; j < n; j++) {

			if (elements[j] == searchElement) {
				return j + 1;
			}

		}
		return 0;
	}

}
