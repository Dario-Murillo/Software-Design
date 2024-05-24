import java.time.Duration;

public class WomenScoringAlgorithm extends ScoringAlgorithm {

  @Override
  protected int calculateBaseScore(int hits) {
    return hits * 100;
  }

  @Override
  protected int calculateReduction(Duration time) {
    long reduction = time.getSeconds() / 4;
    return  (int)reduction;
  }
  
}
