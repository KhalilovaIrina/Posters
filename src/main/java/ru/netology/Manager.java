package ru.netology;
public class Manager {


    public Manager(int max) {
        if (max >= 1) {
            this.max = max;
        }
    }

    private int max = 10;

    public Manager() {
    }

    public Movie[] getList() {
        return list;
    }

    private Movie[] list = new Movie[0];

    public void add(Movie name) {
        Movie[] tmp = new Movie[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            tmp[i] = list[i];
        }
        tmp[tmp.length - 1] = name;
        list = tmp;
    }

    public Movie[] findAll() {
        return list;
    }

    public Movie[] findLast() {
        int resultLength;
        if (max > list.length ) {
            resultLength = list.length;
        } else resultLength = max;

        Movie[] reverse = new Movie[resultLength];

        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = list[list.length - 1 - i];
        }
        return reverse;
    }
}
