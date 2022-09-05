import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int dugumyili = 0;
        System.out.println("dogum yilinizi girinbiz ");
        dugumyili=inp.nextInt();

        if(dugumyili % 12 ==0)

            System.out.println("Cin zoydagi burcunuz Maymun");

        if(dugumyili % 12 ==1)

            System.out.println("Cin zoydagi burcunuz kaplan ");

        if(dugumyili % 12 ==2)

            System.out.println("Cin zoydagi burcunuz horoz");

        if(dugumyili % 12 ==3)

            System.out.println("Cin zoydagi burcunuz kopek");

        if(dugumyili % 12 ==4)

            System.out.println("Cin zoydagi burcunuz domuz ");

        if(dugumyili % 12 ==5)

            System.out.println("Cin zoydagi burcunuz fare");


        if(dugumyili % 12 ==6)

            System.out.println("Cin zoydagi burcunuz okuz ");

        if(dugumyili % 12 ==7)

            System.out.println("Cin zoydagi burcunuz tavsan ");

        if(dugumyili % 12 ==8)

            System.out.println("Cin zoydagi burcunuz ejderha");

        if(dugumyili % 12 ==9)

            System.out.println("Cin zoydagi burcunuz yılan ");

        if(dugumyili % 12 ==10)

            System.out.println("Cin zoydagi burcunuz at ");

        if(dugumyili % 12 ==11)

            System.out.println("Cin zoydagi burcunuz koyun");

    }
}