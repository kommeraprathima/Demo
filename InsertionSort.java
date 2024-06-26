package dsa.sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter the num of elements:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int j = 1; j < n; j++) {

			for (int k = j - 1; k >= 0; k--) {
				int temp = 0;
				System.out.println("before swap" + arr[k] + " " + k + " 	" + arr[j] + " " + j);
				if (arr[k] > arr[j]) {

					temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
					j = k;

				}
				System.out.println("after swap" + arr[k] + " " + arr[j]);
			}
		}
		for (int i : arr) {
			System.out.print(i + "  ");
		}

	}

}
