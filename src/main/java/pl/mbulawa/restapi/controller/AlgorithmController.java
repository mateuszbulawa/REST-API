package pl.mbulawa.restapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.mbulawa.restapi.service.AlgorithmService;

@RestController
@RequiredArgsConstructor
public class AlgorithmController {

    @Autowired
    private final AlgorithmService algorithmService;

    @GetMapping(value = "/fib/{fibNumber}")
    public String countFibonacci(@PathVariable Integer fibNumber){
        return "Fibonacci's " + fibNumber + " number is: " + algorithmService.getFib(fibNumber);
    }

    @GetMapping(value = "/factorial/{factorialNumber}")
    public String countFactorial(@PathVariable Integer factorialNumber){
        return "Factorial of " + factorialNumber + " is: " + algorithmService.getFactorial(factorialNumber);
    }

    @GetMapping(value = "/prime/{primeNumber}")
    public String isPrime(@PathVariable Integer primeNumber) {
        boolean isPrime = algorithmService.isPrimeNumber(primeNumber);
        return (isPrime) ? primeNumber + " is a prime number" : primeNumber + " is not a prime number";
    }
}
