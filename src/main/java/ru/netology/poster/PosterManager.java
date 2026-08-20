package ru.netology.poster;

public class PosterManager {
    private String[] films = new String[0];

    private int limit;

    public PosterManager() {
        this.limit = 5;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[films.length] = film;
        films = tmp;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length > limit) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }

    public String[] findAll() {
        return films;
    }
}