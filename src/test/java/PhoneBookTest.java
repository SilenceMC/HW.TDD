import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    private final String testName = "Семен";
    private final String testPhoneNumber = "+7(999)1002525";

    @Test
    public void addTest(){
        //arrange
        int expected = 1;

        //act
        int result = phoneBook.add(testName,testPhoneNumber);

        //assert
        Assertions.assertEquals(expected, result);
    }
}
