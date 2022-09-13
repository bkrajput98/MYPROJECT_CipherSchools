/*

//Static Variable

import java.util.Scanner;
class Student {
	String name;
	int regno;
	static int sem;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name, reg no & semester in order: ");
		name = sc.nextLine();
		regno = sc.nextInt();
		sem = sc.nextInt();
	}
	void show() {
		System.out.println("Details:");
		System.out.println("Name:" + name);
		System.out.println("Reg. No:" + regno);
		System.out.println("Semester:" + sem);
	}
}

class Database {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();

		s1.input();
		s2.input();

		s1.show();
		s2.show();

	}

}
*/

/*
Packages in Java: It is just like a folder. It may consists of sub-packages and class files & interfaces.

1) Built-in packages: lang, util, io, sql, net, awt, javax etc
lang - the default package

2) User defined packages

*/
/*
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		String s;
		int roll;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter roll no: ");
		roll = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		s = sc.nextLine();
		
		System.out.println("Name: " + s);
		System.out.println("Roll no: " + roll);
	}
}
*/

/*
// Command Line Argument
// Take two values from command line arg and print their sum

class Test {
	public static void main(String[] args) {
		System.out.println("Sum: " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
	}
}
*/

/*
Note: members of same class can access other members even if it is private.

Access Modifiers: private, public, protected, default (no access modifier)

			Within		Different Class			Different Class
			class		within package			outside package

private		Yes				No						No

default		Yes				Yes						No

protected	Yes				Yes						Yes(But only child class object can access)

public		Yes				Yes						Yes

*/

/*
class Demo {
	private int a;

	public static void main(String[] args) {
		Demo ob = new Demo();
		ob.a = 20;
		System.out.println("Data: " + ob.a);
	}

}
*/

/*
// Setters & Getters

class Demo {
	private int a;
	//protected int b;
	//public int c;
	//default
	//int d;

	//setter
	void setA(int val) {
		a = val;
	}

	//getter
	int getA() {
		return a;
	}
}
class DemoDriver {
	public static void main(String[] args) {
		Demo ob = new Demo();
		ob.setA(20);
		System.out.println("Data: " + ob.getA());
	}

}
*/

/*
//Accessing Public member
class Demo {
	//protected int b;
	public int c;
	//default
	//int d;

}
class DemoDriver {
	public static void main(String[] args) {
		Demo ob = new Demo();
		ob.c = 20;
		System.out.println("Data: " + ob.c);
	}

}
*/

//Accessing Protected member - refer Demo.java & package.java files

/*
Static & Non-static methods

From/To				Non-Static member				Static member

Non-Static method		object						object
						directly*					Class name
													
Static method			object						object
													Class name
													directly*

*: Within the same class
*/


class Test {
	static int x;
	int y;

	/*
	void show() {
		System.out.println("Data: X = " + x + " Y = " + y);
	}
	*/

	static void display(Test ob) {
		
		// System.out.println("Data: X = " + x);
		// System.out.println("Data: X = " + Test.x);
		System.out.println("Data: X = " + ob.x + " Y = " + ob.y);
	}
}

class TestDrive {
	public static void main(String[] args) {
		Test ob = new Test();
		ob.x = 20;
		ob.y = 30;

		// ob.show();
		// ob.display();
		Test.display(ob);
	}
}

/*
class Test{
	// Constructor
	Test() {

	}
}

Test ob = new Test();  //Creates object

It will implicitly invoke Test constructor and constructor will create object.
*/