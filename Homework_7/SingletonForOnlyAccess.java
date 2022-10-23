//This is an exception thrown when there is already an existing instance of an object that uses the Singleton pattern.

class UnauthorizedInstanceException extends Exception {
    public UnauthorizedInstanceException() {
        super();
    }
    public UnauthorizedInstanceException(String message) {
        super( message );
    }
}

//This class has a static boolean that is used to signify whether there has been an instance of the Singleton class made.
//This boolean is static so that it is not attatched to each object created by the Singleton class.
//The constructor checks if there is an instance already made via the static boolean,
//and if there is, it throws an exception. If there is no instance already made, if creates one and sets the boolean to true.

class Singleton {
    static boolean instanceExists = false;

    public Singleton() throws UnauthorizedInstanceException {
        if ( instanceExists ) {
            throw new UnauthorizedInstanceException("Unique instance constructed previously." + " New instance creation request denied.");
        } else {
            instanceExists = true;
            System.out.println("Unique instance of Singleton created");
        }
    }
}

//A proof of concept that shows how an exception will be thrown when multiple instances of the Singleton class are made. 

class TestSingleton {
    public static void main( String[] args )
    {
        // First attempt works fine:
        try {
            Singleton obj_1 = new Singleton();
        } catch( UnauthorizedInstanceException u ) {
            System.out.println(u.getMessage());
        }

        // Second attempt causes an exception to be thrown:
        try {
            Singleton obj_2 = new Singleton();
        } catch( UnauthorizedInstanceException u ) {
            System.out.println(u.getMessage());
        }
    }
}
