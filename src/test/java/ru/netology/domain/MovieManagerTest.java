package ru.netology.domain;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    Movie first = new Movie(1, "Sweet_Girl", "Url01", "action");
    Movie second = new Movie(2, "Tom_&_Jerry", "Url02", "cartoon");
    Movie third = new Movie(3, "Cruella", "Url03", "comedy");
    Movie fourth = new Movie(4, "Wrath_of_Man", "Url04", "action");
    Movie fifth = new Movie(5, "Invisible_man", "Url05", "horror");
    Movie sixth = new Movie(6, "Trolls'", "Url06", "cartoon");
    Movie seventh = new Movie(7, "Batiya", "Url07", "comedy");
    Movie eight = new Movie(8, "Together_together", "Url08", "comedy");
    Movie ninth = new Movie(9, "Hotel_Transylvania_4", "Url09", "cartoon");
    Movie tenth = new Movie(10, "Thunder_Force", "Url010", "comedy");
    Movie eleventh = new Movie(11, "Kate", "Url011", "action");

    @Test
    void shouldAddedMovie() {
        MovieManager manager = new MovieManager(4);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowEmpty() {
        MovieManager manager = new MovieManager(10);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetCurrentFilms() {
        MovieManager manager = new MovieManager(5);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        Movie[] actual = manager.getLastMovie();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eight, seventh};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldGetCurrentFilmsDefaultManager() {
        MovieManager manager = new MovieManager();
        Movie[] actual = manager.getLastMovie();
        Movie[] expected = new Movie[]{};

        assertArrayEquals(expected, actual);
    }
}