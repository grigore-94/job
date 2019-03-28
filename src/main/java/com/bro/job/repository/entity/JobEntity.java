package com.bro.job.repository.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "job")
public class JobEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String type;

    private String company;

    private String logo;

    private String url;

    private String position;

    private String location;

    private String description;

    private String howToApply;

    private String token;

    private Boolean isPublic;

    private Boolean isActivated;

    private String email;

    private Date expiresAt;

    private Date createdAt;

    private Date updatedAt;
}
