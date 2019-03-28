package com.bro.job.business.converter;

import com.bro.job.business.dto.Job;
import com.bro.job.repository.entity.JobEntity;
import com.google.common.base.Converter;
import org.springframework.stereotype.Component;

@Component
public class JobConverter extends Converter<JobEntity, Job> {

    @Override
    protected Job doForward(JobEntity entity) {
        Job job = new Job();
        job.setId(entity.getId());
        job.setType(entity.getType());
        job.setCompany(entity.getCompany());
        job.setLogo(entity.getLogo());
        job.setUrl(entity.getUrl());
        job.setPosition(entity.getPosition());
        job.setLocation(entity.getLocation());
        job.setDescription(entity.getDescription());
        job.setHowToApply(entity.getHowToApply());
        job.setToken(entity.getToken());
        job.setIsPublic(entity.getIsPublic());
        job.setIsActivated(entity.getIsActivated());
        job.setEmail(entity.getEmail());
        job.setExpiresAt(entity.getExpiresAt());
        job.setCreatedAt(entity.getCreatedAt());
        job.setUpdatedAt(entity.getUpdatedAt());

        return job;
    }

    @Override
    protected JobEntity doBackward(Job dto) {
        JobEntity entity = new JobEntity();
        entity.setId(dto.getId());
        entity.setType(dto.getType());
        entity.setCompany(dto.getCompany());
        entity.setLogo(dto.getLogo());
        entity.setUrl(dto.getUrl());
        entity.setPosition(dto.getPosition());
        entity.setLocation(dto.getLocation());
        entity.setDescription(dto.getDescription());
        entity.setHowToApply(dto.getHowToApply());
        entity.setToken(dto.getToken());
        entity.setIsPublic(dto.getIsPublic());
        entity.setIsActivated(dto.getIsActivated());
        entity.setEmail(dto.getEmail());
        entity.setExpiresAt(dto.getExpiresAt());
        entity.setCreatedAt(dto.getCreatedAt());
        entity.setUpdatedAt(dto.getUpdatedAt());

        return entity;
    }
}
