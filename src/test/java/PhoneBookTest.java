import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook testPhoneBook = new PhoneBook();

    private final String testName = "Семен";
    private final String testPhoneNumber = "+7(999)1002525";

    @Test
    void addTest(){
        //arrange
        int expected = 1;

        //act
        int result = testPhoneBook.add(testName,testPhoneNumber);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void addWithSameNameTest(){
        //arrange
        int expected = 1;
        testPhoneBook.add(testName,testPhoneNumber);

        //act
        int result = testPhoneBook.add(testName,testPhoneNumber);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByNumberTest(){
        //arrange
        String expected = "Семен";
        testPhoneBook.add(testName,testPhoneNumber);

        //act
        String result = testPhoneBook.findByNumber(testPhoneNumber);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByNameTest(){
        //arrange
        String expected = "+7(999)1002525";
        testPhoneBook.add(testName,testPhoneNumber);

        //act
        String result = testPhoneBook.findByName(testName);

        //assert
        Assertions.assertEquals(expected, result);
    }
}
