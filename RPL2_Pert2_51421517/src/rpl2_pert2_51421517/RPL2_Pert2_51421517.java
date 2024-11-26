/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rpl2_pert2_51421517;

/**
 *
 * @author User
 */
public class RPL2_Pert2_51421517 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        
        mahasiswa.setName("William Devin S.P.");
        mahasiswa.setNpm("51421517");
        mahasiswa.setClass_("4IA06");
        mahasiswa.setBirthYear(2003);
        mahasiswa.setAlamat("Komplek Pelni Depok");
        
        System.out.println(mahasiswa.toString());
    }
    
}
