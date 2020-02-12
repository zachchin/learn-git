import java.util.Scanner;

public class Main {

  private static Engine engine;

  public static void main(final String[] args) {
    engine = new Engine("X", "O");
    final Scanner scanner = new Scanner(System.in);
    int player = 0;
    int winner = 0;
    while (winner == 0) {
      System.out.println("Player " + (player + 1) + "'s turn");
      System.out.println();
      engine.printBoard();
      String input = scanner.nextLine();
      int[] coordinates = engine.parseInput(input);
      while (coordinates == null) {
        System.out.println("Wrong input, try again.");
        input = scanner.nextLine();
        coordinates = engine.parseInput(input);
      }
      engine.playerTurn(player, coordinates[0], coordinates[1]);
      winner = engine.checkWinner();
      if (winner > 0) {
        engine.printBoard();
        System.out.println("Player " + winner + " wins!");
      } else if (engine.checkTie()) {
        winner = -1;
        engine.printBoard();
        System.out.println("Game Tied.");
      }
      player = (player + 1) % 2;
    }
    scanner.close();
  }
}