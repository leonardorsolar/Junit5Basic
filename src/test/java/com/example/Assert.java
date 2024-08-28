package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Assert {

    @Test
    public void assertivas() {
        List<String> s1 = new ArrayList<>();
        List<String> s2 = new ArrayList<>();
        List<String> s3 = null;
        assertEquals(s1, s2);
        assertNull(s3);
    }

}
