/**
 * 
 * Copyright (c) 2017 Fractus IT d.o.o. <http://fractus.io>
 * 
 */

package io.fractus.springframework.tutorial.dependency.injection.beanlifecycle;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorBeanTest {

	
	private static ClassPathXmlApplicationContext BEAN_FACTORY;
	
	@BeforeClass
	public static void before(){
		BEAN_FACTORY = new ClassPathXmlApplicationContext("beanlifecycle-context.xml");
	}
	
	@Test
	public void testBeanPostProcessorBean() {		

	  BeanPostProcessorBean beanPostProcessorBean = (BeanPostProcessorBean)BEAN_FACTORY.getBean("beanPostProcessorBean");
		assertEquals("beforeInitialization", beanPostProcessorBean.getBeforeInitialization());
		assertEquals("aName", beanPostProcessorBean.getName());
		assertEquals("afterInitialization", beanPostProcessorBean.getAfterInitialization());
						
	}	
}
