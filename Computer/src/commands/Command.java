package commands;

import computer.Memory;
import computer.ProgramCounter;

public interface Command {
	
	public ProgramCounter execute(Memory memory, ProgramCounter counter);

	public String toString();
	
}
