package ru.netology.poster;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerTest {

    @Test
    public void shouldAddAndFindAll() {
        PosterManager manager = new PosterManager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithDefaultLimit() {
        PosterManager manager = new PosterManager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");

        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithCustomLimit() {
        PosterManager manager = new PosterManager(3);

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");

        String[] expected = {"Film 4", "Film 3", "Film 2"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWhenFilmsLessThanLimit() {
        PosterManager manager = new PosterManager(5);

        manager.add("Film 1");
        manager.add("Film 2");

        String[] expected = {"Film 2", "Film 1"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}