package test;

import commands.Add;
import commands.Command;
import commands.Copy;
import commands.Mul;
import commands.Print;
import computer.Address;
import computer.LongWord;

public class TestToString {

	public static void main(String[] args) {
		Address address = new Address(0);
		LongWord w = new LongWord(5);
		Command c;
		
//		c = new Copy(new LongWord(5), address);
//		c = new Print(address);
//		c = new Add(new LongWord(2), new LongWord(3), address);
//		c = new Mul(new LongWord(2), new LongWord(3), address);
		
		
		System.out.println(c.toString());
	}

}
