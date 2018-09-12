package guru.springframework.sfgpetclinic;

/**
 * Created by Dégi János on 2018.09.03..
 */
public class LambdaExpressionTest {

    interface NumericTest {
        boolean computeTest(int n);
    }

    public static void main(String args[]) {
        NumericTest isEven = (n) -> (n % 2) == 0;
        NumericTest isNegative = (n) -> (n < 0);

        // Output: false
        System.out.println(isEven.computeTest(5));

        // Output: true
        System.out.println(isNegative.computeTest(-5));
    }

}
