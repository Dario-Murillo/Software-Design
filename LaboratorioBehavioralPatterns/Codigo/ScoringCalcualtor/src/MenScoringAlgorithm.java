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
