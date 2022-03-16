/**
 * A class that generates a 2-D char array representing an 'X'
 *
 * <p>Purdue University -- CS18000 -- Spring 2021</p>
 *
 * @author Mason
 * @version March 7, 2021
 */
public class DrawX {

    private int size;

    public DrawX(int size) {
        this.size = size;
    }

    public char[][] generateArray() {

        char[][] xArray = new char[size][size];

        // TODO

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                if (i == j) {
                    xArray[i][j] = '*';
                } else if ((i + j) == (size - 1)) {
                    xArray[i][j] = '*';
                } else {
                    xArray[i][j] = ' ';
                }



            }

        }

        return xArray;
    }
}

