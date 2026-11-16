package by.itAcademy.satsuk;

public class VowelConsonants {
    private String text;

    public String getText() {
        return text;
    }

    public VowelConsonants(String text) {
        this.text = text;
    }

    public int countVowels(){
        int countVowel = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = Character.toLowerCase(text.charAt(i));
            if (letter == 'a' || letter == 'e' ||
                    letter == 'i' || letter == 'o' || letter == 'u') {
                countVowel++;
            }

        }
        return countVowel;
    }

    public int countConsonants(){
        int countConsonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = Character.toLowerCase(text.charAt(i));
            if(letter >= 'a' && letter <= 'z' &&
                    letter != 'a' && letter != 'e' &&
                    letter != 'i' && letter != 'o' && letter != 'u') {
                countConsonants++;
            }
        }
        return countConsonants;
    }

}
