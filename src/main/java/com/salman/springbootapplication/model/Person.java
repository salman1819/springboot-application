package com.salman.springbootapplication.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
public class Person {
    private final UUID id;
    private final String name;
    
}
