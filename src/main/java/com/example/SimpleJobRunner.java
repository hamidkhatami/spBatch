package com.example;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author khatami ( khatami@caspco.ir)
 * @version 1.0 2024.0605
 * @createDate 7/12/2025
 * @since 1.0
 */
@Component
public class SimpleJobRunner implements CommandLineRunner {


    private final JobLauncher jobLauncher;
    private final Job job;

    public SimpleJobRunner(JobLauncher jobLauncher, Job job) {
        this.jobLauncher = jobLauncher;
        this.job = job;
    }

    @Override
    public void run(String... args) throws Exception {
        JobParameters params = new JobParametersBuilder()
                .addLong("run.id", System.currentTimeMillis())
                .toJobParameters();

        jobLauncher.run(job, params);
    }
}