package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;


public class ManagerTests {

    MovieRepository repo = Mockito.mock(MovieRepository.class);
    Movie item = Mockito.mock(Movie.class);
//    Manager manager = new Manager(repo);
    Movie movie1 = new Movie(1, "Блэдшот");
    Movie movie2 = new Movie(2, "Вперед");
    Movie movie3 = new Movie(3, "Отель \"Белград\"");
    Movie movie4 = new Movie(4, "Человек-невидимка");
    Movie movie5 = new Movie(5, "Тролли.Мировой тур");
    Movie movie6 = new Movie(6, "Номер один");
    Movie movie7 = new Movie(7, "Фильм 7");
    Movie movie8 = new Movie(8, "Фильм 8");
    Movie movie9 = new Movie(9, "Фильм 9");
    Movie movie10 = new Movie(10, "Фильм 10");
    Movie movie11 = new Movie(11, "Фильм 11");

//    @BeforeEach
//    public void setup() {
//        manager.add(movie1);
//        manager.add(movie2);
//        manager.add(movie3);
//        manager.add(movie4);
//        manager.add(movie5);
//        manager.add(movie6);
//    }

    @Test
    public void shouldSaveMovie() {
        Movie [] items = {movie1, movie2, movie3, movie4, movie5, movie6};
        doReturn(items).when(repo).findAll();

        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6};
        Movie[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

//    @Test
//    public void shouldFindById() {
//        Movie [] item = {movie1, movie2, movie3, movie4, movie5};
//        doReturn(item).when(repo).findById(5);
//        doReturn(movie5).when(movie5).getId();
//
//        Movie[] expected = {movie5};
//        Movie[] actual = repo.findById(movie5.getId());
//
//        Assertions.assertArrayEquals(expected, actual);
//    }

//    @Test
//    public void shouldRemoveById() {
//
//        repo.removeById(movie5.getId());
//
//        Movie[] expected = {movie1, movie2, movie3, movie4, movie6};
//        Movie[] actual = repo.findAll();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldRemoveAll() {
//
//        repo.removeAll();
//
//        Movie[] expected = {};
//        Movie[] actual = repo.findAll();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//    @Test
//
//    public void shouldGetMoviesInReverseLimit11() {
//
//
//        Movie[] expected = {movie6, movie5, movie4, movie3, movie2,};
//
//        Movie[] actual = manager.findLast(5);
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//    @Test
//    public void shouldGetMoviesInReverseLimit0() {
//
//        manager.save(movie1);
//        manager.save(movie2);
//        manager.save(movie3);
//        manager.save(movie4);
//        manager.save(movie5);
//        manager.save(movie6);
//        manager.save(movie7);
//        manager.save(movie8);
//        manager.save(movie9);
//        manager.save(movie10);
//        manager.save(movie11);
//
//
//        Movie[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
//
//        Movie[] actual = manager.findLast(0);
//
//        Assertions.assertArrayEquals(expected, actual);
//    }

//    @Test
//
//    public void shouldGetMoviesInReverseLimit1() {
//        Manager manager = new Manager(1);
//
//        manager.save(movie1);
//        manager.save(movie2);
//        manager.save(movie3);
//        manager.save(movie4);
//        manager.save(movie5);
//        manager.save(movie6);
//        manager.save(movie7);
//        manager.save(movie8);
//        manager.save(movie9);
//        manager.save(movie10);
//        manager.save(movie11);
//
//
//        Movie[] expected = {movie11};
//
//        Movie[] actual = manager.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldGetMoviesInReverseLimit10() {
//        Manager manager = new Manager(10);
//
//        manager.save(movie1);
//        manager.save(movie2);
//        manager.save(movie3);
//        manager.save(movie4);
//        manager.save(movie5);
//        manager.save(movie6);
//        manager.save(movie7);
//        manager.save(movie8);
//        manager.save(movie9);
//        manager.save(movie10);
//        manager.save(movie11);
//
//
//        Movie[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
//
//        Movie[] actual = manager.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldGetMoviesInOrderEmpty() {
//        Movie[] expected = {};
//        Movie[] actual = repo.findAll();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//
//    public void shouldGetMoviesInReverseEmpty() {
//        Movie[] expected = {};
//        Movie[] actual = manager.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldGetMoviesInOrderOne() {
//        manager.save(movie1);
//        Movie[] expected = {movie1};
//        Movie[] actual = repo.findAll();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//
//    public void shouldGetMoviesInReverseOne() {
//        manager.save(movie1);
//        Movie[] expected = {movie1};
//        Movie[] actual = manager.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
}
