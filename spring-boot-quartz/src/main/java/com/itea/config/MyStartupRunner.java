package com.itea.config;

import com.itea.scheduler.CronSchedulerJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyStartupRunner
 * @Describe
 * @create 2019-03-21 14:52
 * @Version 1.0
 **/
@Component
public class MyStartupRunner implements CommandLineRunner {

   @Autowired
   private CronSchedulerJob schedulerJobs;

    @Override
    public void run(String... args) throws Exception {
        schedulerJobs.scheduleJobs();
        System.out.println(">>>>>>>>>>>>>>>定时任务开始执行<<<<<<<<<<<<<");
    }
}
