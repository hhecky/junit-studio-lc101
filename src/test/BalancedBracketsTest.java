package test;

import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {

        assertEquals(true, true);
    }
    @Test
    public void onlyBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void bracketsWithStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[string]"));
    }
    @Test
    public void bracketsInsideStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("str[ing]s"));
    }
    @Test
    public void bracketsBehindStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("string[]"));
    }
    @Test
    public void bracketsInFrontOfStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]string"));
    }
    @Test
    public void twoSetsOfBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void doubleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void backwardsBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[string"));
    }
    @Test
    public void mismatchedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[string[]"));
    }
    @Test
    public void doubleLeftRightBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]][["));
    }
}
