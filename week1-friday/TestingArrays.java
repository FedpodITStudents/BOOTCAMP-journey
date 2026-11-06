public class TestingArrays{
    public static void main(String[] args){
        int[] scores = {65, 78, 52, 90, 41};

        for(int index = 0; index < scores.length; index++){
            System.out.println("Scores ["+ (index)+"] : "+ scores[index]);
        }

        int total = 0;
        for(int value : scores){
            total += value;
        }
        System.out.println("Total :"+total);
    }
}