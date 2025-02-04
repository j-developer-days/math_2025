package com.jdev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.jdev.utils.MathUtils.powGetInt;

public class MathLesson2Test {

    @Test
    void test_exponent() {
        int pow = powGetInt(9, 4);
        Assertions.assertEquals(6561, pow);

        pow = powGetInt(-3, 2);
        Assertions.assertEquals(9, pow);

        pow = -powGetInt(3, 2);
        Assertions.assertEquals(-9, pow);

        //lines 16 and 20 is the same
        pow = -1 * powGetInt(3, 2);
        Assertions.assertEquals(-9, pow);

        pow = powGetInt(-4, 3);
        Assertions.assertEquals(-64, pow);

        pow = -powGetInt(4, 3);
        Assertions.assertEquals(-64, pow);
    }


}
