package com.bro.job.business.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Job {

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
