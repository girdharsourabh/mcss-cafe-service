package com.sourabh.mcsscoffeeservice.repository;

import com.sourabh.mcsscoffeeservice.domain.Coffee;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface CoffeeRepository extends PagingAndSortingRepository<Coffee, UUID> {
}
