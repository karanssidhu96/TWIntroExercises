import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    List<Integer> primeFactors = new ArrayList<Integer>();
    public void generate(int n)
    {
        while (n % 2 == 0)
        {
            primeFactors.add(2);
            n = n/2;
        }
        for (int i=3; i<=Math.sqrt(n); i = i + 2)
        {
            while (n % i == 0)
            {
                primeFactors.add(i);
                n = n/i;
            }
        }
        if (n > 2){ primeFactors.add(n); }
        System.out.println(primeFactors);
    }
}
