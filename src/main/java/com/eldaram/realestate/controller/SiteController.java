package com.eldaram.realestate.controller;

import com.eldaram.realestate.model.Estate;
import com.eldaram.realestate.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SiteController {
    @Autowired
    private EstateService service;
    @GetMapping("/")
    public String index(ModelMap map) {
        List<Estate> estates = this.service.findAll();
        map.put("estateList", estates);
        return "estate";
    }

    @GetMapping("/admin")
    public String admin(ModelMap map) {
        List<Estate> estates = this.service.findAll();
        map.put("estateList", estates);
        return "admin";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Estate estate) {
        this.service.save(estate);
        return "redirect:/admin";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Estate estate) {
        this.service.update(estate);
        return "redirect:/admin";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        this.service.delete(id);
        return "redirect:/admin";
    }
}
