public class Test
{
    public static void main(String[] args) throws UnsupportedOperationException {
        LispList test = new EmptyList();
        System.out.print("[" + test + "] ");
        System.out.println(" ... expected: []");
        System.out.print(test.length() + " ");
        System.out.println(" ... expected: 0");
        System.out.print(test.contains("E") + " ");
        System.out.println(" ... expected: false");

        LispList test2 = new NonEmptyList("A", new EmptyList());
        System.out.print(test2);
        System.out.println(" ... expected: A");
        System.out.print(test2.length());
        System.out.println(" ... expected: 1");
        System.out.print(test2.contains("B"));
        System.out.println(" ... expected: false");
        System.out.print(test2.contains("A"));
        System.out.println(" ... expected: true");

        LispList test3 = new NonEmptyList("A", new NonEmptyList("B", new NonEmptyList("C", new EmptyList())));
        System.out.print(test3);
        System.out.println(" ... expected: A B C");
        System.out.print(test3.length());
        System.out.println(" ... expected: 3");
        System.out.print(test3.contains("E"));
        System.out.println(" ... expected: false");
        System.out.print(test3.contains("C"));
        System.out.println(" ... expected: true");
        System.out.print(test3.contains("B"));
        System.out.println(" ... expected: true");
        System.out.print(test3.contains("U"));
        System.out.println(" ... expected: false");

        LispList test4 = LispList.NIL.cons("Q").cons("J").cons("M").cons("B").cons("J");
        System.out.print(test4);
        System.out.println(" ... expected: J B M J Q");
        System.out.print(test4.length());
        System.out.println(" ... expected: 5");
        System.out.print(test4.contains("J"));
        System.out.println(" ... expected: true");
        System.out.print(test4.contains("H"));
        System.out.println(" ... expected: false");

        try {
            System.out.println( LispList.NIL.head() );
        } catch (Exception e) {
            System.out.println( "We should never ask for that... " + e );
        }
        System.out.println(test4.merge(test4).toString());
    }
}
