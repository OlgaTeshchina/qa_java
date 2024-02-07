package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    Predator predator;

    @InjectMocks
    Feline feline;

    @Test
    public void felineEatMeatPredator() throws Exception {
        List<String> resultEatMeat = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), resultEatMeat);
    }

    @Test
    public void felineGetFamilyFeline() {
        String resultFamily = feline.getFamily();
        assertEquals("Кошачьи", resultFamily);
    }

    @Test
    public void felineGetKittensDefault(){
        int resultGetKittens = feline.getKittens();
        assertEquals(1, resultGetKittens);
    }

}