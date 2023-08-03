package com.prosigmaka.controller;

import com.prosigmaka.database.MahasiswaDb;
import com.prosigmaka.model.Mahasiswa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FormController {

    @GetMapping("/add-mahasiswa")
    public ModelAndView displayFormAddMahasiswa() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("action", "/add-mahasiswa");
        mv.setViewName("formView");
        return mv;
    }

    @GetMapping("/edit-mahasiswa")
    public ModelAndView displayFormEditMahasiswa(@RequestParam("nim") int nim) {
        Mahasiswa mahasiswa = MahasiswaDb.getMahasiswa(nim);

        ModelAndView mv = new ModelAndView();
        mv.addObject("action", "/edit-mahasiswa");
        mv.addObject("mahasiswa", mahasiswa);
        mv.setViewName("formView");
        return mv;
    }
}
