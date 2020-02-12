public class Engine {

  private String[][] board;
  private String[] symbols;
  private static final int BOARD_SIZE = 3;

  public Engine(String symbol1, String symbol2) {
    this.board = new String[BOARD_SIZE][BOARD_SIZE];
    for (int row = 0; row < BOARD_SIZE; row++) {
      for (int col = 0; col < BOARD_SIZE; col++) {
        board[row][col] = " ";
      }
    }
    this.symbols = new String[2];
    this.symbols[0] = symbol1;
    this.symbols[1] = symbol2;
  }

  public int[] parseInput(String input) {
    if (input.length() != 2) {
      return null;
    }
    int row = input.charAt(0) - 'a';
    int col = input.charAt(1) - '1';
    if (row >= BOARD_SIZE || col >= BOARD_SIZE) {
      return null;
    }
    if (!board[row][col].equals(" ")) {
      return null;
    }
    int[] coordinates = { row, col };
    return coordinates;

  }

  public void printBoard() {
    for (int row = 0; row < BOARD_SIZE; row++) {
      System.out.print((char) ('a' + row));
      System.out.print(" ");
      for (int col = 0; col < BOARD_SIZE; col++) {
        System.out.print(board[row][col]);
        if (col < 2)
          System.out.print("|");
      }
      System.out.println();
      if (row < 2)
        System.out.println("  -+-+-");
    }
    System.out.println("  1 2 3");
  }

  // TODO: Complete this method
  // Player is either 0 or 1, row and column are valid and empty
  public void playerTurn(int player, int row, int col) {
    return;
  }

  // TODO: Complete this method
  // Return true if the board is full
  // Return false if not
  public boolean checkTie() {
    return true;
  }

  public int checkWinner() {

    // Rows and columns
    for (int i = 0; i < BOARD_SIZE; i++) {
      if (!board[i][0].equals(" ") && board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2])) {
        if (board[i][0].equals("X")) {
          return 1;
        } else {
          return 2;
        }
      }
      if (!board[0][i].equals(" ") && board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i])) {
        if (board[0][i].equals("X")) {
          return 1;
        } else {
          return 2;
        }
      }
    }

    // Diagonal left to right
    if (!board[0][0].equals(" ") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
      if (board[0][0].equals("X")) {
        return 1;
      } else {
        return 2;
      }
    }

    // Diagonal right to left
    if (!board[0][2].equals(" ") && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
      if (board[0][2].equals("X")) {
        return 1;
      } else {
        return 2;
      }
    }

    return 0;
  }

}