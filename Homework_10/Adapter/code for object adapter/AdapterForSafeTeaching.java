public class AdapterForSafeTeaching  implements TeachingDADA {
	
    TeachingDADA oldTeacher = new TeacherForDADA();
	
    public void defenseAgainstCruciatusCurse(){
        doTeachHowDarkMagicCanHarmTheCaster();
        doTeachPowerOfLove();
        oldTeacher.defenseAgainstCruciatusCurse();
    }
    public void awarenessOfHorcrux(){
        doTeachHowDarkMagicCanHarmTheCaster();
        doTeachPowerOfLove();		
        oldTeacher.awarenessOfHorcrux();
    }
    public void defenseAgainstPetrification(){
        doTeachAboutProtectiveDevices();
        oldTeacher.defenseAgainstPetrification();
    }
    public void defenseAgainstSectumsempra(){
        doTeachHowDarkMagicCanHarmTheCaster();
        oldTeacher.defenseAgainstSectumsempra();
    }
    public void defenseAgainstAvadaKedavra() {
        doTeachHowDarkMagicCanHarmTheCaster();		
        oldTeacher.defenseAgainstAvadaKedavra();
    }
    void doTeachPowerOfLove() {
        System.out.println( 
                    "The magic of love can conquer the darkest magic");
    }
    void doTeachHowDarkMagicCanHarmTheCaster() {
        System.out.println( "Use of Dark Magic can corrupt the soul " 
                          + "and body of the caster.  An evil wizard "
                          + "may use such magic  to prolong his own "
                          + "life and to obtain great power. A "
                          + "practice of such arts can make a wizard "
                          + "look deformed and inhuman.");
    }
    void doTeachAboutProtectiveDevices() {
        System.out.println( "Don't forget to take along the " 
                          + "Sneakoscope detector as a " 
                          + "general protection against curses "
                          + "and spells. ");
    }
}
