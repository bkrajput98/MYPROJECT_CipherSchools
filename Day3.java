/*
class Test{
	// Constructor
	Test() {

	}
}

Test ob = new Test();  //Creates object

It will implicitly invoke Test constructor and constructor will create object.

Tasks of Constructor:
1) Create object
2) Initialize the object

Test ob = new Test();  //Creates object

new Test()	-> invokes the constructor
Test ob		-> Reference Variable

Test obj = new Test();

Test ob1 = obj;
*/

/*
class Test {
	int a;
	void show() {
		System.out.println("Test Class Method " + a);
	}
	public static void main(String[] args) {
		new Test().show(); //Anonymous Object - Use it only once
	}
}

Note: When user doesn't mention any constructor, only then JVM places a default constructor 
in the class.
*/

/*
class Dummy {
	int a;
	void show() {
		System.out.println("Dummy Class Method " + a);
	}
	public static void main(String[] args) {
		Dummy ob = new Dummy();
		ob.a = 20;
		ob.show();
	}
}
*/

/*
class Dummy {
	int a;

	public Dummy() {}

	void show() {
		System.out.println("Dummy Class Method " + a);
	}
	public static void main(String[] args) {
		Dummy ob = new Dummy();
		ob.show();
	}
}
*/
/*
class Dummy {
	int a;

	public Dummy() {
		a = 20; // Initialization of data member
	}
	void show() {
		System.out.println("Dummy Class Method " + a);
	}
	public static void main(String[] args) {
		Dummy ob = new Dummy();
		ob.show();
		ob.a = 35;
		ob.show();
	}
}
*/

/*
class Dummy {
	int a;

	public Dummy() {
		a = 20; // Initialization of data member
	}
	void show() {
		System.out.println("Dummy Class Method " + a);
	}
	public static void main(String[] args) {
		Dummy ob1 = new Dummy();
		Dummy ob2 = new Dummy();
		ob1.show();
		ob2.show();
	}
}
*/

// Cab Fare Calculation Project

/*
import java.util.Scanner;
class Cab {
	int fare;
	public Cab() {
		fare = 40;
	}
	void calculateFare() {
		int travel;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the distance travelled by User: ");
		travel = sc.nextInt();

		fare += travel * 10;
	}
	void showFare() {
		System.out.println("Total Fare: " + fare);
	}
}

class RideCab {
	void putOTP() {
		System.out.println("Ride Started...");
		Cab ob = new Cab();
		System.out.println("Ride Ended...");
		ob.calculateFare();
		ob.showFare();
	}
	public static void main(String[] args) {
		RideCab rc = new RideCab();
		rc.putOTP();
	}

}
*/

/*
import java.util.Scanner;
class Cab {
	int fare;
	public Cab() {
		fare = 40;
	}

	public Cab(int amt) {
		fare = amt;
	}
	void calculateFare() {
		int travel;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the distance travelled by User: ");
		travel = sc.nextInt();

		fare += travel * 10;
	}
	void showFare() {
		System.out.println("Total Fare: " + fare);
	}
}

class RideCab {
	void putOTP(int d) {
		System.out.println("Ride Started...");
		if(d <= 5) {
			Cab ob = new Cab();
			System.out.println("Ride Ended...");
			ob.calculateFare();
			ob.showFare();
		}
		else {
			Cab ob = new Cab(40 + (d - 5) * 10);
			System.out.println("Ride Ended...");
			ob.calculateFare();
			ob.showFare();
		}		
	}
	public static void main(String[] args) {
		int distance;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the distance of the Cab from User: ");
		distance = sc.nextInt();

		RideCab rc = new RideCab();
		rc.putOTP(distance);
	}

}
*/

/*
class Test {
	int data;
	public Test() { }
	public Test(int val) {
		data = val;
	}

	void show() {
		System.out.println("Data: " + data);
	}
}

class TestDrive {
	public static void main(String[] args) {

		// Test ob = new Test();
		// ob.show();

		Test ob = new Test(35);
		ob.show();
	}
}
*/

/*
class Test {
	int data;
	public Test() { }
	public Test(int data) {
		this.data = data; //this returns reference of current object
	}

	void show() {
		System.out.println("Data: " + data);
	}
}

class TestDrive {
	public static void main(String[] args) {

		Test ob = new Test(35);
		ob.show();
	}
}
*/

/*
import java.util.Scanner;
class Dummy {
	int data;

	void update() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter data: ");
		data = sc.nextInt();
	}

	void show() {
		if(data < 25) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Data is less than 25, please re-enter: ");
			data = sc.nextInt();
			System.out.print("Data: " + data);
		}
		else {
			System.out.print("Data: " + data);
		}
	}

	public static void main(String[] args) {
		Dummy ob = new Dummy();
		ob.update();
		ob.show();
	}

}
*/

import java.util.Scanner;
class Dummy {
	int data;
	Scanner sc = new Scanner(System.in);

	void update() {
		System.out.print("Enter data: ");
		data = sc.nextInt();
	}

	static void show() {
		if(data < 25) {
			
			System.out.print("Data is less than 25, please re-enter: ");
			data = sc.nextInt();
			System.out.print("Data: " + data);
		}
		else {
			System.out.print("Data: " + data);
		}
	}

	public static void main(String[] args) {
		Dummy ob = new Dummy();
		ob.update();
		ob.show();
	}

}