/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

import java.time.Duration;

public abstract class ScoringAlgorithm {
    public int generateScore(int hits, Duration time) {
        int score = calculateBaseScore(hits);
        int reduction = calculateReduction(time);
        return calculateOverallScore(score, reduction);
    }

    protected abstract int calculateBaseScore(int hits);

    protected abstract int calculateReduction(Duration time);

    protected int calculateOverallScore(int baseScore, int reduction) {
        return baseScore - reduction;
    }
}
