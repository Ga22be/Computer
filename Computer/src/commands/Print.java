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
	public void execute(Memory memory, ProgramCounter counter) {
		System.out.println(v.getValue(memory));
		counter.increment();
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("PRT ");
		sb.append(v.toString());
		return sb.toString();
	}

}
