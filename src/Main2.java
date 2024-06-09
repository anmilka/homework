public class Main2 {
    public static void main(String[] args){
        // Используя while вывести все числа от 0 до 25 в одну строку через пробел.
        int i = 0;
        while(i<=25){
            System.out.print(i +" ");
            i++;
        }
        System.out.println();
        //Используя for вывести каждое четное число от 2 до 20 включительно и больше 10

        for (int j = 2; j <=20; j+=2) {
            if(j>10) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        //Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
        for (int j = 10; j <=20 ; j++) {
            System.out.print(j*j +" ");

        }
        System.out.println();

        //Необходимо, чтоб программа выводила на экран вот такую последовательность:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
        int b=7;
        while(b<100){
            System.out.print(b +" ");
            b+=7;
        }
    }
}
