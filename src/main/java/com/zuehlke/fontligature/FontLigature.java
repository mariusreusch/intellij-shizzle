package com.zuehlke.fontligature;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FontLigature {

    public void sayHello() {
        new ArrayList<Integer>().stream()
                .filter(number -> number >= 1)
                .filter(number -> number % 2 == 0)
                .filter(number -> number != 10)
                .collect(Collectors.toList());
    }
}
