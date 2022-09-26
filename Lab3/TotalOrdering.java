import java.util.Arrays;

public class TotalOrdering {
    public static void main(String[] args){
        totalOne();
        System.out.println("\n");
        totalTwo();
        System.out.println("\n");
        patrialOrdering();

    }
    public static void totalOne(){
        String[] unordered={"hi", "hello", "sort", "java"};
        int[] scores=new int[unordered.length];
        int score=0;
        int scoreAvg=0;
        String[] ordered = new String[unordered.length];
        //calculate the scores for each by comparing each word to the others, take the average
        for(int i=0;i<unordered.length;i++){
            for(int j=0;j<unordered.length;j++){
                if(i!=j){
                    score+=unordered[i].compareTo(unordered[j]);
                }
            }
            scoreAvg=score/unordered.length;
            score=0;
            scores[i]=scoreAvg;
        }


        int highestVal=scores[0];
        int highestInd=0;
        //find the biggest scores and match them with the corresponding words
        for(int i=0;i<unordered.length;i++){
            for(int j=0;j<unordered.length;j++){
                if(highestVal<=scores[j]){
                    highestVal=scores[j];
                    highestInd=j;
                }
            }
            ordered[i]=unordered[highestInd];
            scores[highestInd]=-100000000;
            highestVal=scores[0];
        }

        for(String s:ordered){
            System.out.println(s);
        }
        System.out.println("\n");

        //here is another way in reverse order;

        Arrays.sort(unordered);
        for (String s:unordered){
            System.out.println(s);
        }


    }

    public static void totalTwo(){
        //sorts based on summation of decimal character values
        String[] unordered={"hi", "hello", "sort", "java"};
        String[] ordered=new String[unordered.length];
        int[] scores=new int[unordered.length];
        int temp=0;
        //calculate the sum of each character in decimal
        for(int i=0;i<unordered.length;i++){
            char[] tempArr=unordered[i].toCharArray();
            for(int j=0;j<tempArr.length;j++){
                temp+=(int)tempArr[j];
            }
            scores[i]=temp;
            temp=0;
        }

        int highestVal=scores[0];
        int highestInd=0;
        //find the highest scores
        for(int i=0;i<unordered.length;i++){
            for(int j=0;j<unordered.length;j++){
                if(highestVal<=scores[j]){
                    highestVal=scores[j];
                    highestInd=j;

                }
            }
            //sort
            ordered[i]=unordered[highestInd];
            scores[highestInd]=-10000000;
            highestVal=scores[0];
            highestInd=0;
        }
        for(String s:ordered){
            System.out.println(s);
        }
    }

    public static void patrialOrdering(){
        String[] unordered={"hi", "hello", "sort", "java"};
        String[] ordered=new String[unordered.length];
        int[] scores=new int[unordered.length];
        //make an array of lengths
        for(int i=0;i<unordered.length;i++){
            scores[i]=unordered[i].length();
        }
        int highestVal=scores[0];
        int highestInd=0;
        //find largest lengths
        for(int i=0;i<unordered.length;i++){
            for(int j=0;j<unordered.length;j++){
                if(highestVal<=scores[j]){
                    highestVal=scores[j];
                    highestInd=j;
                }
            }
            //put longest lengths in order
            ordered[i]=unordered[highestInd];
            scores[highestInd]=-10000000;
            highestVal=scores[0];
            highestInd=0;
        }
        for(String s:ordered){
            System.out.println(s);
        }
    }
}