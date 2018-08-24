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

    private int calculateNumberOfSpaces(int n)
    {
        return 2*n-2;
    }

    private int calculateNumberOfAsterisks(int n)
    {
        return 2*n - 1;
    }

    public void drawAnIsoscelesTriangle(int n)
    {
        int numberOfStars;
        int numberOfSpaces = calculateNumberOfSpaces(n);
        int spacesSplit;

        for (int i=1; i<=n; i++)
        {
            numberOfStars = calculateNumberOfAsterisks(i);
            if (numberOfSpaces == 1)
            {
                spacesSplit = 0;
            }
            else
            {
                spacesSplit = numberOfSpaces/2;
            }

            for (int j=0; j<spacesSplit; j++)
            {
                printSpace();
            }
            for (int j=0; j<numberOfStars; j++)
            {
                printAsterisk();
            }
            for (int j=0; j<spacesSplit; j++)
            {
                printSpace();
            }
            numberOfSpaces = numberOfSpaces - 2;
            System.out.print("\n");
        }
    }
}
