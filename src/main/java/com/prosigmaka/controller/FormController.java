package com.prosigmaka.controller;

import com.prosigmaka.database.MahasiswaDb;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;


@Controller
public class FormController {

    @GetMapping("/tambah-mahasiswa")
    public ModelAndView displayFormTambahMahasiswa() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("formView");
        return mv;
    }

    @PostMapping("/tambah-mahasiswa")
    public ModelAndView tambahMahasiswa(
            @RequestParam("nim") int nim,
            @RequestParam("nama") String nama,
            @RequestParam("tanggal_lahir") Date tanggal_lahir,
            @RequestParam("jurusan") String jurusan,
            @RequestParam("tahun_masuk") int tahun_masuk
    ) {
        MahasiswaDb.addMahasiswa(nim, nama, tanggal_lahir, jurusan, tahun_masuk);
        return new ModelAndView("redirect:/mahasiswa");
    }
}
