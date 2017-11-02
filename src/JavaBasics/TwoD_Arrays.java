package JavaBasics;

public class TwoD_Arrays {

	public static void main(String[] args) {
		int[][] A= new int [3][3];
		int temp =0;
		int i,j;
		
		 
		for ( i=0;i<3;i++){
			for (j=0;j<3;j++){
				A[i][j]=temp;
				temp++;
				System.out.print(A[i][j] +" ");
			}
			System.out.println( " ");
		}

	}

}
