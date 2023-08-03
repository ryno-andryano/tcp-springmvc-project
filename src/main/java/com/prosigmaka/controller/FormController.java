package com.prosigmaka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FormController {

    @GetMapping("/add-mahasiswa")
    public ModelAndView displayFormAddMahasiswa() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("formView");
        return mv;
    }


}
