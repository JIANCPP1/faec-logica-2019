
public class MultiplicadorMatriz {
	
	public static void main(String[] args) {
		int [] [] A1 = new int [3][3];
		A1 [0][0] = 10;
		A1 [0][1] = 20;
		A1 [0][2] = 30;
		A1 [1][0] = 40;		
		A1 [1][1] = 50;
		A1 [1][2] = 60;
		A1 [2][0] = 10;		
		A1 [2][1] = 80;
		A1 [2][2] = 90;		
		
		int [] [] B1 = new int [3][3];
		B1 [0][0] = 1;
		B1 [0][1] = 2;
		B1 [0][2] = 3;
		B1 [1][0] = 4;		
		B1 [1][1] = 5;
		B1 [1][2] = 6;
		B1 [2][0] = 7;		
		B1 [2][1] = 8;
		B1 [2][2] = 9;	
		
		int [][] matriz = new int [3][3];
	
		for (int i = 0; i <3; i++){
		for (int j = 0; j <3; j++){
			
		for (int k = 0;k <3; k++){

					
		matriz [i][j] = matriz [i][j] + A1 [i][k] * B1 [k][j];		
		}
		}
	    }
		for (int i = 0; i <3; i++){
		for (int j = 0; j <3; j++){		
			
		System.out.print(matriz  [i][j]);	
		System.out.print(" ");
		}			                 
	    }		
				
	}		
}		
				