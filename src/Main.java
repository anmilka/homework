public class Main {
    public static void main(String[] args) {

        // Вывести число в обратном порядке
        int number;
        number = 675;
        int reverse=0;
        while(number !=0) {
            int a = number % 10;
            reverse = reverse * 10 + a;
            number /= 10;
        }
        System.out.println(reverse);

        //Вывести макс и мин цифры
        int number2=8476;
        int min=99;
        int max=0;
        while(number2!=0){
            int b = number2%10;
            if(b>max){
                max=b;
            }
            if(b<min){
                min=b;
            }

            number2= (number2-b)/10;
        }
        System.out.println(min);
        System.out.println(max);

        //Вывести true если в числе нет цифр дубликатов
        int number3 = 653;
        boolean bool = true;

        while(number3 >0 && bool){
            int c = number3%10;
            number3=(number3-c)/10;

            int temp = number3;
            while(temp>0){
                int d = temp%10;
                temp= (temp-d)/10;

                if(c==d){
                    bool=false;
                    break;
                }
            }
        }
        System.out.println(bool);

    }
}