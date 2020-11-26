package com.sourabh.mcsscoffeeservice.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class CoffeePagedList extends PageImpl<CoffeeDTO> {
    public CoffeePagedList(List<CoffeeDTO> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public CoffeePagedList(List<CoffeeDTO> content) {
        super(content);
    }
}
