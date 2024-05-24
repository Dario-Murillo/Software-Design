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
