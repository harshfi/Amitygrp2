package Lec17;

import java.util.Iterator;

public class WordSearch {

	public static void main(String[] args) {
		
		char [][]board = {{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}};
		String word = "ABCCED";
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(board[i][j]==word.charAt(0)) {
					
					boolean check=find(i,j,board,0,word);
					if(check==true) {
						System.out.println(true);
						return;
					}
				}
			}
		}
		System.out.println(false);

	}
	public static boolean find
	(int row, int col,char board[][],int i,String word) {
		if(i==word.length()) {
			return true;
		}
		
		if(row<0 || row>=board.length||col<0 ||
				col>=board[0].length)return false;
		
		if(board[row][col]!=word.charAt(i))return false;
		
		boolean up = find(row-1,col,board,i+1,word);
		boolean down=find(row+1, col, board, i+1, word);
		boolean left= find(row, col-1, board, i+1, word);
		boolean right= find(row, col+1, board, i+1, word);
		
		return up||down||left||right;
		}

}
