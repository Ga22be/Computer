package commands;

import computer.Address;
import computer.Memory;
import computer.ProgramCounter;
import computer.Value;

public class Copy implements Command {
	private Value v;
	private Address address;

	public Copy(Value value, Address address){
		this.v = value;
		this.address = address;
	}
	
	@Override
	public void execute(Memory memory, ProgramCounter counter) {
		memory.write(v.getValue(memory), address.getIndex());
		counter.increment();
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("CPY ");
		sb.append(v.toString() + " ");
		sb.append(address.toString());
		return sb.toString();
	}

}
