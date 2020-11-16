
import java.util.Comparator;

public class KeywordComparator implements Comparator<Keyword>{
	@Override
	public int compare(Keyword o1, Keyword o2){
		if(o1==null || o2==null) throw new NullPointerException();
		//1. compare
		return 0;
	}
}
