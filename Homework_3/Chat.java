public class Chat {
    public static void main(String[] args) {
        User a = new User("Adrian");
        User b = new User("Ari");
        User c = new User("Rebekha");
        a.addObserver(b);
        a.addObserver(c);
        b.addObserver(a);
        b.addObserver(c);
        c.addObserver(b);
        c.addObserver(a);
    }
}