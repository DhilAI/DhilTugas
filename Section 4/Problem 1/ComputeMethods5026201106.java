import java.lang.Math;

public class ComputeMethods5026201106{

    // Soal 1
    double celcius;

    public double fToC (double degreesF){

     celcius = (5.0/9) * (degreesF- 32);
    System.out.println("Celcius = "+ celcius);


    return celcius;
    }

    public double hypotenuse(int a,int b){

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("Hypotenuse = " + c);
        return c;
    }

    public int roll(int daduSatu,int daduDua){
        int hasil = daduSatu + daduDua;
        System.out.println("Sum = " + hasil);

    return  hasil;

    }
}
