/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class utsjava {
    public static void main(String[] args) {
        Scanner Scanner = new
Scanner(System.in);
        // Tampilan pembatas
        System.out.println("\"");
        System.out.println("UTS 20 Mei 2024 oleh WAFIUDIN 23201102");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        System.out.print("Masukkan nama Anda: ");
        String nama = Scanner.nextLine();

        System.out.println("Pilih jenis kelamin:");
        System.out.println("1. Laki-laki");
        System.out.println("2. Perempuan");
        System.out.print("Masukkan pilihan (1/2): ");
        int jenisKelamin = Scanner.nextInt();

        String panggilan = (jenisKelamin == 1) ? "Mas" : "Mbak";

        System.out.println("Selamat Datang " + panggilan + " " + nama);
        System.out.println("Kalkulator");
        //10
        boolean lanjut = true;
        
        while (lanjut) {
            System.out.println("Masukkan bilangan pertama: ");
            double bilangan1 = Scanner.nextDouble();
            
            System.out.println("Masukkan bilangan kedua: ");
            double bilangan2 = Scanner.nextDouble();
            
            System.out.println("Masukkan Operator (+, -, *, /): ");
            char operator = Scanner.next().charAt(0);
            
            double hasil;
            boolean operatorValid = true;
            
            switch (operator) {
                case '+':
                    hasil = bilangan1 + bilangan2;
                    break;
                case '-':
                    hasil = bilangan1 - bilangan2;
                    break;
                case '*':
                    hasil = bilangan1 * bilangan2;
                    break;
                case '/':
                    if (bilangan2 != 0){
                       hasil = bilangan1 / bilangan2;
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak dapat dilakukan");
                        continue;
                    }
                    break;
                default:
                    System.out.println("operator tidak valid. pilih operator yang tersedia/valid.");
                    operatorValid = false;
                    hasil = 0;
                    break;
            }
            if (operatorValid) {
                System.out.println("Hasil: " + bilangan1 + " " + operator + " " + bilangan2 + " = " + hasil);
                }
            System.out.println("Apakah anda ingin melanjutkan pengghunaan Kalkulator? y/n: ");
            char lanjutPilihan = Scanner.next().charAt(0);
            
            if (lanjutPilihan == 'n' || lanjutPilihan == 'N') {
                lanjut = false;
                
                System.out.println("Terima kasih telah menggunakan kalkulator ini. sampai jumpa!");
                Scanner.close();
            }
        }

    }
}
