
public class nextGeneration {

  public static boolean[][] nextGen(boolean[][] cells) {
    boolean[][] nextgeneration = new boolean[cells.length - 1][cells.length - 1];
    for (int i = 0; i < cells.length - 1; i++) {
      for (int j = 0; j < cells.length - 1; j++) {
        if (isInside(cells, i, j) && numberOfNeighbors(cells, i, j) > 3 && checkCell(cells, i, j)) {
          nextgeneration[i][j] = true;
        } else
          nextgeneration[i][j] = false;
      }
    }
    return nextgaeneration;
  }

  public static boolean isInside(boolean[][] cells, int x, int y) {
    if (x > cells.length || y > cells.length || x < 0 || y < 0)
      return false;
    else
      return true;
  }

  public static boolean checkCell(boolean[][] cells, int x, int y) {
    if (cells[x][y])
      return true;
    else
      return false;
  }

  public static int numberOfNeighbors(boolean[][] cells, int x, int y) {
    int count = 0;
    if (isInside(cells, x, y) && checkCell(cells, x, y)) {
      if (cells[x--][y--])
        count++;
      if (cells[x][y--])
        count++;
      if (cells[x++][y--])
        count++;
      if (cells[x++][y])
        count++;
      if (cells[x++][y++])
        count++;
      if (cells[x][y++])
        count++;
      if (cells[x--][y++])
        count++;
      if (cells[x--][y])
        count++;
    } else if (!isInside(cells, x, y))
      throw OutOfBoundsExceptionStub;
    else if (!checkCell(cells, x, y))
      throw "this cell is dead";
    return count;
  }
}
