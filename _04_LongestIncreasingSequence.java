import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pc on 3.4.2016 г..
 */
public class _04_LongestIncreasingSequence {
    public static void main(String[] args) {
        String text = "2 3 4 1 50 2 3 4 5";
//        Scanner sc = new Scanner(System.in);
//        String [] line = sc.nextLine().split(" ");
        String [] line =text.split(" ");
        int [] numbers= new int[line.length];
        int currentLenght =0;
        int maxLenght =0;
        int endIndex=0;
        int startIndex=0;

        List<Integer> sequence = new ArrayList<>();
        for (int i = 0; i <numbers.length-1 ; i++) {
            numbers[i]=Integer.parseInt(line[i]);
            numbers[i+1]=Integer.parseInt(line[i+1]);
            endIndex = i + 1;
            if (numbers[i]<numbers[i+1]){
                currentLenght++;
                if (i==numbers.length){
                    if (i!=0&&(numbers[i-1]>numbers[i-2]||numbers[i]>numbers[i-1])){
                        int lenght = endIndex-startIndex;
                        int begin = startIndex;

                        for (int j =0; j<lenght; j++) {
                            System.out.printf("%d ",numbers[begin++]);
                        }
                        System.out.println();
                        startIndex=endIndex;}

                    if (currentLenght > maxLenght) {
                        maxLenght = currentLenght;
                    }

                }
                else {
                    if (currentLenght > maxLenght) {
                        maxLenght = currentLenght;
                    }
                }
            }
            else {
                if (i!=0&&(numbers[i-1]>numbers[i-2]||numbers[i]>numbers[i-1])){
                    int lenght = endIndex-startIndex;
                    int begin = startIndex;

                    for (int j =0; j<lenght; j++) {
                        System.out.printf("%d ",numbers[begin++]);
                    }
                    System.out.println();
                    startIndex=endIndex;
                }
                else {

                }
                currentLenght =0;

            }


        }




    }
}
