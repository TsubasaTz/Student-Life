// Let user select an emoji or mood to a date. 
// Saves the emoji to the date. 

import java.util.Scanner;

public class emoji {
    Map<Integer, String> EMOJIS = new LinkedHashMap<>();

    // Activity Emojis
    EMOJIS.put(1, new String(Character.toChars(0x1F4DA))); // ??
    EMOJIS.put(2, new String(Character.toChars(0x26BD)));  // ?
    EMOJIS.put(3, new String(Character.toChars(0x1F389))); // ??
    EMOJIS.put(4, new String(Character.toChars(0x1F3AE))); // ??
    EMOJIS.put(5, new String(Character.toChars(0x1F373))); // ??
    EMOJIS.put(6, new String(Character.toChars(0x1F3A8))); // ??
    EMOJIS.put(7, new String(Character.toChars(0x1F6D2))); // ??
    EMOJIS.put(8, new String(Character.toChars(0x1F4AA))); // ??
    EMOJIS.put(9, new String(Character.toChars(0x1F483))); // ??
    EMOJIS.put(10, new String(Character.toChars(0x1F4BB)));// ??

    // Face Emojis
    EMOJIS.put(11, new String(Character.toChars(0x1F911))); // ??
    EMOJIS.put(12, new String(Character.toChars(0x1F62D))); // ??
    EMOJIS.put(13, new String(Character.toChars(0x1F913))); // ??
    EMOJIS.put(14, new String(Character.toChars(0x1F923))); // ??
    EMOJIS.put(15, new String(Character.toChars(0x1F60D))); // ??
    EMOJIS.put(16, new String(Character.toChars(0x1F600))); // ??
    EMOJIS.put(17, new String(Character.toChars(0x1F63C))); // ??
    EMOJIS.put(18, new String(Character.toChars(0x1F973))); // ??
    EMOJIS.put(19, new String(Character.toChars(0x1F631))); // ??
    EMOJIS.put(20, new String(Character.toChars(0x1F621))); // ??
    
    // Extra emojis
    EMOJIS.put(21, new String(Character.toChars(0x2757))); // ?
    EMOJIS.put(22, new String(Character.toChars(0x2705))); // ?
    EMOJIS.put(23, new String(Character.toChars(0x267F))); // ?
    EMOJIS.put(24, new String(Character.toChars(0x1F30D))); // ??
    EMOJIS.put(25, new String(Character.toChars(0x1F3B6))); // ??

    // Loop for showing emojis to choose from ---------------------------------------------
    public void showEmojis() {
    System.out.println("\n--- Pick an Emoji ---");
    for (Map.Entry<Integer, String> entry : EMOJIS.entrySet()) {
        System.out.println(entry.getKey() + ". " + entry.getValue());
    }
    System.out.println("0. No emoji");


    // User input for picking an emoji ---------------------------------------------------
    public String pickEmoji(Scanner scanner) {
    showEmojis();

    while (true) {
        System.out.print("Choose an emoji number: ");
        String input = scanner.nextLine().trim();

        try {
            int choice = Integer.parseInt(input);

            if (choice == 0) {
                return "";
            }
            if (EMOJIS.containsKey(choice)) {
                return EMOJIS.get(choice);
            }
        } catch (NumberFormatException e) {
            // Not a valid whole number
        }

        System.out.println("Invalid selection. Pick a number from the list or 0.");
    }
   }
  }