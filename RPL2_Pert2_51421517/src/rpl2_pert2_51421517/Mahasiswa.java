/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpl2_pert2_51421517;

/**
 *
 * @author User
 */
public class Mahasiswa extends Student {
    public Mahasiswa() {
        super();
    }
    
    @Override
    public String toString() {
        return "Nama\t\t: "+getName()+"\nNPM\t\t: "+
                getNpm()+"\nKelas\t\t: "+getClass_()+
                "\nTahun Lahir\t: "+getBirthYear()+
                "\nUmur\t\t: "+calculateAge()+
                "\nAlamat\t\t: "+getAlamat();
    }
}
