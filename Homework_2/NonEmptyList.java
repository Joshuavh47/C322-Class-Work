import java.util.*;

public class NonEmptyList implements LispList{
    Object head;
    LispList tail;

    public NonEmptyList(Object first, LispList rest){
        this.head = first;
        this.tail = rest;
    }

    public boolean isEmpty(){
        return false;
    }

    public Object head(){
        return this.head;
    }

    public LispList tail(){
        return this.tail;
    }

    public NonEmptyList cons(Object a){
        return new NonEmptyList(a, this);
    }

    public int length(){
        int count = 1;

        LispList a = tail();
        while (!a.isEmpty()){
            count+=1;
            a = a.tail();
        }
        return count;
    }

    public boolean contains(Object obj){
        if (this.head.equals(obj))
            return true;
        else
        if (this.tail==null) {
            return false;
        }
        else {
            return this.tail.contains(obj);
        }
    }

    public String toString(){
        return head() + " " + tail().toString();
    }
    public NonEmptyList(Object first){
        this.head = first;
        this.tail = new EmptyList();
    }
    public void setTail(LispList a){
        this.tail=a;
    }
    public LispList merge(LispList other) throws UnsupportedOperationException {
        NonEmptyList a = (NonEmptyList) tail();
        ArrayList<NonEmptyList> obj1 = new ArrayList<NonEmptyList>();
        ArrayList<NonEmptyList> obj2 = new ArrayList<NonEmptyList>();
        for (int i = 0;i<this.length()-2;i++){
            obj1.add(a);
            a= (NonEmptyList) obj1.get(i).tail();
        }
        obj1.add(a);
        a= (NonEmptyList) other.tail();
        for (int i = 0;i<other.length()-2;i++){
            obj2.add(a);
            a = (NonEmptyList) obj2.get(i).tail();
        }
        obj2.add(a);
        NonEmptyList out = new NonEmptyList(this.head());
        NonEmptyList temp = new NonEmptyList(other.head());
        out.cons(temp);

        int count = 0;
        int longestLen;
        if(this.length()>other.length()){
            longestLen=this.length();
        }
        else{
            longestLen=other.length();
        }
        for(int i = 0;i<longestLen-2;i++){
            if(i%2==0&&!obj1.isEmpty()){
                temp.cons(obj1.get(count));
                temp=obj1.get(count);
            }
            else if(i%2==1&&!obj2.isEmpty()){
                temp.cons(obj2.get(count));
                temp=obj2.get(count);
            }
            count++;
        }
        return out;
    }
}
