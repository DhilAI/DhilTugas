import javax.swing.JOptionPane;


public class JavaLibs5026201106{

    public static void main(String[] args) {
        String namaUser = JOptionPane.showInputDialog(null,"Before we begin,let me know your name","Introduction", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Welcome to Life Story(Expectation),"+" "+ namaUser + ".","Welcome",JOptionPane.WARNING_MESSAGE);

        int tahunLahir = Integer.parseInt(JOptionPane.showInputDialog(null,"Tell me when you were born"+ " "+ namaUser,"Number Only!",JOptionPane.QUESTION_MESSAGE));

        int tahunSekarang = Integer.parseInt(JOptionPane.showInputDialog(null,"Tell me what year is now","Year",JOptionPane.QUESTION_MESSAGE));
        while (tahunSekarang < tahunLahir){
        JOptionPane.showMessageDialog(null,"Make sure that the year now is bigger than the year you were born,and make sure you put number","Wrong Input",JOptionPane.WARNING_MESSAGE);

	    tahunLahir = Integer.parseInt(JOptionPane.showInputDialog(null,"Tell me when you were born"+ " "+ namaUser,"Number Only!",JOptionPane.QUESTION_MESSAGE));

      tahunSekarang = Integer.parseInt(JOptionPane.showInputDialog(null,"Tell me what year is now","Year",JOptionPane.QUESTION_MESSAGE));
    }

	    int Umur = tahunSekarang-tahunLahir;
	    int harapanHidup = Integer.parseInt(JOptionPane.showInputDialog(null,"Hey,tell me how long you want to live?","Number only"));

        while (Umur > harapanHidup){
	        JOptionPane.showMessageDialog(null,"Congrats,you fullfill your expectation,but let move to the next step! \n Make sure you want to live longer than your age now","Wrong Input",JOptionPane.WARNING_MESSAGE);
	        harapanHidup = Integer.parseInt(JOptionPane.showInputDialog(null,"Hey,tell me how long you want to live?","Number only"));
        }

	    float sisaHidup = (Umur*100.0f)/ harapanHidup;
        int gaji =Integer.parseInt(JOptionPane.showInputDialog(null,"I Have ___________ Income/month","00000000"));
       while (gaji < 0){
           JOptionPane.showMessageDialog(null,"I hope for the best future for you,the future where you have >0 income\n You can put 0 if you have no income right now");
            gaji =Integer.parseInt(JOptionPane.showInputDialog(null,"I Have ___________ Income/month","00000000"));
       }


        double persenTabungan  = Double.parseDouble(JOptionPane.showInputDialog(null,"I save ________ of my income/month","Example 10% = 0.1"));
       while((persenTabungan < 0) || (persenTabungan > 1)){
           JOptionPane.showMessageDialog(null,"Make sure you put 0-1","Wrong INPUT",JOptionPane.WARNING_MESSAGE);
           persenTabungan  = Double.parseDouble(JOptionPane.showInputDialog(null,"I save ________ of my income/month","Example 10% = 0.1"));
       }



        String mimpi = JOptionPane.showInputDialog(null,"What is your dream?");
        String jobNow = JOptionPane.showInputDialog(null, "Right now im a  ______");
        String futureS = JOptionPane.showInputDialog(null,"I hope for the _____","Better/worse future?");



        String myBest = JOptionPane.showInputDialog(null,"And i hope my wish ______ come true","Do/dont");
        JOptionPane.showConfirmDialog(null,"Are you sure about what you write on that form?");
        double  persenTabungancomplete= persenTabungan*100;
        // The stories

        JOptionPane.showMessageDialog(null,"Thanks for writing,and here's the result");
        JOptionPane.showMessageDialog(null, "Hi my name is"+" "+ namaUser + " "+ "Here's my life story (Expectation)" + "\n Im born on" + " " + tahunLahir + " " + "and now im" + " "+ Umur + " " + "Years old." +
                " "+ "I'm now at " + " " + sisaHidup + "%" + " of my life expectation which is" +" "+ harapanHidup + "." +" " + "I have "+ " " + gaji + " " + "Income/month" + " " + "Which i save " + " " + persenTabungancomplete + "%"+" " + "of it."
                + "\n In the future i want to " + " " + mimpi + " "+ "but right now im a "+ " "+ jobNow + " "+"." + "\n Now,I hope for the" + " "+ futureS +" "+"future"+" " +"and i hope my wish "+ " "+ myBest + " "+ "come true.");

        JOptionPane.showMessageDialog(null,"Thank you for your time");}

    }