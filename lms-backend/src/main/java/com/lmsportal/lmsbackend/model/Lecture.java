package com.lmsportal.lmsbackend.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Lecture")
public class Lecture {
    @Id
    @SequenceGenerator(name = "lecture_sequence", sequenceName = "lecture_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lecture_sequence")
    @Column(updatable = false)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(name = "lecture_order")
    private Integer order;

    @OneToMany(
            mappedBy = "lecture",
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private List<Chapter> chapters;

    public Lecture() {
    }

    public Lecture(String title, Integer order) {
        this.title = title;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", order=" + order +
                '}';
    }
}
