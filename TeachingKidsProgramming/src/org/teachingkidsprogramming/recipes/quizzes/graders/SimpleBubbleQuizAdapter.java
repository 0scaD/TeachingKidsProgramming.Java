package org.teachingkidsprogramming.recipes.quizzes.graders;

import org.teachingextensions.logo.Tortoise;

public class SimpleBubbleQuizAdapter
{
  public int counter = 0;
  public void drawNextBase()
  {
    goToNextBase(100);
    drawDiamond(10);
  }
  public void goToNextBase(int size)
  {
    Tortoise.turn(-90);
    Tortoise.move(size);
    Tortoise.turn(-135);
  }
  public void drawDiamond(int size)
  {
    Tortoise.turn(45);
    Tortoise.move(size);
    Tortoise.turn(-90);
    Tortoise.move(size);
    Tortoise.turn(-90);
    Tortoise.move(size);
    Tortoise.turn(-90);
    Tortoise.move(size);
  }
  public void question1()
  {
  }
  public void question2(String letter1)
  {
  }
  public void question3()
  {
  }
  public void question4(org.teachingkidsprogramming.recipes.quizzes.graders.AdLibsQuizAdapter.Pieces pieces)
  {
  }
}
