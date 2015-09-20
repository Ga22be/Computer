package commands;

import computer.Memory;
import computer.ProgramCounter;

public abstract class JumpInstruction implements Command {
	protected int index;

	protected JumpInstruction(int index) {
		this.index = index;
	}
	
	@Override
	public ProgramCounter execute(Memory memory, ProgramCounter counter) {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected abstract void op();
	
	@Override
	public String toString(){
		return null;
	}

}
