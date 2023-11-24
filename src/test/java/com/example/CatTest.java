package com.example;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    Cat cat;
    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Test
    public void CatGetSoundMeow(){
        String result =  cat.getSound();
        Assert.assertEquals("Мяу", result);
    }

    @Test
    public void CatGetFoodPredator() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        cat.getFood();
    }

}

