public class TeacherNuovoForDADA implements TeachingDADA {

    public void defenseAgainstCruciatusCurse(){
        doTeachHowDarkMagicCanHarmTheCaster();
        doTeachPowerOfLove();
        System.out.println( 
             "This curse inflicts extreme pain. The overall "
           + "effect of the curse depends on the state of the mind "
           + "of the caster and how intent the caster is on "
           + "inflicting torture. "
        );
        System.out.println( 
             "No specific counter-curse is known for this curse. "
           + "One could try the shield charm Protego Horribilis.  An "
           + "individual expecting to be hit with this curse could "
           + "also carry around a sneakoscope, which is a miniature "
           + "glass spinning top that emits shrill sounds if when "
           + "someone with evil intent is in the vicinity. "
        );
    }
    public void awarenessOfHorcrux(){
        doTeachHowDarkMagicCanHarmTheCaster();
        doTeachPowerOfLove();		
        System.out.println( 
             "A horcrux can be a living being or an object. A dark " 
           + "wizard wanting immortality stores a portion of his/her "
           + "soul in a horcrux. " 
        );
        System.out.println( "Can be destroyed with basilisk's venom. " );	
    }
    public void defenseAgainstPetrification(){
        doTeachAboutProtectiveDevices();
        System.out.println( 
             "Petrification turns a living being into a stone-like "
           + "state of unconsciousness. " 
        );
        System.out.println(
                  "Can be revived with mandrake restorative draught. ");
    }
    public void defenseAgainstSectumsempra() {
        doTeachHowDarkMagicCanHarmTheCaster();
        System.out.println( 
             "Sectumsempra curse causes a victim's skin to be slashed "
           + "according to the motions of the wand held by the caster. "
           + "However, if the caster does not move the wand but only "
           + "points it at a limb of the victim, the victim may lose "
           + "that limb. "
        );
        System.out.println( 
             "There exists a counter curse to Secturmsempra --- it is "
           + "called Vulnera Sanentur.  Snape used the counter curse "
           + "when Harry threw the Sectumsempra curse at Draco Molfoy. "
        );
    }	
    public void defenseAgainstAvadaKedavra() {
        doTeachHowDarkMagicCanHarmTheCaster();	
        System.out.println(
             "This darkest of the dark arts is the killing curse."
        );
        System.out.println( 
             "Is blocked by the power of love.  That is, if you are "
           + "'shielded' by the love given to you by people in your "
           + "past or at present, this darkest of the curses will"
           + "be deflected off you. Harry was shielded against this "
           + "curse because his mother made the ultimate sacrifice of "
           + "love for him. The only other being who is known to "
           + "possess a shield against this curse was Voldemort "
           + "because of his Horcruxes. This curse can also be blocked "
           + "if a victim hides behind a sold object.  The object will "
           + "burst into flames when hit by the curse.  The curse hits "
           + "a victim in the form of a green bolt of lightening. " 
        );
    }
    void doTeachPowerOfLove() {
        System.out.println( 
                    "The magic of love can conquer the darkest magic. ");
    }
    void doTeachHowDarkMagicCanHarmTheCaster() {
        System.out.println( 
             "Use of Dark Magic can corrupt the soul and body of the "
           + "caster. An evil wizard may use such magic to prolong his "
           + "own life and to obtain great power. A practice of such "
           + "arts can make a wizard look deformed and inhuman. "
        );
    }
    void doTeachAboutProtectiveDevices() {
        System.out.println( 
             "Don't forget to take along the Sneakoscope detector as a " 
           + "general protection against curses and spells. "
        );
    }
}
