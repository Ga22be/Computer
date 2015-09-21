package computer;

public class LongMemory extends Memory{
	
	public LongMemory(int length) {
		super(length);
		memory.add(new LongWord(0));
		memory.add(new LongWord(0));
	}
	
	@Override
	public void write(Word w, int index) {
		memory.set(index, (LongWord) w);
	}

}
