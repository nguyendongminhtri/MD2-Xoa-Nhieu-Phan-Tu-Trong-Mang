
import java.util.Scanner;

public class Test6 {


    public static void main(String[] as) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int sizeD;
        int size;

        System.out.println("Nhập vào size: ");
        size = scanner.nextInt();
        int[] arrNumber = new int[size];

        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println("Nhập vào phần tử:  " + i);
            arrNumber[i] = scanner.nextInt();
        }
        for (int number : arrNumber) {
            System.out.print(" " + number);
        }
        System.out.println();
        System.out.println("Nhập vào phần tử cần xóa : ");
        input = scanner.nextInt();
        sizeD = sizeArrDuplicate(arrNumber, input);
        int sizeAfterDelete = size - sizeD;
        int count = 0;
        int[] newArr = new int[sizeAfterDelete];
        for (int i = 0; i < arrNumber.length; i++) {
            if(count<=sizeAfterDelete){
                if(arrNumber[i]!=input){
                    newArr[count] = arrNumber[i];
                    count++;
                } else {
                    continue;
                }
            }
        }
        System.out.println("Mảng sau khi xóa: ");
        for (int element : newArr) {
            System.out.print(" " + element);
        }
    }
    static int sizeArrDuplicate(int[] arr, int input) { //Hàm lấy ra size của mảng trùng
        int sizeD = 0;
        for (int i = 0; i < arr.length; i++) {
            if (input == arr[i]) {
                sizeD++;
            }
        }
        return sizeD;
    }

}