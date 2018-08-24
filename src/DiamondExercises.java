public class DiamondExercises {
    private final char SPACE = ' ';
    private final char ASTERISK = '*';

    private void printSpace()
    {
        System.out.print(SPACE);
    }

    private void printAsterisk()
    {
        System.out.print(ASTERISK);
    }

    private int calcualteNumberOfSpaces(int n)
    {
        return 2*n-2;
    }

    private int calculateNumberOfAsterisks(int n)
    {
        return 2*n - 1;
    }
}
