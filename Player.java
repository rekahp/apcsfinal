import java.util.Scanner;

class Player {
  private String symbol;

  public Player(String symbol) {
    this.symbol = symbol;
  }

  public String getSymbol() {
    return symbol;
  }

  public int getRow(Board board) {
    Scanner scanner = new Scanner(System.in);
    int row = -1;
    while (row < 0 || row >= 3) {
      System.out.print("Enter a row (0, 1, 2): ");
      row = scanner.nextInt();
    }
    return row;
  }

  public int getColumn(Board board) {
    Scanner scanner = new Scanner(System.in);
    int col = -1;
    while (col < 0 || col >= 3) {
      System.out.print("Enter a column (0, 1, 2): ");
      col = scanner.nextInt();
    }
    return col;
  }
}
