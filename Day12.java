/*
import java.util.Scanner;
import java.util.Arrays;
class ArrayOperations {
	static Scanner sc = new Scanner(System.in);
	static void input(int arr[], int n) {
		System.out.print("Enter the array elements: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
	}
	static void display(int arr[], int n) {
		System.out.print("Array elements are: ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static int insertEnd(int arr[], int n, int x) {
		arr[n] = x;
		return n + 1;
	}
	static int insertBeg(int arr[], int n, int x) {
		for(int i = n - 1; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		arr[0] = x;
		return n + 1;
	}
	
	static int insertAtAny(int arr[], int n, int x) {
		int pos;
		System.out.print("Enter the position to insert new item: ");
		pos = sc.nextInt();
		for(int i = n - 1; i >= pos - 1; i--) {
			arr[i + 1] = arr[i];
		}
		arr[pos - 1] = x;
		return n + 1;
	}

	static int deleteEnd(int arr[], int n) {
		System.out.println("\nDeleted Item: " + arr[n - 1]);
		return n - 1;
	}

	static int deleteBeg(int arr[], int n) {
		System.out.println("\nDeleted Item: " + arr[0]);
		for(int i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		return n - 1;
	}
	static int deleteAny(int arr[], int n) {
		int pos;
		System.out.print("\nEnter the position to delete item: ");
		pos = sc.nextInt();
		System.out.println("\nDeleted Item: " + arr[pos - 1]);
		for(int i = pos - 1; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		return n - 1;
	}

	
	
	public static void main(String[] args) {
		
		int array[], n, x;

		System.out.print("Enter no of elements: ");
		n = sc.nextInt();

		array = new int[30];
		input(array, n);
		display(array, n);

		// System.out.print("\nEnter the new item: ");
		// x = sc.nextInt();
		// n = insertEnd(array, n, x);
		// n = insertBeg(array, n, x);
		// n = insertAtAny(array, n, x);
		// n = deleteEnd(array, n);
		// n = deleteBeg(array, n);
		n = deleteAny(array, n);
		display(array, n);
		
	}

}
*/

// Print the array contents after left rotating it k times. Take input for k. 

import java.util.Scanner;
import java.util.Arrays;
class ArrayRotation {
	static Scanner sc = new Scanner(System.in);
	static void input(int arr[]) {
		System.out.print("Enter the array elements: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	static void display(int arr[]) {
		System.out.print("Array elements are: ");
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

	static void printRotatedArray(int arr[], int k) {
		int n = arr.length;
		int r = k % n;

		for(int i = r; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		for(int i = 0; i < r; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		
		int array[], n, k;

		System.out.print("Enter no of elements: ");
		n = sc.nextInt();

		array = new int[n];
		input(array);
		display(array);

		System.out.print("\nEnter no of left rotations: ");
		k = sc.nextInt();
		printRotatedArray(array, k);
		
	}

}
