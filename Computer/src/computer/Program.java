package computer;

import java.util.ArrayList;

import commands.Command;

public abstract class Program {
	protected ArrayList<Command> commands;
	
	protected Program(){
		commands = new ArrayList<Command>();
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		int index = 0;
		for(Command c : commands){
			sb.append(String.valueOf(index++) + " ");
			sb.append(c.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public Command[] getCommands(){
		Command[] commandArray = new Command[0];
		return commands.toArray(commandArray);
	}
}
