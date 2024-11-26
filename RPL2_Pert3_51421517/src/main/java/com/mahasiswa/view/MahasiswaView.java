/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mahasiswa.view;

import com.mahasiswa.controller.MahasiswaController;
import com.mahasiswa.model.MahasiswaDAO;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MahasiswaView {

    public static void main(String[] args) {
        MahasiswaDAO mahasiswaDAO = new MahasiswaDAO();
        MahasiswaController mahasiswaController = new MahasiswaController(mahasiswaDAO);
        
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tampilkan Semua Mahasiswa");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Update Mahasiswa");
            System.out.println("4. Hapus Mahasiswa");
            System.out.println("5. Cek Koneksi Database");
            System.out.println("6. Keluar");
            System.out.print("PILIH OPSI : ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            
            switch (pilihan) {
                case 1:
                    mahasiswaController.displayAllMahasiswa();
                    break;
                    
                case 2:
                    System.out.print("Masukkan NPM : ");
                    String npm = scanner.nextLine();
                    
                    System.out.print("Masukkan Nama : ");
                    String nama = scanner.nextLine();
                    
                    System.out.print("Masukkan Semester : ");
                    int semester = scanner.nextInt();
                    
                    System.out.print("Masukkan IPK : ");
                    float ipk = scanner.nextFloat();
                    
                    mahasiswaController.addMahasiswa(npm, nama, semester, ipk);
                    break;
                
                case 3:
                    System.out.print("Masukkan ID Mahasiswa : ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Masukkan NPM : ");
                    String npmBaru = scanner.nextLine();
                    
                    System.out.print("Masukkan Nama : ");
                    String namaBaru = scanner.nextLine();
                    
                    System.out.print("Masukkan Semester : ");
                    int semesterBaru = scanner.nextInt();
                    
                    System.out.print("Masukkan IPK : ");
                    float ipkBaru = scanner.nextFloat();
                    
                    mahasiswaController.updateMahasiswa(id, npmBaru, namaBaru, semesterBaru, ipkBaru);
                    break;
                
                case 4:
                    System.out.print("Masukkan ID Mahasiswa yang ingin dihapus : ");
                    int idDelete = scanner.nextInt();
                    
                    mahasiswaController.deleteMahasiswa(idDelete);
                    break;
                    
                case 5:
                    mahasiswaController.checkDatabaseConnection();
                    break;
                    
                case 6:
                    mahasiswaController.closeconnection();
                    System.out.println("Program selesai");
                    return;
                
                default:
                    System.out.println("Input tidak valid");
            }
        }
    }
}
