
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        // implement the creation of a magic square with the Siamese method algorithm here
        MagicSquare magicSquare = new MagicSquare(size);
        int row = 0;
        int col = size / 2;
        for (int i = 1; i <= size; i++) {
            magicSquare.placeValue(row, col, i);
            int nextRow = (row - 1 + size) % size;
            int nextCol = (col + 1) % size;

            if (magicSquare.readValue(nextRow,nextCol) != 0) {
                row = (row + 1) % size;
            } else {
                row = nextRow;
                col = nextCol;
            }
        }
        return magicSquare;
    }
        
    }
