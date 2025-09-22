import java.util.Stack;

public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    Stack<Integer> totrX = new Stack<>();
    Stack<Integer> totrY = new Stack<>();

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        int counter = 1;
        totrX.push(column);
        totrY.push(row);
        while(!totrX.isEmpty()){
            int tsX = totrX.firstElement();
            int tsY = totrY.firstElement();
            if(tsX>0){
                if(pixels[tsX-1][tsY] == 0){
                    totrX.push(tsX-1);
                    totrY.push(tsY);
                }
            }
            if(tsX<9){
                if(pixels[tsX+1][tsY] == 0){
                    totrX.push(tsX+1);
                    totrY.push(tsY);
                }
            }
            if(tsY>0){
                if(pixels[tsX][tsY-1] == 0){
                    totrX.push(tsX);
                    totrY.push(tsY-1);
                }
            }
            if(tsY<9){
                if(pixels[tsX][tsY+1] == 0){
                    totrX.push(tsX);
                    totrY.push(tsY+1);
                }
            }
            pixels[totrX][totrY] = counter;
            counter++;
        }
    }

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
