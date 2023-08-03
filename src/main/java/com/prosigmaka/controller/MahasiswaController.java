package com.prosigmaka.controller;

import com.prosigmaka.database.MahasiswaDb;
import com.prosigmaka.model.Mahasiswa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.util.List;

@Controller
public class MahasiswaController {

    @GetMapping("/mahasiswa")
    public ModelAndView getAllMahasiswa() {
        ModelAndView mv = new ModelAndView();
        List<Mahasiswa> listMahasiswa = MahasiswaDb.getAllMahasiswa();

        mv.addObject("listMahasiswa", listMahasiswa);
        mv.setViewName("mahasiswaView");
        return mv;
    }

    @PostMapping("/add-mahasiswa")
    public ModelAndView addMahasiswa(
            @RequestParam("nim") int nim,
            @RequestParam("nama") String nama,
            @RequestParam("tanggal_lahir") Date tanggal_lahir,
            @RequestParam("jurusan") String jurusan,
            @RequestParam("tahun_masuk") int tahun_masuk
    ) {
        MahasiswaDb.addMahasiswa(new Mahasiswa(nim, nama, tanggal_lahir, jurusan, tahun_masuk));
        return new ModelAndView("redirect:/mahasiswa");
    }

    @PostMapping("/edit-mahasiswa")
    public ModelAndView editMahasiswa(
            @RequestParam("nim") int nim,
            @RequestParam("nama") String nama,
            @RequestParam("tanggal_lahir") Date tanggal_lahir,
            @RequestParam("jurusan") String jurusan,
            @RequestParam("tahun_masuk") int tahun_masuk,
            @RequestParam("prev_nim") int prev_nim
    ) {
        MahasiswaDb.editMahasiswa(prev_nim, new Mahasiswa(nim, nama, tanggal_lahir, jurusan, tahun_masuk));
        return new ModelAndView("redirect:/mahasiswa");
    }

    @PostMapping("/delete")
    public ModelAndView deleteMahasiswa(@RequestParam("nim") int nim) {
        MahasiswaDb.deleteMahasiswa(nim);
        return new ModelAndView("redirect:/mahasiswa");
    }
}
