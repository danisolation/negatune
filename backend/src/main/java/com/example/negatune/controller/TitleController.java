package com.example.negatune.controller;

import com.example.negatune.model.Title;
import com.example.negatune.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/titles")
public class TitleController {

    @Autowired
    private TitleService titleService;

    @GetMapping
    public List<Title> getAllTitles() {
        return titleService.getAllTitles();
    }

    @PostMapping
    public Title createTitle(@RequestBody Title title) {
        return titleService.createTitle(title);
    }
}
