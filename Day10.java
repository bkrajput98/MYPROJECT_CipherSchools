import java.util.Scanner;
class Sorting {
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

	/*
	static void bubbleSort(int arr[]) {
		int temp, n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	*/

	static void enhancedBubbleSort(int arr[]) {
		int temp, n = arr.length, flag;
		for(int i = 0; i < n - 1; i++) {
			flag = 0;
			for(int j = 0; j < n - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					flag = 1;
				}
			}
			if(flag == 0)
				break;
		}
	}
	static void selectionSort(int arr[]) {
		int n = arr.length, pos, temp;
		for(int i = 0; i < n - 1; i++) {
			pos = i;
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[pos])
					pos = j;
			}
			temp = arr[pos];
			arr[pos] = arr[i];
			arr[i] = temp;
		}
	}

	static void insertionSort(int arr[]) {
		int n = arr.length, key, i;
		for(int j = 1; j < n; j++) {
			key = arr[j];
			i = j - 1;

			while(i >= 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;
		}
	}
	
	
	public static void main(String[] args) {
		
		int array[], n;

		System.out.print("Enter the array size: ");
		n = sc.nextInt();

		array = new int[n];
		input(array);

		//bubbleSort(array);
		//enhancedBubbleSort(array);
		//selectionSort(array);
		insertionSort(array);
		display(array);
		
	}

}