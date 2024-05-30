public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {

        // Private constructor to prevent external instantiation

    }

    public static LazySingleton getInstance() {

        if (instance == null) {

            instance = new LazySingleton();

        }

        return instance;

    }

}