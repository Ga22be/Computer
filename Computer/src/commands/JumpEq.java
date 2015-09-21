package commands;

import computer.Memory;
import computer.ProgramCounter;
import computer.Value;

public class JumpEq extends JumpInstruction {
	private Value v1;
	private Value v2;
	
	public JumpEq(int index, Value value1, Value value2) {
		super(index);
		this.v1 = value1;
		this.v2 = value2;
	}

	@Override
	protected void op(Memory memory, ProgramCounter counter) {
		if(v1.getValue(memory).equals(v2.getValue(memory)))
			counter.setIndex(index);
		else
			counter.increment();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("JEQ ");
		sb.append(String.valueOf(index) + " ");
		sb.append(v1.toString() + " ");
		sb.append(v2.toString());
		return sb.toString();
	}

}
