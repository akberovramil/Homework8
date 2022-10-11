import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int[] massive = new int[3];
        massive[0] = 1;
        massive[1] = 2;
        massive[2] = 3;

        double[] drob = {1.57, 7.654, 9.986};

        int[] num = new int[4];
        num [0] = 3;
        num [1] = 7;
        num [2] = 17;
        num [3] = 28;
        //Задание 2
        System.out.println(Arrays.toString(massive));
        System.out.println(Arrays.toString(drob));
        System.out.println(Arrays.toString(num));
        //Задание 3
        int p = 0;
        for (int i = massive.length - 1; i >= 0; i--) {
            System.out.print(massive[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = drob.length - 1; i >= 0; i --) {
            System.out.print(drob[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = num.length - 1; i >= 0; i --){
            System.out.print(num[i]);
            if (i != 0) {
                System.out.print(", ");
            }

        }
        System.out.println();
        //Задание 4
        for (int i = 0; i <= massive.length - 1; i++)
            if (massive[i] % 2 != 0) {
                massive[i] += 1;
            }
        System.out.println(Arrays.toString(massive));



        

    }
}
