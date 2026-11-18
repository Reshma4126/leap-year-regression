package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class LeapYearTest {
    LeapYear l=new LeapYear();

    public void leap(){
        assertTrue(l.isleap(2000));
    }

    @Test
    public void notleap(){
        assertFalse(l.isleap(2026));
    }
}
