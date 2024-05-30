import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<java.lang.Character, Character> characters = new HashMap<>();

    public Character getCharacter(char key) {
        // Uses "lazy initialization"
        Character character = characters.get(key);

        if (character == null) {
            switch (key) {
                case 'A':
                    character = new CharacterA();
                    break;
                case 'B':
                    character = new CharacterB();
                    break;
                //...
                case 'Z':
                    character = new CharacterZ();
                    break;
            }
            characters.put(key, character);
        }
        return character;
    }
}
