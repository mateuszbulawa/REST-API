package pl.mbulawa.restapi;

public class Algorithm {
    public static int getFib(int number) {
        switch (number) {
            case 0 -> {
                return 0;
            }
            case 1 -> {
                return 1;
            }
            default -> {
                return getFib(number - 1) + getFib(number - 2);
            }
        }
    }

    public static int getFactorial(Integer factorialNumber) {
        switch (factorialNumber) {
            case 0 -> {
                return 0;
            }
            case 1 -> {
                return 1;
            }
            default -> {
                return factorialNumber * getFactorial(factorialNumber - 1);
            }
        }
    }

    public static boolean isPrimeNumber(Integer primeNumber) {
        if (primeNumber < 2) return false;

        for (int i = 2; i * i < primeNumber; i++)
            if (primeNumber % i == 0)
                return false;

        return true;
    }
}
