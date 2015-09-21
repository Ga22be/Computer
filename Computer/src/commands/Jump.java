package commands;

import computer.Memory;
import computer.ProgramCounter;

public class Jump extends JumpInstruction {

	public Jump(int index) {
		super(index);
	}

	@Override
	protected void op(Memory memory, ProgramCounter counter) {
		counter.setIndex(index);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("JMP ");
		sb.append(String.valueOf(index));
		return sb.toString();
	}

}
