package Lec18;

public class N_Queen {

	public static void main(String[] args) {
		int queen=4;
		int ghar[][]=new int [4][4];
		place(0,queen,ghar);

	}
	public static void place
	(int row, int queen, int ghar[][]) {
		
		if(queen==0) {
			print(ghar);
			return ;
		}
		
		for(int col=0;col<ghar[0].length;col++) {
			
			if(isSafe(row,col,ghar)==true) {
				ghar[row][col]=1;
				place(row+1,queen-1,ghar);
				ghar[row][col]=0;
			}
		}
		
	}
	
	public static boolean isSafe
	(int row, int col, int ghar[][]) {
		
		int r=row;
		//up side
		while(r>=0) {
			
			if(ghar[r][col]==1)return false;
			r--;
		}
		//left Dia
		r=row;
		int c=col;
		while(r>=0 && c>=0) {
			if(ghar[r][c]==1)return false;
			r--;
			c--;
		}
		//right dia
		r=row;
		c=col;
		while(r>=0 && c<ghar[0].length) {
			if(ghar[r][c]==1)return false;
			r--;
			c++;
		}
		return true;
		
	}
	
  static void print(int ghar[][]) {
	  for (int i = 0; i < ghar.length; i++) {
		for (int j = 0; j < ghar[0].length; j++) {
			if(ghar[i][j]==1) {
				System.out.print("Q ");
			}
			else System.out.print("- ");
		}
		System.out.println();
	}
	  System.out.println();
	  System.out.println();
	  
  }

}
