

public class Keyword {
	public String name;
    public int count;
    public float weight;
    
    public Keyword(String name,int count,float weight){
		this.name = name;
		this.count =count;
		this.weight =weight;
    }
    
    @Override
    public String toString(){
    	return "["+name+","+count+","+weight+"]";
    }
}
