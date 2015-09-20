package commands;

import computer.Address;
import computer.Memory;
import computer.ProgramCounter;
import computer.Value;

public abstract class BinCommand implements Command{
	protected Value v1;
	protected Value v2;
	protected Address address;
	
	protected BinCommand(Value value1, Value value2, Address address){
		this.v1 = value1;
		this.v2 = value2;
		this.address = address;
	}

	@Override
	public ProgramCounter execute(Memory memory, ProgramCounter counter) {
		op(memory);
		return counter;
	}
	
	protected abstract void op(Memory memory);
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(prefix() + " ");
		sb.append(v1.toString() + " ");
		sb.append(v2.toString() + " ");
		sb.append(address.toString());
		return sb.toString();
	}
	
	protected abstract String prefix();
}
