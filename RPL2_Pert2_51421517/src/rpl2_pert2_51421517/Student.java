/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpl2_pert2_51421517;
import java.time.*;
/**
 *
 * @author User
 */
public class Student {
    private String name;
    private String npm;
    private String class_;
    private int birthYear;
    private String alamat;
    
    public Student() {
        this.name = "";
        this.npm = "";
        this.class_ = "";
        this.birthYear = 0;
        this.alamat = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public int calculateAge() {
        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;
        return age;
    }
}