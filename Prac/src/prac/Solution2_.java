package prac;

public class Solution2_ {
	public int solution(int[][] board) {
		int answer = 0;
		int[][] board2 = new int[board.length][board.length];
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				board2[i][j] = board[i][j];
			}
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				
				if (board[i][j] == 1) {
					if (i == 0) {
						if (j == 0) {
							board2[i][j + 1] = 2;
							board2[i + 1][j] = 2;
							board2[i + 1][j + 1] = 2;
						} else if (j == board.length-1) {
							board2[i][j - 1] = 2;
							board2[i+1][j-1] = 2;
							board2[i+1][j-1] = 2;
						} else {
							board2[i][j-1] = 2;
							board2[i][j+1] = 2;
							board2[i+1][j-1] = 2;
							board2[i+1][j] = 2;
							board2[i+1][j+1] = 2;
						}
					} else if(i == board.length-1) {
						if(j == 0) {
							board2[i][j+1] = 2;
							board2[i-1][j] = 2;
							board2[i-1][j+1] = 2;
						} else if(j == board.length-1) {
							board2[i][j-1] = 2;
							board2[i-1][j] = 2;
							board2[i-1][j-1] = 2;
						}else {
							board2[i][j-1] = 2;
							board2[i][j+1] = 2;
							board2[i-1][j-1] = 2;
							board2[i-1][j] = 2;
							board2[i-1][j+1] = 2;
						}
					} else {
						if(j == 0) {
							board2[i][j+1] = 2;
							board2[i-1][j+1] = 2;
							board2[i-1][j] = 2;
							board2[i+1][j] = 2;
							board2[i+1][j+1] = 2;
						} else if(j == board.length-1) {
							board2[i][j-1] = 2;
							board2[i-1][j-1] = 2;
							board2[i-1][j] = 2;
							board2[i+1][j] = 2;
							board2[i+1][j-1] = 2;
						} else {
							board2[i][j-1] = 2;
							board2[i][j+1] = 2;
							board2[i+1][j-1] = 2;
							board2[i+1][j] = 2;
							board2[i+1][j+1] = 2;
							board2[i-1][j-1] = 2;
							board2[i-1][j] = 2;
							board2[i-1][j+1] = 2;
						}
					}
				}
			}
		}
		
		for(int[] a : board2) {
			for(int i = 0; i < board2.length; i++) {
				if(a[i] == 0) answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[][] board = { {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, { 1, 1, 1, 1, 1, 1}, { 1, 1, 1, 1, 1, 1} };
		System.out.println(s.solution(board));
	}

}
