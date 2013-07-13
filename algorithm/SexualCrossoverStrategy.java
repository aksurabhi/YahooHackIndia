
package gpfinance.algorithm;

import gpfinance.algorithm.interfaces.SelectionStrategy;
import gpfinance.algorithm.interfaces.CrossoverStrategy;
import java.util.ArrayList;

/**
 * @date   14-July-2013
 * @author Sudheesh Singanamalla
 */
public class SexualCrossoverStrategy implements CrossoverStrategy {
    
    private double probability;
    private SelectionStrategy selectionStrategy;

    public SexualCrossoverStrategy(double probability, SelectionStrategy selectionStrategy) {
        this.probability = probability;
        this.selectionStrategy = selectionStrategy;
    }
    
    @Override
    public ArrayList<Individual> crossover(ArrayList<Individual> population, double progress){
        ArrayList<Individual> crossoverOffspring = new ArrayList();
        return crossoverOffspring;
    }
    
    private void crossoverPair(Individual parent1, Individual parent2){
        
    }
}
