/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

import java.time.Duration;

public class MenScoringAlgorithm extends ScoringAlgorithm {

  @Override
  protected int calculateBaseScore(int hits) {
    return hits * 100;
  }

  @Override
  protected int calculateReduction(Duration time) {
    long reduction = time.getSeconds() / 5;
    return  (int)reduction;
  }
  
}
