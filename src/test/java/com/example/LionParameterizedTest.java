package com.example;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    @Mock
    Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Parameterized.Parameter
    public String sex;
    @Parameterized.Parameter(1)
    public Boolean expectedHasMane;

    @Parameterized.Parameters(name = "Наличие гривы у льва с полом {0} - {1}")
    public static Object[][] data(){
        return new Object[][]{
                {"Самка", false},
                {"Самец", true}
        };
    }

    @Test
    public void  lionHasManeTrueAndLionessHasManeFalse() throws Exception {
        Lion lion = new Lion(sex, feline);
        Boolean resultHasMane = lion.doesHaveMane();
        Assert.assertEquals(expectedHasMane, resultHasMane);
    }



}
