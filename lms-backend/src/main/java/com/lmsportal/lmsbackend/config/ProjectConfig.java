package com.lmsportal.lmsbackend.config;

import com.lmsportal.lmsbackend.model.Chapter;
import com.lmsportal.lmsbackend.model.Lecture;
import com.lmsportal.lmsbackend.model.Project;
import com.lmsportal.lmsbackend.model.Stage;
import com.lmsportal.lmsbackend.repository.ChapterRepository;
import com.lmsportal.lmsbackend.repository.LectureRepository;
import com.lmsportal.lmsbackend.repository.ProjectRepository;
import com.lmsportal.lmsbackend.repository.StageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProjectConfig {
    @Bean
    CommandLineRunner commandLineRunner(ProjectRepository projectRepository,
                                        StageRepository stageRepository,
                                        LectureRepository lectureRepository,
                                        ChapterRepository chapterRepository) {
        return args -> {
            Project generator = new Project(
                    "Генератор текста",
                    "В этом разделе мы будем создавать генератор текста");
            Project parser = new Project(
                    "Парсер сайта",
                    "В этом разделе мы будем создавать парсер сайта");
            projectRepository.saveAll(List.of(generator, parser));
            Stage stage1 = new Stage("1 Этап", "first stage", 1);
            Stage stage2 = new Stage("2 Этап", "second stage", 2);
            Stage stage3 = new Stage("3 Этап", "third stage", 3);
            Stage stage4 = new Stage("4 Этап", "fours stage", 4);

            Stage st1 = new Stage("1 Этап", "first stage", 1);
            Stage st2 = new Stage("2 Этап", "second stage", 2);
            Stage st3 = new Stage("3 Этап", "third stage", 3);
            Stage st4= new Stage("4 Этап", "fours stage", 4);

            stage1.setProject(generator);
            stage2.setProject(generator);
            stage3.setProject(generator);
            stage4.setProject(generator);

            st1.setProject(parser);
            st2.setProject(parser);
            st3.setProject(parser);
            st4.setProject(parser);
            stageRepository.saveAll(List.of(stage1, stage2, stage3, stage4, st1, st2, st3, st4));

            Lecture l1 = new Lecture("Introduction", 1);
            Lecture l2 = new Lecture("Variables", 2);
            lectureRepository.saveAll(List.of(l1, l2));

            Chapter ch1 = new Chapter("Intro", "some text...", 1);
            Chapter ch2 = new Chapter("why is python", "some text...", 2);
            Chapter ch3 = new Chapter("History", "some text...", 3);
            ch1.setLecture(l1);
            ch2.setLecture(l1);
            ch3.setLecture(l1);


            Chapter ch11 = new Chapter("Intro", "some text...", 1);
            Chapter ch22 = new Chapter("why is python", "some text...", 2);
            Chapter ch33 = new Chapter("History", "some text...", 3);

            ch11.setLecture(l2);
            ch22.setLecture(l2);
            ch33.setLecture(l2);

            chapterRepository.saveAll(List.of(ch1, ch2, ch3, ch11, ch22, ch33));


        };
    }
}
