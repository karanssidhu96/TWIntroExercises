public class Main {

    public static void main(String[] args) {
	    TriangleExercises te = new TriangleExercises();
	    DiamondExercises de = new DiamondExercises();

	    te.easiestExerciseEver();
	    System.out.print("\n");

	    te.drawAHorizontalLine(5);
        System.out.print("\n");

        te.drawAVerticalLine(5);
        System.out.print("\n");

        te.drawARightTriangle(3);
        System.out.print("\n");

        de.drawAnIsoscelesTriangle(3);
        System.out.print("\n");

        de.drawADiamond(3);
        System.out.print("\n");

        de.drawADiamondWithAName(3, "Karan");
        System.out.print("\n");
    }
}
