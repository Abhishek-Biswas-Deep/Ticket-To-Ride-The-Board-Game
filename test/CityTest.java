import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

  public String link = "Montreal";
  public String city1 = "city1";
  public String city2 = "city2";

  @Test
  void find() {

    City c = new City("Winnipeg");
    assertNull(c.find("Winnipeg"), "Returned correct output!");

    City d = new City("New York");
    d = c.find("New York");
    assertEquals("New York", "New York", "Correct output!");
    assertEquals("New York", "Halifax", "Did not return the correct city.");
    assertEquals("New York", "Toronto", "Did not return the correct city.");

  }

  @Test
  void addLink() {

    assertNull(null, "Returned the correct output.");

  }

  @Test
  void compareTo() {

    assertEquals("New York", "New York", "Returned the correct output.");
    assertEquals("New York", "Halifax", "Did not return the correct output.");
    assertEquals("Winnipeg", "Halifax", "Did not return the correct output.");

  }

  @Test
  void testToString() {

    assertEquals("Toronto", "Toronto", "Returned the correct output.");
    assertEquals("Toronto", "New York", "The toString returned the incorrect output.");
    assertEquals("Winnipeg", "New York", "The toString returned the incorrect output.");
    assertEquals("Winnipeg", "Winnipeg", "The toString returned the incorrect output.");

  }

  @Test
  void compare() {

    City cityOne = new City(city1);
    City cityTwo = new City(city2);

    int distance = 1;
    int distance1 = 1;

    boolean value = cityOne.equals(city1) && distance == 1;
    boolean value1 = cityTwo.equals(city2) && distance == 1;

    boolean equals = cityOne.equals(city2) && distance == distance1;
    boolean equals1 = cityTwo.equals(city1) && distance == distance1;

    if (value) {
      assertEquals("negative", "negative", "Returned the correct output.");
      assertEquals("negative", 0, "Returned the incorrect output.");
      assertEquals("negative", 2, "Returned the incorrect output.");
    } else if (equals || equals1) {
      assertEquals(0, 0, "Returned the correct output.");
      assertEquals(0, 2, "Returned the incorrect output.");
      assertEquals(0, "negative", "Returned the incorrect output.");
      assertEquals(0, "positive", "Returned the incorrect output.");
    } else if (value1) {
      assertEquals("positive", "positive", "Returned the correct output.");
      assertEquals("positive", "negative", "Returned the incorrect output.");
      assertEquals("positive", 2, "Returned the incorrect output.");
    }

    assertTrue(true, "Correct output.");
    assertTrue(false, "Returned the incorrect output.");
    assertFalse(false, "Returned the correct output.");
    assertFalse(true, "Returned the incorrect output.");

  }

  @Test
  void getLinksTo() {

    City abc = new City(city1);

    assertNotNull(abc, "Returned the correct output.");
    assertEquals(city1, city1, "Returned the correct output.");
    assertEquals(city1, city2, "Returned the incorrect output.");
    assertNull(null, "Returned the correct output");

  }
}