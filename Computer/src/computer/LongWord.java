package computer;

public class LongWord extends Word {
	private long value;
	
	public LongWord(long value) {
		this.value = value;
	}

	@Override
	public Word getValue(Memory memory) {
		return this;
	}
	
	@Override
	public Word add(Word w) {
		return new LongWord(value + ((LongWord) w).value);
	}

	@Override
	public Word mul(Word w) {
		return new LongWord(value * ((LongWord) w).value);
	}

	@Override
	public Word copy() {
		return new LongWord(value);
	}

	@Override
	public boolean equals(Word w) {
		if(value == ((LongWord) w).value)
			return true;
		else 
			return false;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

}
