package com.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;
    Lion lion;

    @Before
    public void setUp() throws Exception {
       lion = new Lion("Самец", feline);
    }

    @Test
    public void lionGetKittensOne() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1,lion.getKittens());
    }

    @Test
    public void lionGetFoodPredator() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), expectedFood);
    }

    @Test
    public void unknownSexGetFoodReturnException() throws Exception {
        Exception resultException = assertThrows(Exception.class, () -> {
            new Lion("Нет пола", feline); });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", resultException.getMessage());
    }

}
