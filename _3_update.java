/**
 * Created by pc on 3.4.2016 г..
 */
public class _3_update {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String[] arr = scan.nextLine().split(" ");
//        scan.close();
        String text="hi yes yes yes bye";
        String [] arr = text.split(" ");
        String prev = "";
        String curr = "";
        int maxLength = 0;
        int currLength = 0;
        int endIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                currLength++;
                continue;
            }
            prev = arr[i - 1];
            curr = arr[i];
            if (curr.contains(prev)) {
                currLength++;
                if (currLength > maxLength) {
                    maxLength = currLength;
                    endIndex = i;
                }
            } else {
                if (currLength > maxLength) {
                    maxLength = currLength;
                    currLength = 1;
                    endIndex = i;
                } else {
                    currLength = 1;
                }
            }
        }
        if (maxLength == 1 || maxLength == 0) {
            System.out.print(arr[0] + " ");
        } else {
            //endIndex -= maxLength + 1;
            for (int i = 0; i < maxLength; i++) {
                System.out.print(arr[endIndex--] + " ");
            }
        }

    }
}
