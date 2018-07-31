package com.thoughtworks.training.tomwang.todoservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.font.CoreMetrics;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    private  String name;
    private  String from;

}
