public class TriangleExercises {

    public void easiestExerciseEver()
    {
        System.out.print("*");
    }

    public void drawAHorizontalLine(int numStars)
    {
        for (int i=0; i<numStars; i++)
        {
            easiestExerciseEver();
        }
    }

    public void drawAVerticalLine(int numStars)
    {
        for (int i=0; i<numStars; i++)
        {
            easiestExerciseEver();
            System.out.print("\n");
        }
    }

    public void drawARightTriangle(int n)
    {
        for (int i=1; i<=n; i++)
        {
            for (int j=0; j<i; j++)
            {
                easiestExerciseEver();
            }
            System.out.print("\n");
        }
    }
}
