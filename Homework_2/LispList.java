import java.util.*;

public interface LispList{
    public static LispList NIL = new EmptyList();
    boolean isEmpty();
    Object head() throws UnsupportedOperationException;
    LispList tail() throws java.lang.UnsupportedOperationException;
    String toString();
    int length();
    boolean contains(Object obj);
    LispList cons(Object a);
    LispList merge(LispList other) throws UnsupportedOperationException;
}
