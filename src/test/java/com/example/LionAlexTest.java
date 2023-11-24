package com.example;

import org.junit.Assert;
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
    public void AlexGetKittensNull(){
      int resultKittens = lionAlex.getKittens();
       Assert.assertEquals(0, resultKittens);
   }

   @Test
    public void AlexGetThreeFriends(){
       List<String> resultThreeFriends = lionAlex.getFriends();
       Assert.assertEquals(List.of("Марти", "Глория", "Мелман"), resultThreeFriends);
   }

   @Test
    public void AlexLivesNewYorkZoo(){
       String resultAlexLives = lionAlex.getPlaceOfLiving();
       Assert.assertEquals("Нью-Йоркский зоопарк", resultAlexLives);
   }
}
