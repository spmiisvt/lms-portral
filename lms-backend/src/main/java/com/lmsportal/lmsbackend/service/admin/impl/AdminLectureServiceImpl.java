package com.lmsportal.lmsbackend.service.admin.impl;

import com.lmsportal.lmsbackend.exception.NotFoundException;
import com.lmsportal.lmsbackend.model.Chapter;
import com.lmsportal.lmsbackend.model.Lecture;
import com.lmsportal.lmsbackend.repository.ChapterRepository;
import com.lmsportal.lmsbackend.repository.LectureRepository;
import com.lmsportal.lmsbackend.service.admin.AdminLectureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminLectureServiceImpl implements AdminLectureService {
    private final LectureRepository lectureRepository;
    private final ChapterRepository chapterRepository;
    @Override
    public Lecture createLecture(Lecture lecture) {
        return this.lectureRepository.save(lecture);
    }

    @Override
    public List<Lecture> getLectures() {
        return this.lectureRepository.findAll();
    }

    @Override
    public Lecture getLecture(Long lectureId) {
        return this.lectureRepository.findById(lectureId)
                .orElseThrow(() -> {
                    NotFoundException notFoundException = new NotFoundException("Lecture with id " + lectureId + " not found");
                    return notFoundException;
                });
    }

    @Override
    public Lecture addChapter(Long lectureId, Chapter chapter) {

        return null;
    }

    @Override
    public Lecture updateChapter(Long lectureId, Chapter chapter) {
        return null;
    }

    @Override
    public void deleteChapter(Long lectureId) {
        this.chapterRepository.deleteById(lectureId);
    }
}
