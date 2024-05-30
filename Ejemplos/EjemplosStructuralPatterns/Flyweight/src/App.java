public class App {
    public static void main(String[] args) throws Exception {
        // Build a document with text
        String document = "AAZZBBZB";
        char[] chars = document.toCharArray();
        CharacterFactory factory = new CharacterFactory();
        
        // Extrinsic state
        int pointSize = 10;
        
        // For each character use a flyweight object
        for (char c : chars) {
            pointSize++;
            Character character = factory.getCharacter(c);
            character.display(pointSize);
        }
        
        // Wait for user
        System.out.println("Press any key to exit.");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
