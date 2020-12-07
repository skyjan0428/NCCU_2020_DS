package ta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeywordList list = new KeywordList();
		
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()){
			String operation = scanner.next();
			
			switch (operation){
				case "add":
					String name = scanner.next();
					int count = scanner.nextInt();
					list.add(new Keyword(name, count));				
					break;
				case "find":
					String k = scanner.next();
					list.find(k);
					break;
				default:
					break;
			}	
		}
		scanner.close();
	}

}
