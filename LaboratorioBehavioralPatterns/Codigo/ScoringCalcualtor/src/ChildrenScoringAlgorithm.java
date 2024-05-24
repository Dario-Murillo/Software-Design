/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

import java.time.Duration;

public class ChildrenScoringAlgorithm extends ScoringAlgorithm{

  @Override
  protected int calculateBaseScore(int hits) {
    return hits * 200;
  }

  @Override
  protected int calculateReduction(Duration time) {
    long reduction = time.getSeconds() / 2;
    return  (int)reduction;
  }
  
}
