package com.csi.corejava;

public class CoreJaca {

	int a = 1;
	static int b = 2;

	public static void main(String[] args) {

		CoreJaca c = new CoreJaca();

		System.out.println(a);
		System.out.println(c.b);
		c.a = 10;
		c.b = 20;
		System.out.println(c.a);
		System.out.println(c.b);
		CoreJaca c1 = new CoreJaca();
		System.out.println(c1.a);
		System.out.println(c1.b);

	}
}
