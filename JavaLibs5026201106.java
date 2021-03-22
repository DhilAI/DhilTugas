import javax.swing.JOptionPane;

public class JavaLibs5026201106{


    public static void main(String[] args) { 
  String namaUser = JOptionPane.showInputDialog(null,"Before we begin,let me know your name","Introduction", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Welcome to Life Story(Expectation),"+" "+ namaUser + ".");

            int tahunLahir = Integer.parseInt(JOptionPane.showInputDialog(null,"Tell me when you were born"+ " "+ namaUser,"Number Only!"));
            int tahunSekarang = Integer.parseInt(JOptionPane.showInputDialog(null,"Tell me what year is now"));
            int Umur = tahunSekarang - tahunLahir;
            int harapanHidup = Integer.parseInt(JOptionPane.showInputDialog(null,"Hey,tell me how long you want to live?","Number only"));
            float sisaHidup = (Umur*100.0f)/harapanHidup;


            int gaji =Integer.parseInt(JOptionPane.showInputDialog(null,"I Have ___________ Income/month","00000000"));
        double persenTabungan  = Double.parseDouble(JOptionPane.showInputDialog(null,"I save ________ of my income/month","Example 10% = 0.1"));
        String mimpi = JOptionPane.showInputDialog(null,"What is your dream?");
        String jobNow = JOptionPane.showInputDialog(null, "Right now im a  ______");
        String futureS = JOptionPane.showInputDialog(null,"I hope for the _____","Better/worse future?");
        String myBest = JOptionPane.showInputDialog(null,"And i hope my wish ______ come true","Do/dont");
        JOptionPane.showConfirmDialog(null,"Are you sure about what you write on that form?");

        // The stories

        JOptionPane.showMessageDialog(null,"Thanks for writing,and here's the result");
        JOptionPane.showMessageDialog(null, "Hi my name is"+" "+ namaUser + " "+ "Here's my life story (Expectation)" + "\n Im born on" + " " + tahunLahir + " " + "and now im" + " "+ Umur + " " + "Years old." +
        " "+ "I'm now at " + " " + sisaHidup + "%" + " of my life expectation which is" +" "+ harapanHidup + "." +" " + "I have "+ " " + gaji + " " + "Income/month" + " " + "Which i save " + " " + persenTabungan + " " + "of it."
                + "\n In the future i want to " + " " + mimpi + " "+ "but right now im a "+ " "+ jobNow + " "+"." + "\n Now,I hope for the" + " "+ futureS +" "+"future"+" " +"and i hope my wish "+ " "+ myBest + " "+ "come true.");

        JOptionPane.showMessageDialog(null,"Thank you for your time");



    }
}