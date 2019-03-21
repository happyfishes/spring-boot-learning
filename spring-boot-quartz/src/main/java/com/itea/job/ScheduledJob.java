package com.itea.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @ClassName ScheduledJob
 * @Describe
 * @create 2019-03-21 14:43
 * @Version 1.0
 **/
public class ScheduledJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("schedule job1 is running ...");
    }
}
