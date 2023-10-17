import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void SortIntoHouse_StudentIsDaringAndMuggleBorn_StudentBelongsInGryffindor() {
        assertEquals(Main.sortIntoHouse("daring", true), "Gryffindor");
    }

    @Test
    void SortIntoHouse_StudentIsBoldAndMuggleBorn_StudentBelongsInGryffindor() {
        assertEquals(Main.sortIntoHouse("bold", true), "Gryffindor");
    }

    @Test
    void SortIntoHouse_StudentIsDaringAndIsNotMuggleBorn_StudentBelongsInGryffindor() {
        assertEquals(Main.sortIntoHouse("daring", false), "Gryffindor");
    }

    @Test
    void SortIntoHouse_StudentIsBoldAndIsNotMuggleBorn_StudentBelongsInGryffindor() {
        assertEquals(Main.sortIntoHouse("bold", false), "Gryffindor");
    }

    @Test
    void SortIntoHouse_StudentIsAmbitiousAndIsNotMuggleBorn_StudentBelongsInSlytherin() {
        assertEquals(Main.sortIntoHouse("ambitious", false), "Slytherin");
    }

    @Test
    void SortIntoHouse_StudentIsDeterminedAndIsNotMuggleBorn_StudentBelongsInSlytherin() {
        assertEquals(Main.sortIntoHouse("determined", false), "Slytherin");
    }

    @Test
    void SortIntoHouse_StudentIsAmbitiousAndMuggleBorn_StudentBelongsInHufflepuff() {
        assertEquals(Main.sortIntoHouse("ambitious", true), "Hufflepuff");
    }

    @Test
    void SortIntoHouse_StudentIsDeterminedAndMuggleBorn_StudentBelongsInHufflepuff() {
        assertEquals(Main.sortIntoHouse("determined", true), "Hufflepuff");
    }

    @Test
    void SortIntoHouse_StudentIsCleverAndMuggleBorn_StudentBelongsInRavenclaw() {
        assertEquals(Main.sortIntoHouse("clever", true), "Ravenclaw");
    }

    @Test
    void SortIntoHouse_StudentIsWiseAndMuggleBorn_StudentBelongsInRavenclaw() {
        assertEquals(Main.sortIntoHouse("wise", true), "Ravenclaw");
    }

    @Test
    void SortIntoHouse_StudentIsCleverAndIsNotMuggleBorn_StudentBelongsInRavenclaw() {
        assertEquals(Main.sortIntoHouse("clever", false), "Ravenclaw");
    }

    @Test
    void SortIntoHouse_StudentIsWiseAndIsNotMuggleBorn_StudentBelongsInRavenclaw() {
        assertEquals(Main.sortIntoHouse("wise", false), "Ravenclaw");
    }
}