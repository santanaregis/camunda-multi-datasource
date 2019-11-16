package com.regissantana.camundamultidatasource;

import org.camunda.bpm.engine.test.Deployment;
import org.camunda.bpm.engine.test.mock.Mocks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({ "test" })
public class ParseProcessTest {

    @Before
    public void setup() {

    }

    @Test
    @Deployment(resources = "bpmn/test.bpmn")
    public void testParseAndDeployOrigination() {
    }

    @After
    public void tearDown() {
        Mocks.reset();
    }

}
