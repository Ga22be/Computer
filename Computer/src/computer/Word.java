package computer;

public abstract class Word implements Value {
	
	@Override
	public abstract Word getValue(Memory memory);
	
	public abstract Word add(Word w);
	
	public abstract Word mul(Word w);
	
	public abstract Word copy();
	
	public abstract boolean equals(Word w);
	
	public abstract String toString();

}
