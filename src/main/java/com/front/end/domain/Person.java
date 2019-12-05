package com.front.end.domain;

import lombok.*;

@Data
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private String occupation;
}
