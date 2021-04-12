
import static java.rmi.server.LogStream.log;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User-PC
 */
public class MathUtilityTest {

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument n mút be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return getFactorial(n - 1) * n;
    }
    public static void main(String[] args) {
        int n=5;
        long expected = 120;
        long actual= getFactorial(n);
        System.out.println("5! expected is: " + expected + "; actual value is: "+ actual);
    }
}