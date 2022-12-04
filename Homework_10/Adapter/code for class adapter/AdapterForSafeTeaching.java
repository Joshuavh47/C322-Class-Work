public class AdapterForSafeTeaching extends TeacherForDADA {
	
    public void defenseAgainstCruciatusCurse(){
        doTeachHowDarkMagicCanHarmTheCaster();
        doTeachPowerOfLove();
        super.defenseAgainstCruciatusCurse();
    }
    public void awarenessOfHorcrux(){
        doTeachHowDarkMagicCanHarmTheCaster();
        doTeachPowerOfLove();		
        super.awarenessOfHorcrux();
    }
    public void defenseAgainstPetrification(){
        doTeachAboutProtectiveDevices();
        super.defenseAgainstPetrification();
    }
    public void defenseAgainstSectumsempra(){
        doTeachHowDarkMagicCanHarmTheCaster();
        super.defenseAgainstSectumsempra();
    }
    public void defenseAgainstAvadaKedavra() {
        doTeachHowDarkMagicCanHarmTheCaster();		
        super.defenseAgainstAvadaKedavra();
    }
    void doTeachPowerOfLove() {
        System.out.println( 
            "The magic of love can conquer the darkest magic"
        );
    }
    void doTeachHowDarkMagicCanHarmTheCaster() {
        System.out.println( 
            "Use of Dark Magic can corrupt the soul and body of " 
          + "the caseter.  An evil wizard may use such magic  to "
          + "prolong his own life and to obtain great power. A "
          + "practice of such arts can make a wizard look deformed "
          + "and inhuman. "
        );
    }
    void doTeachAboutProtectiveDevices() {
        System.out.println( 
            "Don't forget to take along the Sneakoscope detector " 
          + "as a general protection against curses and spells. "
        );
    }
}
