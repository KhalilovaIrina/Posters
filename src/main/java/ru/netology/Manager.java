package ru.netology;

public class Manager {
    private MovieRepository repo;

    public Manager(MovieRepository repo) {
        this.repo = repo;
    }

    public void add (Movie movie) {

        repo.save(movie);
    }

    public Movie[] findLast(int max) {
        if (max < 1) {
            max = 10;
        }
        int resultLength;
        Movie[] all = repo.findAll();
        if (max > all.length) {
            resultLength = all.length;
        } else {
            resultLength = max;
        }
        Movie[] reverse = new Movie[resultLength];

        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = all[all.length - 1 - i];
        }
        return reverse;
    }
}
