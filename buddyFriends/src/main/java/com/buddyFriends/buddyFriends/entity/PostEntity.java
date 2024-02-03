package com.buddyFriends.buddyFriends.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Post")
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="postid", nullable = false)
    private Long postId;

    @ManyToOne
    @JoinColumn(name="userid",nullable=false)
    private UserEntity userId;

    @ManyToOne
    @JoinColumn(name="petid", nullable=false)
    private PetEntity petId;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="content", nullable = false)
    private String content;

    @Column(name="periodstart", nullable = false)
    private LocalDateTime periodStart;

    @Column(name="periodend", nullable = false)
    private LocalDateTime periodEnd;

    @Column(name="helpersex", nullable = false)
    private boolean helperSex;

    @Column(name="done", nullable = false)
    private boolean done;

    @Column(name="pickid", nullable = false)
    private Long pickId;

    @Column(name="caredone", nullable = false)
    private boolean careDone;

}