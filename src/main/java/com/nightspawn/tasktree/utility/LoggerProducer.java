package com.nightspawn.tasktree.utility;

import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LoggerProducer {

	@Produces
	Logger makeLogger(InjectionPoint ip) {
		return Logger.getLogger(ip.getBean().getBeanClass().getName());
	}
	
}
