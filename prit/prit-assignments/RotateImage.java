package assignmenttwo;

public class RotateImage {

	public static void main(String args[]) {
		int[][] arr= { { 1,2,3},{4,5,6},{7,8,9}};
				int i=0,j=0;
		for( i=0;  i<3; i++) {
			for(j=0; j<3 ; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.print("\n");
		}
		int[][] newarr = new int[i][j];
		
		for(int k=0;  k<3; k++) {
			for(int l=0; l<3 ; l++) {
				newarr[k][l] = arr[j-l-1][k];
			}
		}
		System.out.println("-------");
		for( i=0;  i<3; i++) {
			for(j=0; j<3 ; j++) {
				System.out.print(newarr[i][j]);
			}
			System.out.print("\n");
		}
}
}
