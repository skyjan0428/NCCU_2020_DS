
public class Main {

	public static void main(String[] args) {
		testExecute(5);
		
		//testPrintStack(5);

	}
	public static void testPrintStack(int desk) {
		MyStack<Integer> rod = new MyStack();
		for(int i=desk; i>=1; i--) {
			rod.push(i);
		}
		rod.printStack();
	}
	public static void testExecute(int desk) {
		HanoiTower t = new HanoiTower(desk);
		t.start();
		t.printHanoiTower();
		
	}

}
