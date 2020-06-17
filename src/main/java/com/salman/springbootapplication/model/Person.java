package com.salman.springbootapplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
public class Person {
    @JsonProperty("name")
    private final UUID id;
    @JsonProperty("id")
    private final String name;
    
}
