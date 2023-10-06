package Practice;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] jb = new int[5][5];
		int sum=0;

		for (int i = 0; i <= 4; i++) {

			for (int j = 0; j <= i; j++) {

				jb[i][j] = sum+=1; 
				System.out.print(jb[i][j]+" ");

			}

			System.out.println();

		}

	}

}
