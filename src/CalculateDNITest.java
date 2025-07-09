import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateDNITest {
    @ParameterizedTest
    @CsvSource({
            "12345678,Z",  // 12345678 % 23 = 14 → 'Z'
            "11111111,H",  // 11111111 % 23 = 18 → 'H'
            "22222222,M",  // 22222222 % 23 = 5  → 'M'
            "33333333,B",  // 33333333 % 23 = 11 → 'B'
            "44444444,Y",  // 44444444 % 23 = 6  → 'Y'
            "55555555,R",  // 55555555 % 23 = 1  → 'R'
            "66666666,D",  // 66666666 % 23 = 9  → 'D'
            "77777777,N",  // 77777777 % 23 = 12 → 'N'
            "88888888,L",  // 88888888 % 23 = 19 → 'L'
            "99999999,J",  // 99999999 % 23 = 13 → 'J'
    })

    void testCalculateDNILetter(int numberDNI, char expectedLetter) {
        assertEquals(expectedLetter, CalculateDNI.calculateLetter(numberDNI));
    }
}
