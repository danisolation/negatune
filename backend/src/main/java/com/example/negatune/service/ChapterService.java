package com.example.negatune.service;

import com.example.negatune.model.Chapter;
import com.example.negatune.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterService {

    @Autowired
    private ChapterRepository chapterRepository;

    public List<Chapter> getAllChapters() {
        return chapterRepository.findAll();
    }

    public Chapter createChapter(Chapter chapter) {
        return chapterRepository.save(chapter);
    }
}
