public class DoubleCheckLockingSingleton {

    private static DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton() {

        // Private constructor to prevent external instantiation

    }

    public static DoubleCheckLockingSingleton getInstance() {

        if (instance == null) {

            synchronized (DoubleCheckLockingSingleton.class) 
            {  
                // Double checked 
                if (instance == null) {  
                    instance = new DoubleCheckLockingSingleton(); 
                } 
            } 
        }

        return instance;

    }


    // this is thread-safe and only 
    // creates one instance of Singleton on concurrent 
    // environment but it is unnecessarily expensive due to 
    // cost of synchronization at every call. 
    // public static synchronized Singleton getInstance2() 
    // { 
    //     if (instance == null) { 
    //         instance = new Singleton(); 
    //     } 
    //     return instance; 
    // } 

}