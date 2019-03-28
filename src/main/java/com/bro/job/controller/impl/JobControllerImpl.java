package com.bro.job.controller.impl;

import com.bro.job.business.JobBusiness;
import com.bro.job.controller.JobController;
import com.bro.job.controller.converter.JobViewConverter;
import com.bro.job.controller.view.JobView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class JobControllerImpl implements JobController {

    private final JobViewConverter converter;
    private final JobBusiness business;

    @Override
    public List<JobView> retrieve() {
        return business
                .retrieve()
                .stream()
                .map(converter::convert)
                .collect(Collectors.toList())
        ;
    }
}
