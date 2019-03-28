package com.bro.job.controller.view;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class JobView {

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
