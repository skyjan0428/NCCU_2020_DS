
public class Keyword {
	public String name;
	public int count;
	public double weight;
	
	public Keyword(String name,int count,double weight){
		this.name = name;
		this.count = count;
		this.weight = weight;
	}
	
	@Override
	public String toString(){
		return "["+name+","+count+","+weight+"]";
	}
}
