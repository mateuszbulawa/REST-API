package pl.mbulawa.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.mbulawa.restapi.service.AlgorithmService;

@RestController
public class AlgorithmController {

    @GetMapping(value = "/fib/{fibNumber}")
    public String countFibonacci(@PathVariable Integer fibNumber){
        return "Fibonacci's " + fibNumber + " number is: " + AlgorithmService.getFib(fibNumber);
    }

    @GetMapping(value = "/factorial/{factorialNumber}")
    public String countFactorial(@PathVariable Integer factorialNumber){
        return "Factorial of " + factorialNumber + " is: " + AlgorithmService.getFactorial(factorialNumber);
    }

    @GetMapping(value = "/prime/{primeNumber}")
    public String isPrime(@PathVariable Integer primeNumber) {
        boolean isPrime = AlgorithmService.isPrimeNumber(primeNumber);
        return (isPrime) ? primeNumber + " is a prime number" : primeNumber + " is not a prime number";
    }
}
