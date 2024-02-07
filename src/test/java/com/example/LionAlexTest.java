package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    Lion lion;
    @InjectMocks
    LionAlex lionAlex;

    @Test
    public void alexGetKittensNull(){
      int resultKittens = lionAlex.getKittens();
       assertEquals(0, resultKittens);
   }

   @Test
    public void alexGetThreeFriends(){
       List<String> resultThreeFriends = lionAlex.getFriends();
       assertEquals(List.of("Марти", "Глория", "Мелман"), resultThreeFriends);
   }

   @Test
    public void alexLivesNewYorkZoo(){
       String resultAlexLives = lionAlex.getPlaceOfLiving();
       assertEquals("Нью-Йоркский зоопарк", resultAlexLives);
   }

}
