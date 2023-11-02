import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void SortIntoHouse_StudentIsDaringAndMuggleBorn_StudentBelongsInGryffindor() {
        assertEquals(Main.getHouseStudentBelongsTo("daring", true), "Gryffindor");
    }

    @Test
    void SortIntoHouse_StudentIsBoldAndMuggleBorn_StudentBelongsInGryffindor() {
        assertEquals(Main.getHouseStudentBelongsTo("bold", true), "Gryffindor");
    }

    @Test
    void SortIntoHouse_StudentIsDaringAndIsNotMuggleBorn_StudentBelongsInGryffindor() {
        assertEquals(Main.getHouseStudentBelongsTo("daring", false), "Gryffindor");
    }

    @Test
    void SortIntoHouse_StudentIsBoldAndIsNotMuggleBorn_StudentBelongsInGryffindor() {
        assertEquals(Main.getHouseStudentBelongsTo("bold", false), "Gryffindor");
    }

    @Test
    void SortIntoHouse_StudentIsAmbitiousAndIsNotMuggleBorn_StudentBelongsInSlytherin() {
        assertEquals(Main.getHouseStudentBelongsTo("ambitious", false), "Slytherin");
    }

    @Test
    void SortIntoHouse_StudentIsDeterminedAndIsNotMuggleBorn_StudentBelongsInSlytherin() {
        assertEquals(Main.getHouseStudentBelongsTo("determined", false), "Slytherin");
    }

    @Test
    void SortIntoHouse_StudentIsAmbitiousAndMuggleBorn_StudentBelongsInHufflepuff() {
        assertEquals(Main.getHouseStudentBelongsTo("ambitious", true), "Hufflepuff");
    }

    @Test
    void SortIntoHouse_StudentIsDeterminedAndMuggleBorn_StudentBelongsInHufflepuff() {
        assertEquals(Main.getHouseStudentBelongsTo("determined", true), "Hufflepuff");
    }

    @Test
    void SortIntoHouse_StudentIsCleverAndMuggleBorn_StudentBelongsInRavenclaw() {
        assertEquals(Main.getHouseStudentBelongsTo("clever", true), "Ravenclaw");
    }

    @Test
    void SortIntoHouse_StudentIsWiseAndMuggleBorn_StudentBelongsInRavenclaw() {
        assertEquals(Main.getHouseStudentBelongsTo("wise", true), "Ravenclaw");
    }

    @Test
    void SortIntoHouse_StudentIsCleverAndIsNotMuggleBorn_StudentBelongsInRavenclaw() {
        assertEquals(Main.getHouseStudentBelongsTo("clever", false), "Ravenclaw");
    }

    @Test
    void SortIntoHouse_StudentIsWiseAndIsNotMuggleBorn_StudentBelongsInRavenclaw() {
        assertEquals(Main.getHouseStudentBelongsTo("wise", false), "Ravenclaw");
    }
}