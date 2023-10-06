package Practice;

import java.util.Scanner;

public class SaveInfo {

	static int[] number;
	String[] name;
	Scanner s = new Scanner(System.in);

	public void getNum(int num) {

		number = new int[num];

		for (int i = 0; i < num; i++) {

			double rand = Math.random();
			int dice = ((int) (rand * 6)) + 1;
			number[i] = dice;

		}

	}

	public void setName() {

		name = new String[number.length];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < number.length; i++) {

			System.out.print("이름을 입력해주세요 : ");
			name[i] = s.nextLine();

		}

		System.out.println();
		s.close();

	}

	public void print() {
		
		System.out.println("=====================\n");

		for (int i = 0; i < number.length; i++) {

			System.out.println(name[i] + "의 주사위 눈 = " + number[i]);

		}
		System.out.println("\n=====================\n");

	}

	public void upSort() {

		System.out.println("=== 오름차순 정렬 시작 ===");

		for (int i = 0; i < number.length - 1; i++) {

			for (int j = 0; j < number.length - 1 - i; j++) {

				if (number[j] > number[j + 1]) {

					int socket = number[j];
					number[j] = number[j + 1];
					number[j + 1] = socket;

					String sSocket = name[j];
					name[j] = name[j + 1];
					name[j + 1] = sSocket;

				}

			}

		}

		System.out.println("=== 오름차순 정렬 완료 ===\n");

	}

	public void downSort() {

		System.out.println("=== 내림차순 정렬 시작 ===");

		for (int i = 0; i < number.length - 1; i++) {

			for (int j = 0; j < number.length - 1 - i; j++) {

				if (number[j] < number[j + 1]) {

					int socket = number[j];
					number[j] = number[j + 1];
					number[j + 1] = socket;

					String sSocket = name[j];
					name[j] = name[j + 1];
					name[j + 1] = sSocket;

				}

			}

		}

		System.out.println("=== 내림차순 정렬 완료 ===\n");

	}

}
