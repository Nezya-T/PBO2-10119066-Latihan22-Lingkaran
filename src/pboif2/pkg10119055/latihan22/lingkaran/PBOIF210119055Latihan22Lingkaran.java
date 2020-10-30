/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119055.latihan22.lingkaran;
import java.util.Scanner;

/**
 *
 * @author Neyza-T
 * Nama  : Nezya Tariska
 * Nim   : 10119066
 * Kelas : PBO/IF2
 */
public class PBOIF210119055Latihan22Lingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        System.out.println("==============Perhitungan Lingkaran==============");
        
        boolean status = false;
        while (!status){
            System.out.print("Masukkan nilai diamaeter lingkaran : ");
            if (scanner.hasNextInt()){
                int lingkaran = scanner.nextInt();
                status = true;
                System.out.println(" ");
                System.out.println("===========Hasil Perhitungan Lingkaran===========");
                double jari = lingkaran/2;
                double luas = 3.14 * jari * jari;
                double keliling = 3.14 * lingkaran;
                System.out.println("Jari-jari Lingkaran = " + jari +" cm");
                System.out.println("Luas Lingkaran = " + luas +" cm");
                System.out.println("Keliling Lingkaran = " + keliling +" cm");
        }else{
                    System.out.println("Nilai Diameter Tidak Sesuai");
                    scanner.next();
                    }
        }
    }
    
}
