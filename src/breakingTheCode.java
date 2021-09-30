import java.util.Locale;

public class breakingTheCode {
    public static int characterToIndex(String character){
        int charIndex = "ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ".indexOf(character.toUpperCase(Locale.ROOT))+1;
        return charIndex;
    }
    public static char indexToCharacter(int index){
        // sequence of 3 alphabets. The second A is the reference character - from there I can go forward or backwards in the alphabet
        char character = "ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ".charAt(index-1);
        return character;
    }

    public static char caesarCharacterEncoder(String character){
        // + 29 to make reference point at second A
        return indexToCharacter(characterToIndex(character)+3+29);
    }

    public static char caesarCharacterDecoder(String character){
        // + 29 to make reference point at second A
        return indexToCharacter(characterToIndex(character)-3+29);
    }

    public static String numberCypherEncoder(String stringToEncode){
        int i = 0;
        String encodedString = "";
        // Add characters to encodedString as they get encoded and a ";" between character
        while (i < stringToEncode.length()) {
            encodedString += characterToIndex(String.valueOf(stringToEncode.charAt(i))) + ";";
            i += 1;
        }
        // removes last character as it is a ";"
        return encodedString.substring(0,encodedString.length()-1);
    }

    public static String numberCypherDecoder(String stringToDecode){
        int indexOfStringBeginning = 0; // keeps track of where new number starts
        String decodedString = "";
        for (int i = 0;i < stringToDecode.length();i++) {
            // Finds ";" and decodes previous number
            if (stringToDecode.charAt(i) == ';') {
                int indexToDecode = Integer.parseInt(stringToDecode.substring(indexOfStringBeginning, i));
                decodedString += indexToCharacter(indexToDecode);
                indexOfStringBeginning = i+1;
            }
            // at the string end add last number
            if (stringToDecode.length()==i+1) {
                int indexToDecode = Integer.parseInt(stringToDecode.substring(indexOfStringBeginning,stringToDecode.length()));
                decodedString += indexToCharacter(indexToDecode);
            }
        }
        return decodedString;
    }

    public static String caesarEncoder(String stringToEncode){
        int i = 0;
        String encodedString = "";
        // encodes each character and adds character to string encodedString
        while (i < stringToEncode.length()) {
            encodedString += caesarCharacterEncoder(String.valueOf(stringToEncode.charAt(i))) ;
            i += 1;
        }
        return encodedString;
    }

    public static String caesarDecoder(String stringToDecode){
        int i = 0;
        String decodedString = "";
        // decodes each character and adds character to string encodedString
        while (i < stringToDecode.length()) {
            decodedString += caesarCharacterDecoder(String.valueOf(stringToDecode.charAt(i))) ;
            i += 1;
        }
        return decodedString;
    }

    // 4 print for test
    public static void main(String[] args) {
        System.out.println(numberCypherEncoder("emil"));
        System.out.println(numberCypherDecoder("5;13;9;12"));
        System.out.println(caesarEncoder("emil"));
        System.out.println(caesarDecoder("HPLO"));
    }
}
