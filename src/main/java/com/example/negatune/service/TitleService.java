package com.example.negatune.service;

import com.example.negatune.model.Title;
import com.example.negatune.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleService {

    @Autowired
    private TitleRepository titleRepository;

    public List<Title> getAllTitles() {
        return titleRepository.findAll();
    }

    public Title createTitle(Title title) {
        return titleRepository.save(title);
    }
}
