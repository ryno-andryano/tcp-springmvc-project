package com.prosigmaka.controller;

import com.prosigmaka.database.MahasiswaDb;
import com.prosigmaka.model.Mahasiswa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

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
}
