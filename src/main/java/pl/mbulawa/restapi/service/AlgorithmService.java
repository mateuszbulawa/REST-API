package pl.mbulawa.restapi.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class AlgorithmService {
    public int getFib(int number) {
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
    public int getFactorial(Integer factorialNumber) {
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
    public boolean isPrimeNumber(Integer primeNumber) {
        if (primeNumber < 2) return false;

        for (int i = 2; i * i < primeNumber; i++)
            if (primeNumber % i == 0)
                return false;

        return true;
    }
}
