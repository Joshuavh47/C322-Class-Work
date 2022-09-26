public class Range {
    private char start;
    private char end;
    private int rangeAmount;
    public Range(char start, char end){
        this.start = start;
        this.end = end;
        this.rangeAmount=(int)end-(int)start;
    }
    public char getStart(){
        return start;
    }
    public char getEnd(){
        return end;
    }
    public int getRangeAmount(){
        return rangeAmount;
    }


}
