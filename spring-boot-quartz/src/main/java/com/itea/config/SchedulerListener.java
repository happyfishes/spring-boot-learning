package com.itea.config;

import com.itea.scheduler.CronSchedulerJob;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @ClassName SchedulerListener
 * @Describe
 * @create 2019-03-21 14:53
 * @Version 1.0
 **/
@Configuration
@EnableScheduling
@Component
public class SchedulerListener {

    @Autowired
    private CronSchedulerJob schedulerJobs;

    @Scheduled(cron = "0 6 * * * ?")
    public void scheduler() throws SchedulerException {
        schedulerJobs.scheduleJobs();
    }
}
