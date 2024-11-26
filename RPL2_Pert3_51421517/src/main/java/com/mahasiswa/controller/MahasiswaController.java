/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mahasiswa.controller;

import java.sql.*;
import com.mahasiswa.model.MahasiswaDAO;
import com.mahasiswa.model.ModelMahasiswa;
import java.util.List;
/**
 *
 * @author User
 */
public class MahasiswaController {
    private MahasiswaDAO mahasiswaDAO;
    
    public void displayMahasiswaList(List<ModelMahasiswa> mahasiswaList) {
        if (mahasiswaList.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa");
        } else {
            System.out.println("");
            System.out.println("============================");
            for (ModelMahasiswa m: mahasiswaList) {
                System.out.println("ID           : " + m.getId());
                System.out.println("NPM          : " + m.getNpm());
                System.out.println("NAMA         : " + m.getNama());
                System.out.println("SEMESTER     : " + m.getSemester());
                System.out.println("IPK          : " + m.getIpk() + "\n");
            }
            System.out.println("============================");
        }
        displayMessage("Mahasiswa berhasil ditampilkan");
    }
    
    public void displayMessage(String message) {
        System.out.println(message);
    }
    
    public MahasiswaController(MahasiswaDAO mahasiswaDAO) {
        this.mahasiswaDAO = mahasiswaDAO;
    }
    
    public void checkDatabaseConnection() {
        boolean isConnected = mahasiswaDAO.cekKoneksi();
        if (isConnected) {
            displayMessage("Koneksi ke database berhasil");
        } else {
            displayMessage("Koneksi ke database gagal");
        }
    }
    
    public void displayAllMahasiswa() {
        List<ModelMahasiswa> mahasiswaList = mahasiswaDAO.getAllMahasiswa();
        displayMahasiswaList(mahasiswaList);
    }
    
    public void addMahasiswa(String npm, String nama, int semester, float ipk) {
        ModelMahasiswa mahasiswaBaru = new ModelMahasiswa(0, npm, nama, semester, ipk);
        mahasiswaDAO.addMahasiswa(mahasiswaBaru);
        displayMessage("Mahasiswa berhasil ditambahkan");
    }
    
    public void updateMahasiswa(int id, String npm, String nama, int semester, float ipk) {
        ModelMahasiswa mahasiswaBaru = new ModelMahasiswa(id, npm, nama, semester, ipk);
        mahasiswaDAO.updateMahasiswa(mahasiswaBaru);
        displayMessage("Mahasiswa berhasil diperbaharui");
    }
    
    public void deleteMahasiswa(int id) {
        mahasiswaDAO.deleteMahasiswa(id);
        displayMessage("Mahasiswa berhasil dihapus");
    }
    
    public void closeconnection() {
        mahasiswaDAO.closeConnection();
    }
}
