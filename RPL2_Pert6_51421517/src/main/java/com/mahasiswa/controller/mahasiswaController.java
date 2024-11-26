/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mahasiswa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mahasiswa.model.modelMahasiswa;
import com.mahasiswa.service.mahasiswaService;
import java.util.List;
import org.springframework.stereotype.Controller;
/**
 *
 * @author User
 */
@Controller
public class mahasiswaController {
    @Autowired
    private mahasiswaService mahasiswaService;
    
    public String addMahasiswa(@RequestBody modelMahasiswa mhs) {
        mahasiswaService.addMhs(mhs);
        return "Mahasiswa berhasil ditambahkan";
    }
    
    public modelMahasiswa getMahasiswa(@PathVariable int id) {
        return mahasiswaService.getMhs(id);
    }
    
    public String updateMahasiswa(@RequestBody modelMahasiswa mhs) {
        mahasiswaService.updateMhs(mhs);
        return "Mahasiswa berhasil diperbarui";
    }
    
    public String deleteMahasiswa(@PathVariable int id) {
        mahasiswaService.deleteMhs(id);
        return "Mahasiswa berhasil dihapus";
    }
    
    public List<modelMahasiswa> getAllMahasiswa() {
        return mahasiswaService.getAllMahasiswa();
    }
}
