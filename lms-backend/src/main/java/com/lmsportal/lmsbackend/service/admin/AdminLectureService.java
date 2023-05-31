package com.lmsportal.lmsbackend.service.admin;

import com.lmsportal.lmsbackend.model.Chapter;
import com.lmsportal.lmsbackend.model.Lecture;

import java.util.List;

public interface AdminLectureService {

    Lecture createLecture(Lecture lecture);

    List<Lecture> getLectures();

    Lecture getLecture(Long lectureId);

    Lecture addChapter(Long lectureId, Chapter chapter);
    Lecture updateChapter(Long lectureId, Chapter chapter);
    void deleteChapter(Long lectureId);

}
