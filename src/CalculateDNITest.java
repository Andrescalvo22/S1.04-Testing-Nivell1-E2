import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateDNITest {
    @ParameterizedTest
    @CsvSource({
            "12345678,Z",
            "11111111,H",
            "22222222,J",
            "33333333,P",
            "44444444,A",
            "55555555,K",
            "66666666,Q",
            "77777777,B",
            "88888888,Y",
            "99999999,R",
    })
    void testCalculateDNILetter(int numberDNI, char expectedLetter) {
        assertEquals(expectedLetter, CalculateDNI.calculateLetter(numberDNI));
    }
}
