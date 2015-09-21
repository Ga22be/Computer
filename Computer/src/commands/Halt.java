package commands;

import computer.Memory;
import computer.ProgramCounter;

public class Halt extends JumpInstruction {

	public Halt() {
		super(-1);
	}

	@Override
	protected void op(Memory memory, ProgramCounter counter) {
		counter.setIndex(index);
	}

	@Override
	public String toString() {
		return "HLT";
	}

}
