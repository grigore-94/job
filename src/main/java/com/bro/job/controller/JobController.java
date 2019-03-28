package com.bro.job.controller;

import com.bro.job.controller.view.JobView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@RequestMapping("/job")
public interface JobController {

    @GetMapping
    List<JobView> retrieve();
}
