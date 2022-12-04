import java.util.*;

public class SchoolOfMagic {

    TeachingDADA teacher;
	
    public SchoolOfMagic() {
        System.out.println(  
             "\n Pretend you are the Headmaster of the Hogwarts School"
           + "\n of Magic. You are drawn to both the old-style DADA"
           + "\n teaching, with its focus exclusively on how a wizard"
           + "\n can defend himself or herself against the dark arts,"
           + "\n and the new-style teaching of the same subject that" 
           + "\n also addresses the morality dimensions of engaging in"
           + "\n the dark arts.  You have a habit of waiting until the"
           + "\n last minute before deciding whether the new teacher"
           + "\n you are hiring should conform to the old style or the"
           + "\n new style.  Well, that moment is here. If you would"
           + "\n like for the new teacher to conform to the old style,"
           + "\n enter number 1.  Otherwise enter number 2:" );
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        if ( in == 1 ) {
            teacher = new PluggableAdapterForDADATeaching( 
                                        new TeacherNuovoForDADA() );
        } else if (in == 2) {
            teacher = new PluggableAdapterForDADATeaching( 
                                      new TeacherVecchioForDADA() );
        } else {
            System.out.println("Wrong answer. Exiting");
            System.exit(0);
        }
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
