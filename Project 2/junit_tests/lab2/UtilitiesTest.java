package lab2;

import static org.junit.Assert.*;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UtilitiesTest {
    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);

    @Test
    public void test_0_0_() {
        int x = 150, y = 156;
        String result = Utilities.sumofEvensandOdds(x, y);
        String expect = "7 numbers between 150 and 156: sum of odds (459) and sum of evens (612)";
        String str = String.format("\nTest sumofEvensandOdds fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
                x, y, result, expect);
        assertEquals(expect, result);
        assertEquals(str, expect, result);
    }


    @Test
    public void test_0_1_() {
        int x = 9, y = 15;
        String result = Utilities.sumofEvensandOdds(x, y);
        String expect = "7 numbers between 9 and 15: sum of odds (48) and sum of evens (36)";
        String str = String.format("\nTest sumofEvensandOdds fail for (%d) and (%d)  Returned ( %s ), but correct is ( %s )\n",
                x, y, result, expect);
        assertEquals(expect, result);
        assertEquals(str, expect, result);
    }


    @Test
    public void test_0_2_() {
        int x = 9, y = 25;
        String result = Utilities.sumofEvensandOdds(x, y);
        String expect = "17 numbers between 9 and 25: sum of odds (153) and sum of evens (136)";
        String str = String.format("\nTest sumofEvensandOdds fail for (%d) and (%d)  Returned ( %s ), but correct is ( %s )\n",
                x, y, result, expect);
        assertEquals(expect, result);
        assertEquals(str, expect, result);
    }

    @Test
    public void test_0_3_() {
        int x = 0, y = 5;
        String result = Utilities.sumofEvensandOdds(x, y);
        String expect = "6 numbers between 0 and 5: sum of odds (9) and sum of evens (6)";
        String str = String.format("\nTest sumofEvensandOdds fail for (%d) and (%d)  Returned ( %s ), but correct is ( %s )\n",
                x, y, result, expect);
        assertEquals(expect, result);
        assertEquals(str, expect, result);
    }

    @Test
    public void test_0_4_() {
        int x = 10, y = 10;
        String result = Utilities.sumofEvensandOdds(x, y);
        String expect = "1 number between 10 and 10: sum of odds (0) and sum of evens (10)";
        String str = String.format("\nTest sumofEvensandOdds fail for (%d) and (%d)  Returned ( %s ), but correct is ( %s )\n",
                x, y, result, expect);
        assertEquals(expect, result);
        assertEquals(str, expect, result);
    }

    @Test
    public void test_0_5_() {
        int x = 7, y = 10;
        String result = Utilities.sumofEvensandOdds(x, y);
        String expect = "4 numbers between 7 and 10: sum of odds (16) and sum of evens (18)";
        String str = String.format("\nTest sumofEvensandOdds fail for (%d) and (%d)  Returned ( %s ), but correct is ( %s )\n",
                x, y, result, expect);
        assertEquals(expect, result);
        assertEquals(str, expect, result);
    }

    @Test
    public void test_1_0_() {
        int x = 150;
        String result = Utilities.minutesSeconds(x);
        String expect = "150 seconds is (2) minutes and (30) seconds";
        String str = String.format("\nTest minutesSeconds fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
                x, result, expect);
        assertEquals(str, expect, result);
    }

    @Test
    public void test_1_1_() {
        int x = 500;
        String result = Utilities.minutesSeconds(x);
        String expect = "500 seconds is (8) minutes and (20) seconds";
        String str = String.format("\nTest minutesSeconds fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
                x, result, expect);
        assertEquals(str, expect, result);
    }

    @Test
    public void test_1_2_() {
        int x = 50;
        String result = Utilities.minutesSeconds(x);
        String expect = "50 seconds is (0) minutes and (50) seconds";
        String str = String.format("\nTest minutesSeconds fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
                x, result, expect);
        assertEquals(str, expect, result);
    }

    @Test
    public void test_1_3_() {
        int x = 55820;
        String result = Utilities.minutesSeconds(x);
        String expect = "55820 seconds is (930) minutes and (20) seconds";
        String str = String.format("\nTest minutesSeconds fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
                x, result, expect);
        assertEquals(str, expect, result);
    }

    @Test
    public void test_1_4_() {
        int x = 3636;
        String result = Utilities.minutesSeconds(x);
        String expect = "3636 seconds is (60) minutes and (36) seconds";
        String str = String.format("\nTest minutesSeconds fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
                x, result, expect);
        assertEquals(str, expect, result);
    }

    @Test
    public void test_1_5_() {
        int x = 60;
        String result = Utilities.minutesSeconds(x);
        String expect = "60 seconds is (1) minutes and (0) seconds";
        String str = String.format("\nTest minutesSeconds fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
                x, result, expect);
        assertEquals(str, expect, result);
    }


    @Test
    public void test_2_0_() {
        int x = 1;
        int y = 2;
        int z = 2;
        double result = Utilities.fractionExponents(x, y, z);
        double expect = 0.25;
        final double THRESHOLD = .01;
        String str = String.format("\nTest fractionExponents fail for ((%d)/(%d))^(%d)  Returned ( %10.6f ), " +
                        "but correct is ( %10.6f )\n",
                x, y, z, result, expect);
        assertTrue(str, Math.abs(expect - result) < THRESHOLD);
    }

    @Test
    public void test_2_1_() {
        int x = 2;
        int y = 1;
        int z = -2;
        double result = Utilities.fractionExponents(x, y, z);
        double expect = 0.25;
        final double THRESHOLD = .01;
        String str = String.format("\nTest fractionExponents fail for ((%d)/(%d))^(%d)  Returned ( %10.6f ), " +
                        "but correct is ( %10.6f )\n",
                x, y, z, result, expect);
        assertTrue(str, Math.abs(expect - result) < THRESHOLD);
    }

    @Test
    public void test_2_2_() {
        int x = 2;
        int y = 1;
        int z = 0;
        double result = Utilities.fractionExponents(x, y, z);
        double expect = 1.0;
        final double THRESHOLD = .01;
        String str = String.format("\nTest fractionExponents fail for ((%d)/(%d))^(%d)  Returned ( %10.6f ), " +
                        "but correct is ( %10.6f )\n",
                x, y, z, result, expect);
        assertTrue(str, Math.abs(expect - result) < THRESHOLD);
    }

    @Test
    public void test_2_3_() {
        int x = 25;
        int y = 35;
        int z = 3;
        double result = Utilities.fractionExponents(x, y, z);
        double expect = 0.364431;
        final double THRESHOLD = .01;
        String str = String.format("\nTest fractionExponents fail for ((%d)/(%d))^(%d)  Returned ( %10.6f ), " +
                        "but correct is ( %10.6f )\n",
                x, y, z, result, expect);
        assertTrue(str, Math.abs(expect - result) < THRESHOLD);
    }


    @Test
    public void test_3_0_() {
        double x = 6000.0, y = 4.25;
        double result = Utilities.fiveyearbalance(x, y);

        final double THRESHOLD = .01;
        double expect = 7388.08;
        String str = String.format("\nTest fiveyearbalance fail for Balance=%.2f and Interest=%.2f Returned ( %f ), but correct is ( %f )\n",
                x, y, result, expect);
        assertTrue(str, Math.abs(expect - result) < THRESHOLD);
    }

    @Test
    public void test_3_1_() {
        double x = 3000.0, y = 3.5;
        double result = Utilities.fiveyearbalance(x, y);
        double expect = 3563.06;
        final double THRESHOLD = .01;
        String str = String.format("\nTest fiveyearbalance fail for Balance=%.2f and Interest=%.2f Returned ( %f ), but correct is ( %f )\n",
                x, y, result, expect);
        assertTrue(str, Math.abs(expect - result) < THRESHOLD);
    }

    @Test
    public void test_3_2_() {
        double x = 4000.0, y = 2.25;
        double result = Utilities.fiveyearbalance(x, y);
        double expect = 4470.71;
        final double THRESHOLD = .01;
        String str = String.format("\nTest fiveyearbalance fail for Balance=%.2f and Interest=%.2f Returned ( %f ), but correct is ( %f )\n",
                x, y, result, expect);
        assertTrue(str, Math.abs(expect - result) < THRESHOLD);
    }

    @Test
    public void test_3_3_() {
        double x = 1000.0, y = 2.25;
        double result = Utilities.fiveyearbalance(x, y);
        double expect = 1117.68;
        String str = String.format("\nTest fiveyearbalance fail for Balance=%.2f and Interest=%.2f Returned ( %f ), but correct is ( %f )\n",
                x, y, result, expect);
        final double THRESHOLD = .01;
        assertTrue(str, Math.abs(expect - result) < THRESHOLD);
    }
}