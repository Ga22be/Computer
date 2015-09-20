package computer;

import javax.imageio.stream.MemoryCacheImageInputStream;

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
		
	}
}
