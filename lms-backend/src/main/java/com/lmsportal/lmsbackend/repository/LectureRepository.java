package com.lmsportal.lmsbackend.repository;

import com.lmsportal.lmsbackend.model.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepository extends JpaRepository<Lecture, Long> {
}
