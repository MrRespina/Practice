package Practice;

import java.util.Scanner;

public class MultipleCalling {
	
	static Scanner s = new Scanner(System.in);
	static boolean b = false;

	public static String set() {	
		
		String name="";
		
		while(b == false) {
			
			System.out.print("이름을 입력해주세요 : ");
			name = s.nextLine();
			if((name==null)||name.equals("")) {
				System.out.println("제대로 입력해주세요!");
			}else {
				System.out.println("입력된 값 : "+name);			
				b = true;
			}
			
		}
		return name;		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Observer o = new Observer(set());
			

	}

}
