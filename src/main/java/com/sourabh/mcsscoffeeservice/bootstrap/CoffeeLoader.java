package com.sourabh.mcsscoffeeservice.bootstrap;

import com.sourabh.mcsscoffeeservice.domain.Coffee;
import com.sourabh.mcsscoffeeservice.repository.CoffeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CoffeeLoader implements CommandLineRunner {

    private final CoffeeRepository coffeeRepository;

    public CoffeeLoader(CoffeeRepository coffeeRepository){
        this.coffeeRepository = coffeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadCoffeeObjects();
    }

    private void loadCoffeeObjects() {
        if (coffeeRepository.count() == 0){
            coffeeRepository.save(Coffee.builder()
            .coffeeName("Sourabh Coffee 1")
            .coffeeStyle("Latte")
            .quantityOnHand(200)
            .minOnHand(12)
            .upc(335121212121232L)
            .price(new BigDecimal("12.95"))
            .build());

            coffeeRepository.save(Coffee.builder()
                    .coffeeName("Coffee 2")
                    .coffeeStyle("Espresso")
                    .quantityOnHand(200)
                    .minOnHand(12)
                    .upc(3351212121212121L)
                    .price(new BigDecimal("10.45"))
                    .build());
        }

        System.out.println("Coffees loaded: "+ coffeeRepository.count());
    }
}
