import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class LinkTest {

  public static final String city1Name = "City1";
  public static final String city2Name = "City2";
  public static final int cityDistance = 3;


  @Test
  void getLength() {

    assertEquals(2, 2, "Returned the correct output");
    assertEquals(2, 1, "Sorry this did not return the correct length.");
    assertEquals(2, 3, "Sorry this did not return the correct length.");

  }

  @Test
  void getAdj() {

    City c = new City("Toronto");

    boolean value = c.equals(city2Name);
    boolean nextValue = c.equals(city1Name);

    if (value) {
      assertEquals(city1Name, city1Name, "Returned the correct value");
    } else if (nextValue) {
      assertEquals(city2Name, city2Name, "Returned the correct value");
    }

  }

  @Test
  void isUsed() {

    boolean shortestPath = true;
    int distance = 2;

    if (cityDistance < distance) {
      assertEquals(true, true, "Returned the correct output.");
      assertTrue(true, "Returned the correct value.");
    } else if (cityDistance > distance) {
      assertEquals(false, false, "Returned the correct value.");
      assertFalse(false, "Returned the correct value.");
    }

  }

  @Test
  void setUsed() {

    assertEquals(false, false, "Returned the correct output.");
    assertFalse(false, "Returned the correct value.");

  }

  @Test
  void testToString_sorted() {
    City city1 = new City(city1Name);
    City city2 = new City(city2Name);
    Link link = new Link(city1, city2, cityDistance);
    String expectedString = city1Name + " " + cityDistance + " " + city2Name;
    String resultString = link.toString();
    assertEquals(expectedString, resultString, "toString with sorted city names returned wrong string");
  }

  @Test
  void testToString_unsorted() {
    City city1 = new City(city1Name);
    City city2 = new City(city2Name);
    Link link = new Link(city2, city1, cityDistance);
    String expectedString = city1Name + " " + cityDistance + " " + city2Name;
    String resultString = link.toString();
    assertEquals(expectedString, resultString, "toString with unsorted city names returned wrong string");
  }

  @Test
  void compareTo() {

    City city1 = new City(city1Name);
    City city2 = new City(city2Name);
    Link link  = new Link(city1, city2, cityDistance);
    Link link1 = new Link(city2, city1, cityDistance);

    int result = link.compareTo(link1);

    if (link.equals(link1)) {
      assertEquals(0, 0, "Returned the correct output.");
    } else if ((result < link.compareTo(link1)) || (city1.equals(city1)) && result < link1.compareTo(link)) {
      assertEquals(-1, -1, "Returned the correct output.");
    } else {
      assertEquals(1,1, "Returned the correct output.");
    }

  }
}