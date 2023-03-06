public class Main {
    public static void main(String[] args) {
        System.out.println("    Задача 1");
        int []numbers1 = new int [3];
        numbers1[0]=1;
        numbers1[1]=2;
        numbers1[2]=3;
        for (int i = 0; i < 3; i++) {
            System.out.print(numbers1[i] + " ");
        }
        System.out.println();
            double []numbers2 = {1.57,7.654,9.986};
        for (int i = 0; i < 3; i++) {
            System.out.print(numbers2[i] + " ");
        }
        System.out.println();
        int[] numbers3 = new int[10];
        int j=1;
        int i = 0;
        while (i < numbers3.length ) {
            numbers3[i]=0;
            numbers3[j]=1;
            System.out.print(numbers3[i]+" ");
            System.out.print(numbers3[j]+" ");
            j+=2;
            i+=2;
        }
        System.out.println();
    }
}