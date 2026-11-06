public class TestingArrays{
    public static void main(String[] args){
        int[] scores = {41, 78, 52, 90, 65};

        for(int index = 0; index < scores.length; index++){
            System.out.println("Scores ["+ (index)+"] : "+ scores[index]);
        }

        int total = 0;
        for(int value : scores){
            total += value;
        }
        System.out.println("Total :"+total);
        System.out.println("The highest Score is :"+ highestScore(scores));
        System.out.println("The average score is: "+ averageScore(scores));
        System.out.println("The lowest score is: "+ lowestScore(scores));
    }

    public static int highestScore(int[] data){
        int maxScore = data[0];

        for(int i=1; i < data.length; i++){
            if(maxScore < data[i]){
                maxScore = data[i];
            }
        }
        return maxScore;
    }

    public static int lowestScore(int[] arr){
        int lowestScore = arr[0];
            for(int i=1; i < arr.length; i++){

            
        if(arr[i] < lowestScore){
        lowestScore = arr[i];
        
        }
    }
        return lowestScore;
    }


    public static double averageScore(int[] data){
        double avg;
        int total =0;
        for(int value : data){
            total += value;
        }
        avg = (double) total/data.length;
        return avg;
    }
}