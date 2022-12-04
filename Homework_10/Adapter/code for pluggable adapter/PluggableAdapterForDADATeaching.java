public class PluggableAdapterForDADATeaching implements TeachingDADA {

    private TeachingDADA teacher;

    public PluggableAdapterForDADATeaching( TeachingDADA adaptee ) {
        teacher = adaptee;
    }
    public void defenseAgainstCruciatusCurse() {
        teacher.defenseAgainstCruciatusCurse();
    }
    public void defenseAgainstPetrification() {
        teacher.defenseAgainstPetrification();
    }
    public void awarenessOfHorcrux() {
        teacher.awarenessOfHorcrux();
    }
    public void defenseAgainstSectumsempra() {
        teacher.defenseAgainstSectumsempra();
    }
    public void defenseAgainstAvadaKedavra() {
        teacher.defenseAgainstAvadaKedavra();
    }
}
