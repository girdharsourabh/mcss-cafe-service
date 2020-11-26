package com.sourabh.mcsscoffeeservice.controller;

import com.sourabh.mcsscoffeeservice.model.CoffeeDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/coffee")
@RestController
public class CoffeeController {

    @GetMapping("/{coffeeId}")
    public ResponseEntity<CoffeeDTO> getCoffeeById(@PathVariable("coffeeId") UUID coffeeId){
        //todo
        return new ResponseEntity<>(CoffeeDTO.builder().build(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity saveNewCoffee(@RequestBody CoffeeDTO coffeeDTO){
        //todo
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/coffee/"+ coffeeDTO.getId());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{coffeeId}")
    public ResponseEntity updateCoffeeById(@PathVariable("coffeeId") UUID coffeeId, @RequestBody CoffeeDTO coffeeDTO){
        //todo
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{coffeeId}")
    @ResponseStatus(HttpStatus.NO_CONTENT )
    public void deleteCoffee(@PathVariable("coffeeId") UUID coffeeId){

    }
}
