package computer;

public class LongMemory extends Memory{
	
	public LongMemory(int length) {
		super(length);
	}
	
	@Override
	public void write(Word w, int index) {
		memory[index] = (LongWord) w;
	}

}
