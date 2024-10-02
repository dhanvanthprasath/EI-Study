class Singleton {
    private static Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton instance created.");
    }
}

// Use Case
public class SingletonPatternDemo {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMessage();
        
        Singleton singleton2 = Singleton.getInstance();
        singleton2.showMessage();
        
        // Both instances should be the same
        System.out.println(singleton1 == singleton2);  // Output: true
    }
}
