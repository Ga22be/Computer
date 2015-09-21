package computer;

import commands.Command;

public class Computer {
	private Memory memory;
	private Command[] commands;
	
	public Computer(Memory memory){
		this.memory = memory;
	}
	
	public void load(Program program){
		commands = program.getCommands();
	}
	
	public void run(){
		ProgramCounter counter = new ProgramCounter();
		while(counter.possitive()){
			commands[counter.getIndex()].execute(memory, counter);
//			System.out.println(counter.getIndex());
		}	
	}
}
