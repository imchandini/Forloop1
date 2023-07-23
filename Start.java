package com.sri.demo;

import com.sri.demo.model.Employee;
import com.sri.demo.model.Student;

public class Start {

	
	public static void main(String[] name) {
		Start startObj = new Start();
		Employee emp = new Employee();
//		System.out.println(emp.toString());
//		System.out.println(startObj.toString());
		Student sdt1 = new Student();
		System.out.println(sdt1.toString());
//		 sdt1 = new Student("hello", "sri");
//		System.out.println(sdt1.toString());
		// ystem.out.println(sdt1.toString());
		// main(12,13);
		int z = add(2, 3);
		System.out.println(z);
	}

	static int add(int x, int y) {
		return x + y;
	}

	String main(String name) {
		System.out.println("helloString");
		return "Sel";
	}

	String main() {
		System.out.println("helloStringNorg");
		return "Sel2";
	}

	static String main(String name, String age) {
		System.out.println("helloStringNorg");
		return "Sel2";
	}

	static void main(String name, int age) {
		System.out.println("helloStringNorg");
	}

	static void main(int name, long age) {
		System.out.println("int");
	}

	static void main(long name, int age) {
		System.out.println("long");
	}
}
