import java.util.*;

public class EmptyList implements LispList{

    public EmptyList(){

    }

    public boolean isEmpty(){
        return true;
    }

    public LispList head() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public LispList tail() throws java.lang.UnsupportedOperationException {
        throw new java.lang.UnsupportedOperationException();
    }

    public int length(){
        return 0;
    }


    public boolean contains(Object obj){
        return false;
    }

    public LispList cons(Object a){
        return new NonEmptyList(a, this);
    }

    public String toString(){
        return "";
    }

    @Override
    public LispList merge(LispList other) throws java.lang.UnsupportedOperationException {
        throw new java.lang.UnsupportedOperationException();
    }
}