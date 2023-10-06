package br.com.himuro.screenmatch.calculations;

import br.com.himuro.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void insert(Title title){
        totalTime += title.getMinutesDuration();
    }
}
