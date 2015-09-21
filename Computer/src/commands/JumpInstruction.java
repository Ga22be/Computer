package commands;

import computer.Memory;
import computer.ProgramCounter;

public abstract class JumpInstruction implements Command {
	protected int index;

	protected JumpInstruction(int index) {
		this.index = index;
	}
	
	@Override
	public void execute(Memory memory, ProgramCounter counter) {
		op(memory, counter);
	}
	
	protected abstract void op(Memory memory, ProgramCounter counter);
	
	@Override
	public abstract String toString();

}
