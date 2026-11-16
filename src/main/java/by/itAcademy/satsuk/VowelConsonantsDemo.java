package by.itAcademy.satsuk;

public class VowelConsonantsDemo {
    public static void main(String[] args) {
        VowelConsonants vowelConsonants = new VowelConsonants("Lorem ipsum dolor sit amet, consectetuer adipiscing elit.");

        int vowel = vowelConsonants.countVowels();
        int consonant = vowelConsonants.countConsonants();

        System.out.println("Кол-во гласных: " + vowel);
        System.out.println("Кол-во согласных: " + consonant);

    }
}
