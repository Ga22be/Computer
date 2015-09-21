package computer;

public class ProgramCounter {
	private int index;
	
	public ProgramCounter(){
		index = 0;
	}
	
	public int getIndex(){
		return index;
	}
	
	public void setIndex(int index){
		 this.index = index;
	}
	
	public void increment(){
		index++;
	}
	
	public boolean possitive(){
		if(index >= 0)
			return true;
		return false;
	}

}
