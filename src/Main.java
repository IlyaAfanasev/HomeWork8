public class Main {
    public static void main(String[] args) {
        System.out.println("    Задача 1 и 2");
        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (i == numbers1.length - 1) {
                System.out.print(numbers1[numbers1.length - 1] + ".");
            } else {
                System.out.print(numbers1[i] + ", ");
            }
        }
        System.out.println();
        double[] numbers2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            if (i == numbers2.length - 1) {
                System.out.print(numbers2[numbers2.length - 1] + ".");
            } else {
                System.out.print(numbers2[i] + ", ");
            }
        }
        System.out.println();
        int[] numbers3 = new int[10];
        int j = 1;
        int i = 0;
        while (i < numbers3.length) {
            numbers3[i] = 0;
            numbers3[j] = 1;
            System.out.print(numbers3[i] + ", ");
            if (j == numbers3.length - 1) {
                System.out.print(numbers3[numbers3.length - 1] + ".");
            } else {
                System.out.print(numbers3[j] + ", ");
            }
            j += 2;
            i += 2;
        }
        System.out.println();
        System.out.println("    Задача 3");
        for (int n = numbers1.length - 1; n >= 0; n--) {
            if (n == 0) {
                System.out.print(numbers1[0] + ".");
            } else {
                System.out.print(numbers1[n] + ", ");
            }
        }
        System.out.println();
        for (int m = numbers2.length - 1; m >= 0; m--) {
            if (m == 0) {
                System.out.print(numbers2[0] + ".");
            } else {
                System.out.print(numbers2[m] + ", ");
            }
        }
        System.out.println();
        j=9;
        i=8;
        while ( i >= 0 ) {
            System.out.print(numbers3[j] + ", ");
            if (i == 0) {
                System.out.print(numbers3[0] + ".");
            } else {
                System.out.print(numbers3[i] + ", ");
            }
            j -= 2;
            i -= 2;
        }
    }

}