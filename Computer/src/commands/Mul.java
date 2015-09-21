package commands;

import computer.Address;
import computer.Memory;
import computer.Value;

public class Mul extends BinCommand {

	public Mul(Value value1, Value value2, Address address) {
		super(value1, value2, address);
	}

	@Override
	protected void op(Memory memory) {
		memory.write(v1.getValue(memory).mul(v2.getValue(memory)), address.getIndex());
		System.out.println("MUL " + memory.read(address.getIndex()) + " -> " + String.valueOf(address.getIndex()));
	}

	@Override
	protected String prefix() {
		return "MUL";
	}

}
