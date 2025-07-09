public class CalculateDNI {

    public static final char[] Letters = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };

    public static char calculateLetter(int numberDNI) {
        if (numberDNI < 0 || numberDNI > 99999999) {
            throw new IllegalArgumentException("The DNI number does not exist, please try again!");
        }
        return Letters[numberDNI % 23];
    }
}


