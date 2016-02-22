/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.security.InvalidParameterException;
import java.util.Arrays;
import missingtwo.MissingTwo;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author matt
 */
public class MissingTwoTests {

    private MissingTwo mt;

    public MissingTwoTests() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        mt = new MissingTwo();
    }

    @After
    public void tearDown() {
    }

    @Test(expected = InvalidParameterException.class)
    public void throwsOnEmptyInput() {
        int[] input = new int[]{};
        int n = 0;
        mt.findMissingPair(input, n);
    }

    @Test
    public void findsTheMissingPair() {
        int[] input = new int[]{1, 2, 4, 5, 7};
        int n = 7;
        int[] result = mt.findMissingPair(input, n);
        assertArrayEquals(new int[]{3, 6}, result);
    }

    @Test
    public void findsTheMissingPairAtTheBeginning() {
        int[] input = new int[]{3, 4, 5, 6, 7, 8, 9, 10};
        int n = 10;
        int[] result = mt.findMissingPair(input, n);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void findsTheMissingPairAtTheEnd() {
        int[] input = new int[]{1, 2};
        int n = 4;
        int[] result = mt.findMissingPair(input, n);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{3,4}, result);
    }

    @Test
    public void findsTheMissingPairInTheMiddle() {
        int[] input = new int[]{1, 2, 3, 4, 7, 8, 9, 10};
        int n = 10;
        int[] result = mt.findMissingPair(input, n);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{5, 6}, result);
    }
    
        @Test
    public void findsTheMissingPairNearTheEnd() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 9};
        int n = 10;
        int[] result = mt.findMissingPair(input, n);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{8,10}, result);
    }
}
