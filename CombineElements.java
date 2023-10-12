import java.util.Scanner;
import java.util.Arrays;

public class CombineElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Gop mang---");
        int sizeArray1;
        int[] array1;
        int sizeArray2;
        int[] array2;

        do {
            System.out.println("Nhap do dai mang 1 :");
            sizeArray1 = scanner.nextInt();

            if (sizeArray1 > 10) {
                System.out.println("Kich thuoc phai nho hon 10");
            }
        }while (sizeArray1 > 10);

        array1 = new int[sizeArray1];
        int i = 0;
        while (i < sizeArray1) {
            System.out.println("Nhap phan tu tai vi tri " + i + " : ");
            array1[i] = scanner.nextInt();
            i++;
        }

        do {
            System.out.println("Nhap do dai mang 2 :");
            sizeArray2 = scanner.nextInt();

            if (sizeArray2 > 10) {
                System.out.println("Kich thuoc phai nho hon 10");
            }
        }while (sizeArray2 > 10);

        array2 = new int[sizeArray2];
        int j = 0;
        while (j < sizeArray2) {
            System.out.println("Nhap phan tu tai vi tri " + j + " : ");
            array2[j] = scanner.nextInt();
            j++;
        }

        System.out.println("---Hien thi mang---");
        System.out.println("Mang 1 :");
        for (int k = 0; k < sizeArray1; k++) {
            System.out.print(array1[k] + "\t");
        }
        System.out.println("\n"+"Mang 2 :");
        for (int a = 0; a < sizeArray2; a++) {
            System.out.print(array2[a] + "\t");
        }

        System.out.print("\n"+"---Gop 2 mang---");
        System.out.println(Arrays.toString(combine(array1, array2)));
    }

    public static int[] combine(int[] array1, int[] array2){
        int[] result = new int[array1.length + array2.length];
        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            result[k] = array1[i];
            k++;
        }
        for (int j = 0; j < array2.length; j++) {
            result[k] = array2[j];
            k++;
        }
        return result;
    }
}
