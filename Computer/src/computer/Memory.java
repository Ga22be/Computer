package computer;

import java.util.ArrayList;

public abstract class Memory {
	protected Word[] memory;
	
	protected Memory(int length){
		memory = new Word[length];
	}
	
	public Word read(int index){
		return memory[index];
	}
	
	public abstract void write(Word w, int index);

}
