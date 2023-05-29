package com.lmsportal.lmsbackend.model;

import jakarta.persistence.*;

@Entity(name = "Chapter")
public class Chapter {
    @Id
    @SequenceGenerator(name = "chapter_sequence", sequenceName = "chapter_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "chapter_sequence")
    @Column(updatable = false)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    @Column(name = "chapter_order")
    private Integer order;
    @ManyToOne
    @JoinColumn(
            name = "lecture_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "lecture_section_fk"
            )
    )
    private Lecture lecture;

    public Chapter() {
    }

    public Chapter(String title, String content, Integer order) {
        this.title = title;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", order=" + order +
                '}';
    }
}
