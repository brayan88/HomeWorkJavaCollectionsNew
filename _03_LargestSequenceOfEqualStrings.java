import java.util.Arrays;

/**
 * Created by pc on 2.4.2016 г..
 */
public class _03_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        String text="1 1 2 2 3 3 4 4 5 5";
        String [] array = text.split(" ");
        int counter = 1;
        int firstGroupCount=0;
        int secondGroupCount=0;
        String allEquals ="";
        String leftSided="";
        String firstGroup="";
        String secondGroup="";
        String biggestString="";


        for (int i = 0; i < array.length-1; i++) {
             if (array[i+1].equals(array[i])){
                 if (i!=0&&(array[i+1].contains(array[i-1]))){
                     allEquals+=array[i]+" ";
                     counter++;
                     if (firstGroup.equals("")){
                         firstGroup=allEquals;
                         allEquals="";
                         counter = firstGroupCount;
                         biggestString=firstGroup;
                     }
                     else {
                         secondGroup=allEquals;
                         allEquals="";
                         counter=secondGroupCount;
                         if (firstGroupCount>secondGroupCount){
                             biggestString = firstGroup;
                             firstGroup = "";
                             secondGroup="";
                         }
                         else if (secondGroupCount>firstGroupCount){
                             biggestString=secondGroup;
                             firstGroup = "";
                             secondGroup="";

                         }
                         else {
                             biggestString = firstGroup;
                         }
                     }
                 }

                 else {
                     allEquals+=array[i]+" "+array[i+1]+" ";
                     counter ++;
                     biggestString=allEquals;
                 }

             }
             else {
                 biggestString=allEquals;
                 allEquals="";
             }
        }
            if (biggestString.equals("")) {
            leftSided = array[0];
            System.out.println(leftSided);
        }
        System.out.println(biggestString);
    }
}
