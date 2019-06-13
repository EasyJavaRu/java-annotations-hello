package ru.easyjava.java;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class GreeterTest {

    @Test
    public void testGreet() throws Exception {
        Greeter testedObject = new Greeter();

        assertThat(testedObject.greet("TEST"), is("Hello, TEST"));
    }
}