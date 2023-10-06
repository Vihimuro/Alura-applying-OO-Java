package br.com.himuro.screenmatch.calculations;

import br.com.himuro.screenmatch.models.Classifiable;

public class RecommendationFilter {
    private String recommendation;

    public void filter(Classifiable classifiable) {
        if (classifiable.getClassification() >= 4) {
            System.out.println("One of the best choices");
        } else if (classifiable.getClassification() >=2) {
            System.out.println("Good title");
        }
        else {
            System.out.println("Watch later!");
        }
    }
}
