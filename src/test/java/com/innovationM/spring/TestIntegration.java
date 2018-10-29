package com.innovationM.spring;

import javax.transaction.Transactional;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { PersistenceJPAConfig.class })
@Transactional
public abstract class TestIntegration {

}