public class VolatileDoubleCheckLockingSingleton {

    private volatile  static VolatileDoubleCheckLockingSingleton instance;

    private VolatileDoubleCheckLockingSingleton() {

        // Private constructor to prevent external instantiation

    }

    public static VolatileDoubleCheckLockingSingleton getInstance() {

        if (instance == null) {

            synchronized (VolatileDoubleCheckLockingSingleton.class) 
            {  
                // Double checked 
                if (instance == null) {  
                    instance = new VolatileDoubleCheckLockingSingleton(); 
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