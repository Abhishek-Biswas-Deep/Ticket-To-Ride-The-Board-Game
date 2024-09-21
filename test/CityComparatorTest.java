import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityComparatorTest {

  @Test
  void compare() {

    City cityOne = new City("Montreal");
    City cityTwo = new City("Toronto");

    assertEquals(cityOne, cityOne, "Returned the correct output.");
    assertEquals(cityTwo, cityTwo, "Returned the correct output.");
    assertEquals(cityOne, cityTwo, "Sorry this returned incorrect output.");
    assertTrue(true, "Returned the correct output.");
    assertTrue(false, "Sorry this returned incorrect output.");

  }
}