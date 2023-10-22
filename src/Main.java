import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Translate from Morse code to English");
        System.out.println("2. Translate from English to Morse code");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        if (option == 1) {
            System.out.println("Enter Morse code to translate to English:");
            String morseCode = scanner.nextLine();
            String translatedText = MorseCodeTranslator.morseToEnglishTranslation(morseCode);
            System.out.println("Morse to English: " + translatedText);
        } else if (option == 2) {
            System.out.println("Enter English text to translate to Morse code:");
            String englishText = scanner.nextLine();
            String translatedMorse = EnglishTextTranslator.englishToMorseTranslation(englishText);
            System.out.println("English to Morse: " + translatedMorse);
        } else {
            System.out.println("Invalid option.");
        }

        scanner.close();
    }
}
