package commands;

import computer.Memory;
import computer.ProgramCounter;
import computer.Value;

public class Print implements Command {
	private Value v;
	
	public Print(Value value) {
		this.v = value;
	}

	@Override
	public ProgramCounter execute(Memory memory, ProgramCounter counter) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("PRT ");
		sb.append(v.toString());
		return sb.toString();
	}

}
