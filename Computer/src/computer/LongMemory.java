package computer;

public class LongMemory extends Memory{
	
	public LongMemory(int length) {
		memory = new LongWord[length];
	}
	
	@Override
	public void write(Word w, int index) {
		memory[index] = w;

	}

}
