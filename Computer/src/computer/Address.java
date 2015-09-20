package computer;

public class Address implements Value {
	private int index;
	
	public Address(int index) {
		this.index = index;
	}
	
	@Override
	public Word getValue(Memory memory) {
		return memory.read(index);
	}
	
	public int getIndex(){
		return index;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(String.valueOf(index));
		sb.append("]");
		return sb.toString();
	}
	
}
