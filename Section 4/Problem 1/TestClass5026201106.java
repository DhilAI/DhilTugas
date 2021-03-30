import java.util.Scanner;

public class TestClass5026201106{

    public static void main(String[] args){

        ComputeMethods5026201106 methodBase = new ComputeMethods5026201106();

        Scanner myObj = new Scanner(System.in);

        // Soal 1A fToC
        System.out.println("Fahrenheit to Celcius");
        System.out.print("Fahrenheit = ");
        double angkaInput =  myObj.nextDouble();
        methodBase.fToC(angkaInput);


        // 1B Hypotenuse
        System.out.println("\nSearching for Hypotenuse");
        System.out.print("Height of triangle = ");
        int inputA = myObj.nextInt();
        System.out.print("Base of triangle= ");
        int  inputB = myObj.nextInt();
        methodBase.hypotenuse(inputA,inputB);



        // 1C Dice,no input because its random
        System.out.println("\nSum of 2 dice");
        int daduAwal = (int)(Math.random()*6 + 1);
        int daduAkhir = (int)(Math.random()*6 + 1);
        System.out.println("Dadu Satu = " + daduAwal);
        System.out.println("Dadu Dua = " + daduAkhir);
        methodBase.roll(daduAwal,daduAkhir);


    }

}
