package computer;

import commands.Add;
import commands.Copy;
import commands.Halt;
import commands.Jump;
import commands.JumpEq;
import commands.Mul;
import commands.Print;

public class Factorial extends Program {
	public Factorial() {
		Address n = new Address(0), 
				fac = new Address(1);
		commands.add(new Copy(new LongWord(5), n));
		commands.add(new Copy(new LongWord(1), fac));
		commands.add(new JumpEq(6, n, new LongWord(1)));
		commands.add(new Mul(fac, n, fac));
		commands.add(new Add(n, new LongWord(-1), n));
		commands.add(new Jump(2));
		commands.add(new Print(fac));
		commands.add(new Halt());
	}
}
