package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class FelineTestGetKittens {
    @Mock
    Predator predator;
    @InjectMocks
    private Feline feline;

    public int kittensCount;
    public int expectedResult;

    public FelineTestGetKittens(int kittensCount, int expectedResult){
        this.kittensCount = kittensCount;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount(){
        return new Object[][] {
                {1, 1},
                {2, 2},
                {3, 3},
                {4, 4}
        };
    }

    @Before
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void felineGetKittensDifferentQuantities(){
        int resultGetKittens = feline.getKittens(kittensCount);
        assertEquals(expectedResult, resultGetKittens);
    }

}
