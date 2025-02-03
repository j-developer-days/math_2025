package com.jdev;

import org.junit.jupiter.api.Test;

public class MathLesson1Test {

    @Test
    void test_() {
        double d1 = 109;
        double d2 = 8;
        System.out.println(d1 / d2);
        for (int i = 2; i < d1 - 1; i++) {
            System.out.println(i + "\t" + d1 / i);
        }
    }

}
