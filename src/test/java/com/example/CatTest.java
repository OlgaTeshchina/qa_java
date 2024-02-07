package com.example;
import static org.junit.Assert.assertEquals;
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
    public void catGetSoundMeow(){
        String result =  cat.getSound();
        assertEquals("Мяу", result);
    }

    @Test
    public void catGetFoodPredator() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> resultFood = cat.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), resultFood);
    }

}

