package com.lmsportal.lmsbackend.controller;

import com.lmsportal.lmsbackend.model.Lecture;
import com.lmsportal.lmsbackend.service.admin.AdminLectureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lectures")
@CrossOrigin("*")
public class AdminLectureController {
    private final AdminLectureService lectureService;

    public AdminLectureController(AdminLectureService lectureService) {
        this.lectureService = lectureService;
    }
    @PostMapping
    public Lecture createLecture(@RequestBody Lecture lecture) {
        return new Lecture();
    }

    @GetMapping
    public List<Lecture> getLectures() {
        return this.lectureService.getLectures();
    }

    @GetMapping("/{lectureId}")
    public Lecture getLecture(@PathVariable("lectureId") Long lectureId) {
        return null;
    }

}
