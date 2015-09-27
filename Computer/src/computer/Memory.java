package computer;

public abstract class Memory {
	protected Word[] memory;
	
	public Word read(int index){
		return memory[index];
	}
	
	public abstract void write(Word w, int index);

}
