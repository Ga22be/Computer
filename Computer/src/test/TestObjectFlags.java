package test;

import java.awt.Point;




public class TestObjectFlags {

	public static void main(String[] args) {
		Point p = new Point(2, 3);
		System.out.println(p.toString());
		
		Op op = new Op();
		op.op(p);
		
		
		System.out.println(p.toString());
	}
}