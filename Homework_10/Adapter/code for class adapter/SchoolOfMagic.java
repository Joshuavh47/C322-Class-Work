public class SchoolOfMagic {
	
    TeachingDADA teacher;
	
    public SchoolOfMagic() {
        teacher = new AdapterForSafeTeaching();
    }
    public void teachDefenseAgainstDarkArts() {
        teacher.defenseAgainstPetrification();
        System.out.println( "\n\n");
        teacher.defenseAgainstCruciatusCurse();
        System.out.println( "\n\n");	
        teacher.awarenessOfHorcrux();		
        System.out.println( "\n\n");
        teacher.defenseAgainstPetrification();
        System.out.println( "\n\n");
        teacher.defenseAgainstSectumsempra();	
        System.out.println( "\n\n");
        teacher.defenseAgainstAvadaKedavra();
    }
    public static void main(String[] args) {
        SchoolOfMagic hogwarts = new SchoolOfMagic();
        hogwarts.teachDefenseAgainstDarkArts();	 
    }
}
