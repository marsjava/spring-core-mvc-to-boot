package com.learning.simplecore;

class Test{
	int x = 3;
	int y = 5;
	void display() {
		x++;
		y+=8;
		System.out.println("x value is "+x+" y value is "+y);
	}
}

public class ScopeDemo {

	public static void main(String[] args) {
		
		Test obj1 = new Test();
		obj1.display();
		Test obj2 = new Test();
		obj2.display();
		Test obj3 = new Test();
		obj3.display();
		obj1.display();
	}

}
