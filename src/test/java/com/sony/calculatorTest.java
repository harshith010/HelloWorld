package com.sony;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class calculatorTest {

    @Test
    public void testAddition(){
       calculator cal = new calculator();
       assertEquals(9, cal.add(5,4));
    }
}
