
import java.util.PriorityQueue;

public class KeywordHeap {
	private PriorityQueue<Keyword> heap;
	
	public KeywordHeap(){
		this.heap = new PriorityQueue<Keyword>(10, new KeywordComparator());
	}
	
	public void add(Keyword k){
		heap.offer(k);
		System.out.println("Done");
	}
	
	public void peek(){
		if(heap.peek() == null){
			System.out.println("InvalidOperation");
			return;
		}
		
		Keyword k = heap.peek();		
		System.out.println(k.toString());
	}
	
	public void removeMin(){
		//TODO: write remove minimal element logic here...
		heap.poll();
		System.out.println("Done");		
	}
	
	public void output(){
		//TODO: write output and remove all element logic here...
		StringBuilder sb = new StringBuilder();
		Keyword k;
		
		while((k = heap.poll()) != null){
			sb.append(k.toString());
			if(heap.peek() != null) sb.append("");
		}
		
		System.out.println(sb.toString());	
	}
}
