package com.regissantana.camundamultidatasource;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.camunda.bpm.spring.boot.starter.event.PreUndeployEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;

@EnableProcessApplication
@SpringBootApplication
public class CamundaApplication {

    Logger logger = LoggerFactory.getLogger(CamundaApplication.class);

    public static void main(String... args) {
        SpringApplication.run(CamundaApplication.class, args);
    }

    @EventListener
    public void onPostDeploy(PostDeployEvent event) {
        logger.info("CUSTOM PROJECT - Engine configuration finished.");
    }

    @EventListener
    public void onPreUndeploy(PreUndeployEvent event) {

    }

}
