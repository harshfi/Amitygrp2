package Lec18;

public class RatInAMaze {

	public static void main(String[] args) {
	int	mat[][] = {{1, 0, 0, 0},
			       {1, 1, 0, 1},
			       {1, 1, 0, 0},
			       {0, 1, 1, 1}};
	
	     find("",0,0,mat);
	}
	public static void find
	(String ans, int row, int col, int mat[][]) {
		
		if(row==mat.length-1 &&col==mat[0].length-1) {
			System.out.println(ans);
			return;
		}
	
		if(row<0 || col<0 ||row>=mat.length||
				col>=mat[0].length || mat[row][col]==0)return;
		
		mat[row][col]=0;
		//up
		find(ans+"U", row-1, col, mat);
		//down
		find(ans+"D", row+1, col, mat);
		//left
		find(ans+"L",row,col-1,mat);
		//right
		find(ans+"R", row, col+1, mat);
		
		mat[row][col]=1;
		
	}

}
