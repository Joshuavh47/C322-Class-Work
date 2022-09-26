import java.util.ArrayList;
import java.lang.Math;


public class RandomStringGenerator {
    private ArrayList<Range> allRanges;
    public RandomStringGenerator(){
        allRanges = new ArrayList<Range>();
    }



    public static void main(String[] args){

        RandomStringGenerator generator = new RandomStringGenerator();
        generator.addRange('a','f');
        generator.addRange('A','F');
        System.out.println(generator.nextString(10));
    }
    public void addRange(char start, char end){
        allRanges.add(new Range(start, end));
    }
    public String nextString(int length){
        String finalString = "";
        for(int i = 0;i<length;i++){
            int randRange = (int) (Math.random()*allRanges.size());
            int randChar = (int) (Math.random()*(allRanges.get(randRange).getRangeAmount()+1))+(int)allRanges.get(randRange).getStart();
            finalString+=(char)randChar;
        }
        return finalString;
    }
}
