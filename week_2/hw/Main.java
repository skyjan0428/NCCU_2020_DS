
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Please type Datatype First Base N");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
		    int type = sc.nextInt();
		    
		    switch (type){
			    case 0:
			    GeomProgression<Integer> intGeomProg = new GeomProgression<Integer>(sc.nextInt(), sc.nextInt());
				intGeomProg.printProgression(sc.nextInt());
				break;
			    case 2:
			    GeomProgression<Float> floatGeomProg = new GeomProgression<Float>(sc.nextFloat(), sc.nextFloat());
				floatGeomProg.printProgression(sc.nextInt());
				break;

				// add long double
	
			    default:
				System.out.println("InvalidType");
				//consume the following 3 useless tokens
				sc.next();
				sc.next();
				sc.next();
				break;
		    }
		    
		}
		sc.close();

	}

}
