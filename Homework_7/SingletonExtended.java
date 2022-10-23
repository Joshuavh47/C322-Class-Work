//This class is a basic Singleton paattern that can be extended by other classes.
//It contains a protected constructor to ensure that it can't be accessed from outside of the class tree.
//It also has a method to create a new instance, which tests if an instance has been created.
//If an instance has been created, it dies nothing and returns that instance.
//Otherwise, it creates a new instance.

class Singleton {
    protected static Singleton unique;
    protected Singleton(){}
    public static Singleton makeInstanceOfSingleton() {
        if ( unique != null )
            return unique;
        else {
            unique = new Singleton();
            return unique;
        }
    }
}

//This is a subclass of the Singleton class, and it contains the same methods as the previous Singleton class with the same implementations.
//It can be useful to extend the Singleton class if you are trying to make sure that an object only has one active instance at all times.

class SingletonExtended extends Singleton {
    private static SingletonExtended unique;
    public static SingletonExtended makeInstanceOfSingletonExtended() {
        if ( unique != null )
            return unique;
        else {
            unique = new SingletonExtended();
            return unique;
        }
    }

}

//Here, two Singleton and SingletonExtended objects are made and compared to prove that the resulting objects arte the same.

class TestSingletonExtended {
    public static void main(String[] args){
        Singleton obj_1 = Singleton.makeInstanceOfSingleton();
        Singleton obj_2 = Singleton.makeInstanceOfSingleton();
        if ( obj_1 == obj_2 )
            System.out.println("The two Singleton objects are the same");
        SingletonExtended obj_3 = SingletonExtended.makeInstanceOfSingletonExtended();
        SingletonExtended obj_4 = SingletonExtended.makeInstanceOfSingletonExtended();
        if ( obj_3 == obj_4 )
            System.out.println("The two SingletonExtended objects are the same" );
    }
}
