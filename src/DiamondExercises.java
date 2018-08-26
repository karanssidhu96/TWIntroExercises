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

    private int calculateNumberOfSpaces(int n) { return 2*n-2; }

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

            drawTriangleRow(spacesSplit, numberOfStars);
            numberOfSpaces = numberOfSpaces - 2;
            System.out.print("\n");
        }
    }

    private void drawTriangleRow(int spacesSplit, int numberOfStars)
    {
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
    }

    private void drawAnInvertedIsoscelesTriangle(int n, boolean withName)
    {
        int numberOfStars;
        int numberOfSpaces = withName? 0 : 2;
        int spacesSplit;

        for (int i=n; i>0; i--)
        {
            numberOfStars = calculateNumberOfAsterisks(i);
            spacesSplit = numberOfSpaces/2;

            drawTriangleRow(spacesSplit, numberOfStars);
            numberOfSpaces = numberOfSpaces + 2;
            System.out.print("\n");
        }
    }

    public void drawADiamond(int n)
    {
        drawAnIsoscelesTriangle(n);
        drawAnInvertedIsoscelesTriangle(n-1, false);
    }

    public void drawADiamondWithAName(int n, String name)
    {
        drawAnIsoscelesTriangle(n-1);
        System.out.println(name);
        drawAnInvertedIsoscelesTriangle(n-1, true);
    }
}
