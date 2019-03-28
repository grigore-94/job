package com.bro.job.business.impl;

import com.bro.job.business.JobBusiness;
import com.bro.job.business.converter.JobConverter;
import com.bro.job.business.dto.Job;
import com.bro.job.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JobBusinessImpl implements JobBusiness {

    private final JobConverter converter;
    private final JobRepository repository;

    @Override
    public List<Job> retrieve() {
        return repository.findAll()
                .stream()
                .map(converter::convert)
                .collect(Collectors.toList());
    }
}
