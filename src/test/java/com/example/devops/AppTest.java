package com.example.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void testAdd() {
        assertEquals(15, App.add(10, 5), "Sum should be 15");
    }
}
