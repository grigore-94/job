package com.bro.job.controller.converter;

import com.bro.job.business.dto.Job;
import com.bro.job.controller.view.JobView;
import com.google.common.base.Converter;
import org.springframework.stereotype.Component;

@Component
public class JobViewConverter extends Converter<Job, JobView> {

    @Override
    protected JobView doForward(Job dto) {
        JobView view = new JobView();
        view.setId(dto.getId());
        view.setType(dto.getType());
        view.setCompany(dto.getCompany());
        view.setLogo(dto.getLogo());
        view.setUrl(dto.getUrl());
        view.setPosition(dto.getPosition());
        view.setLocation(dto.getLocation());
        view.setDescription(dto.getDescription());
        view.setHowToApply(dto.getHowToApply());
        view.setToken(dto.getToken());
        view.setIsPublic(dto.getIsPublic());
        view.setIsActivated(dto.getIsActivated());
        view.setEmail(dto.getEmail());
        view.setExpiresAt(dto.getExpiresAt());
        view.setCreatedAt(dto.getCreatedAt());
        view.setUpdatedAt(dto.getUpdatedAt());

        return view;
    }

    @Override
    protected Job doBackward(JobView view) {
        Job dto = new Job();
        dto.setId(view.getId());
        dto.setType(view.getType());
        dto.setCompany(view.getCompany());
        dto.setLogo(view.getLogo());
        dto.setUrl(view.getUrl());
        dto.setPosition(view.getPosition());
        dto.setLocation(view.getLocation());
        dto.setDescription(view.getDescription());
        dto.setHowToApply(view.getHowToApply());
        dto.setToken(view.getToken());
        dto.setIsPublic(view.getIsPublic());
        dto.setIsActivated(view.getIsActivated());
        dto.setEmail(view.getEmail());
        dto.setExpiresAt(view.getExpiresAt());
        dto.setCreatedAt(view.getCreatedAt());
        dto.setUpdatedAt(view.getUpdatedAt());

        return dto;
    }
}
