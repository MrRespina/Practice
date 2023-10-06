package Practice;

import java.util.Scanner;

public class Coupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num;
		Scanner s = new Scanner(System.in);	
		SaveInfo save = new SaveInfo();
		
		System.out.print("입력 명수 : ");
		num = s.nextInt();
		
		save.getNum(num);
		save.setName();
		save.print();
		
		save.upSort();
		save.print();
		
		save.downSort();
		save.print();
		
		s.close();

	}

}
