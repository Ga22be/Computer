package commands;

import computer.Address;
import computer.Memory;
import computer.Value;

public class Add extends BinCommand{

	public Add(Value value1, Value value2, Address address) {
		super(value1, value2, address);
	}

	@Override
	protected void op(Memory memory) {
		memory.write(v1.getValue(memory).add(v2.getValue(memory)), address.getIndex());
	}

	@Override
	protected String prefix() {
		return "ADD";
	}

}
