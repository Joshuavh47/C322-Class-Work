public class MinisterForMagic {
    private String name;
    private int yearAppointed;
    private static MinisterForMagic unique;

    private MinisterForMagic(String name, int yearAppointed){
        this.name = name;
        this.yearAppointed = yearAppointed;
    }
    public static MinisterForMagic makeInstanceOfMinisterForMagic(String name, int year) {
        if ( unique == null )
            unique = new MinisterForMagic( name, year );
        return unique;
    }
    public static void retireInstanceOfMinisterForMagic() {
        unique = null;
    }
    public String whoIsMinisterForMagic(){
        return name;
    }
}
//This class has a private constructor to ensure that it can not be called by any outside classes.
//It also has a method that checks whether there is an instance already created.
//If there is, it keeps it; and if not, it makes a new one.
//There is also that retires the current instance of this class in the case that that is necessary.
