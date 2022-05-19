package NumericalAnalysis;

import java.io.*;
import java.util.*;

public class HallyeMethod {
    private static Scanner input = new Scanner(System.in);

    public static double[] polydiff(double[] coeff, int degree) {
        double[] res = new double[degree];
        for (int k = 1; k <= degree; k++) {
            res[k - 1] = (double) (k) * coeff[k];
        }
        return res;
    }

    public static double polyeval(double[] coeff, int degree, double x) {
        double res = 0.0;
        for (int k = 0; k <= degree; k++) {
            res = res + coeff[k] * Math.pow(x, (double) k);
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        double[] guess = new double[21];
        double alpha;
        double beta;
        int M = 0;
        System.out.println("Polynomial degree k>2");
        int degr = input.nextInt();
        double[] poly = new double[degr + 1];
        double[] polyprime = new double[degr];
        double[] polydoubleprime = new double[degr - 1];
        System.out.println("Coefficients in order c_k to c_0");
        for (int c = degr; c >= 0; c--) {
            System.out.println("c[" + c + "]:");
            poly[c] = input.nextDouble();
        }
        polyprime = polydiff(poly, degr);
        polydoubleprime = polydiff(polyprime, degr - 1);
        System.out.println("Starting estimate:");
        guess[0] = input.nextDouble();
        for (int j = 1; j < 21; j++) {
            guess[j] = 0.0;
        }
        ;
        while ((M < 20)) {
            alpha = (2.0 * polyeval(poly, degr, guess[M]) * polyeval(polyprime, degr - 1, guess[M]));
            beta = 2.0 * polyeval(polyprime, degr - 1, guess[M]) * polyeval(polyprime, degr - 1, guess[M]);
            beta = beta - polyeval(poly, degr, guess[M]) * polyeval(polydoubleprime, degr - 2, guess[M]);
            guess[M + 1] = guess[M] - alpha / beta;
            M = M + 1;
        }
        ;
        for (int i = 0; i < M + 1; i++) {
            System.out.println(i + "   " + guess[i] + "    " + polyeval(poly, degr, guess[i]));
        }
    }

}
