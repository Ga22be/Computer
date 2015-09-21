package computer;

import java.util.ArrayList;

public abstract class Memory {
	protected ArrayList<Word> memory;
	
	protected Memory(int length){
		memory = new ArrayList<Word>(length);
	}
	
	public Word read(int index){
		return memory.get(index);
	}
	
	public abstract void write(Word w, int index);

}
