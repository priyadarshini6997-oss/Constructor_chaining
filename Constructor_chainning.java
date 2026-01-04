package com.index;

class C {
	int x;
	C(){
		this(50);
		System.out.println("No argument constructor executed");
	}
	C(int y){
		this.x=y;
		System.out.println("Prameterized constructor executeed:y= "+y);
	}
	void show() {
		System.out.println("Instance variable  "+this.x);
	}
}
public class Constructor_chainning{
	public static void main(String[] args) {
		C obj = new C();
		System.out.println("Object created ,now calling method: ");
		obj.show();

	}

}
