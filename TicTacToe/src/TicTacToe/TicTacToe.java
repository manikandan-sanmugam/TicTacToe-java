package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
		public static void main(String[] args) {
		char[][] board= {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
		int flag=0;
		int cnt=0;
		char currPlay='X';
		Scanner sc=new Scanner(System.in);
		System.out.println("Player 1:");
		String p1=sc.next();
		System.out.println("Player 2");
		String p2=sc.next();
		printBoard(board);
		while(flag==0) {
			int i=sc.nextInt()-1;
			int j=sc.nextInt()-1;
			if(board[i][j]!='-') {
				System.out.println("Invalid move");
			}
			else {
				board[i][j]=currPlay;
				printBoard(board);
				check(board,p1,p2,flag);
				if(currPlay=='X')
					currPlay='O';
				else currPlay='X';
				cnt++;
			}
			if(cnt==9)
				System.out.println("Game Over");	
		}
	}
	
	public static void printBoard(char[][] board) {
		for(int i=0; i<3;i++)
		{
			System.out.println(board[i][0]+" "+board[i][1]+" "+board[i][2]);
		}
	}
	public static void check(char[][] board,String p1, String p2, int flag) {
		if(board[0][0]==board[1][1] && board[1][1]==board[2][2] && board[0][0]!='-') {
			if(board[0][0]=='X')
				System.out.println(p1+" is winner");
			else {
				System.out.println(p2+" is winner");
			}
			flag=1;
		}
		else if(board[0][2]==board[1][1] && board[1][1]==board[2][0] && board[1][1]!='-') {
			if(board[1][1]=='X')
				System.out.println(p1+" is winner");
			else {
				System.out.println(p2+" is winner");
			}
			flag=1;
		}
		else if(board[0][0]==board[0][1] && board[0][1]==board[0][2] && board[0][0]!='-') {
			if(board[0][0]=='X')
				System.out.println(p1+" is winner");
			else {
				System.out.println(p2+" is winner");
			}
			flag=1;
		}
		else if(board[1][0]==board[1][1] && board[1][1]==board[1][2] && board[1][0]!='-') {
			if(board[1][0]=='X')
				System.out.println(p1+" is winner");
			else {
				System.out.println(p2+" is winner");
			}
			flag=1;
		}
		else if(board[2][0]==board[2][1] && board[2][1]==board[2][2] && board[2][0]!='-') {
			if(board[2][0]=='X')
				System.out.println(p1+" is winner");
			else {
				System.out.println(p2+" is winner");
			}
			flag=1;
		}
		else if(board[0][0]==board[1][0] && board[1][0]==board[2][0] && board[0][0]!='-') {
			if(board[0][0]=='X')
				System.out.println(p1+" is winner");
			else {
				System.out.println(p2+" is winner");
			}
			flag=1;
		}
		else if(board[0][1]==board[1][1] && board[1][1]==board[2][1] && board[0][1]!='-') {
			if(board[0][1]=='X')
				System.out.println(p1+" is winner");
			else {
				System.out.println(p2+" is winner");
			}
			flag=1;
		}
		else if(board[0][2]==board[1][2] && board[1][2]==board[2][2] && board[0][2]!='-') {
			if(board[0][2]=='X')
				System.out.println(p1+" is winner");
			else {
				System.out.println(p2+" is winner");
			}
			flag=1;
		}
			
		
	}

}
