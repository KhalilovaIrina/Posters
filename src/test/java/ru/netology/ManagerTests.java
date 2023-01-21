package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTests {

    Movie movie1 = new Movie("Блэдшот");
    Movie movie2 = new Movie("Вперед");
    Movie movie3 = new Movie("Отель \"Белград\"");
    Movie movie4 = new Movie("Человек-невидимка");
    Movie movie5 = new Movie("Тролли.Мировой тур");
    Movie movie6 = new Movie("Номер один");
    Movie movie7 = new Movie("Фильм 7");
    Movie movie8 = new Movie("Фильм 8");
    Movie movie9 = new Movie("Фильм 9");
    Movie movie10 = new Movie("Фильм 10");
    Movie movie11 = new Movie("Фильм 11");

    @Test
    public void shouldAddMovie() {
        Manager manager = new Manager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);

        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6};
        Movie[] actual = manager.getList();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldGetMoviesInReverseLimit0() {
        Manager manager = new Manager(0);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);


        Movie[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};

        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void shouldGetMoviesInReverseLimit1() {
        Manager manager = new Manager(1);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);


        Movie[] expected = {movie11};

        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetMoviesInReverseLimit10() {
        Manager manager = new Manager(10);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);


        Movie[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};

        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void shouldGetMoviesInReverseLimit11() {
        Manager manager = new Manager(11);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);


        Movie[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};

        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetMoviesInOrderEmpty() {
        Manager manager = new Manager();
        Movie[] expected = {};
        Movie[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldGetMoviesInReverseEmpty() {
        Manager manager = new Manager();
        Movie[] expected = {};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetMoviesInOrderOne() {
        Manager manager = new Manager();
        manager.add(movie1);
        Movie[] expected = {movie1};
        Movie[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldGetMoviesInReverseOne() {
        Manager manager = new Manager();
        manager.add(movie1);
        Movie[] expected = {movie1};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
