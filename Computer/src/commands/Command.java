package commands;

import computer.Memory;
import computer.ProgramCounter;

public interface Command {
	
	public void execute(Memory memory, ProgramCounter counter);

	public String toString();
	
}
