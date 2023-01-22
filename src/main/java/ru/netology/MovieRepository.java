package ru.netology;

public class MovieRepository {
    private Movie[] items = new Movie[0];

    public void save(Movie item) {
        Movie[] tmp = new Movie[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public Movie[] findAll() {

        return items;
    }

    public Movie[] findById(int id) {
        Movie[] tmp = new Movie[1];
        int copyToIndex = 0;
        for (Movie item : items) {
            if (item.getId() == id) {
                tmp[copyToIndex] = item;
//                if (item.getId() != null) {
//                    tmp = null;
//                }
            }
            items = tmp;
        }
        return items;
    }

    public void removeById(int id) {
        Movie[] tmp = new Movie[items.length - 1];
        int copyToIndex = 0;
        for (Movie item : items) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
    }

    public void removeAll() {
        Movie[] tmp = new Movie[0];
        items = tmp;
    }
}
