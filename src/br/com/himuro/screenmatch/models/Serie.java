package br.com.himuro.screenmatch.models;

public class Serie extends Title{
    private int seasons;
    private boolean isActive;
    private int episodesPerSeason;
    private int  minutesPerEpisode;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    @Override
    public int getMinutesDuration() {
        return seasons * episodesPerSeason * minutesPerEpisode;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }
}
