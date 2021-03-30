import java.util.*;
import java.lang.Math.*;
import javax.swing.*;


public class ProcessAName5026201106{

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        // Input Nama
        System.out.print("Please put your name = ");

        String nama = myObj.nextLine();

        System.out.println("Your full name is = " +nama);



        // Mencari panjang String First Name

        String namaAwal = "";
        String hurufAwal;
        for(int i = 0; i < nama.length();i++) {
            // memecah string menjadi char
            char hurufUntukFirstName = nama.charAt(i);
            /* Mencari spasi,sehingga nama ditemukan Ex: Aidhil(_)Akbar(_)Nurdin
               Ketika spasi tidak ditemukan maka looping akan berlanjut
                ex: A,I,D,H,I,L

            */
            if (hurufUntukFirstName != ' ') {
                hurufAwal = namaAwal + hurufUntukFirstName;
                namaAwal = hurufAwal;
            }
            /*
            Jika ditemukan spasi maka looping akan dihentikan karena tujuannya adalah
            mencari jumlah char yang ada pada first name
             */
            else {
                break;
            }
        }
        /* Akhir dari pencarian jumlah char First Name
        Output akan ditaruh pada akhir program
         */

        //Mulai Mencari inisial
        // Sortir
        // Variable dimasukkan dengan nilai kosong karena kita akan berurusan dengan char
        String inisial =  "";
        String namaSortir = "";
        String namaSortirInisial ="";
        char sementara;

        // Program diloop selama panjang nama.
        for(int j = 0; j < nama.length();j++){
            // memecah string menjadi char
            char huruf = nama.charAt(j);
            /* Mencari spasi,sehingga nama ditemukan Ex: Aidhil(_)Akbar(_)Nurdin
               Ketika string berakhir(tidak ada spasi) maka huruf yang digabung menjadi namaSortir
                dimana ini akan ditaruh didepan
                ex: Nurdin + ......(yang dicari nanti)

            */
            if(huruf != ' '){
                inisial = inisial + huruf;
                namaSortir = inisial;
            }
            /*
            Jika tidak spasi maka akan pindah ke else
            dimana huruf pertama dalam inisial akan dimasukan ke namaSortirInisial,namun akan dibuat kapital terlebih dahulu
            inisial akan direset menjadi nilai kosong dan kembali ke program if
             */
            else {
                sementara = Character.toUpperCase(inisial.charAt(0));
                namaSortirInisial = namaSortirInisial + Character.toString(sementara) + ".";
                inisial = "";
            }

        }
      
        // Output
        System.out.println("Your first name length is = "+ namaAwal.length());
            System.out.println("And your name is = " + namaSortir + ", " + namaSortirInisial);
            System.out.println("See you soon," + namaSortir + ".");
        // Program selesai
        
    }
}
