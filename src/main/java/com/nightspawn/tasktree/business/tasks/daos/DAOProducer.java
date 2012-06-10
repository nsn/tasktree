package com.nightspawn.tasktree.business.tasks.daos;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class DAOProducer {
	@EJB
	FindTasksDAOMockup findTasksDAOMockup;

	@Produces
	public FindTasksDAO makeFindTasksDAO() {
		System.out.println("ficken ");
		return findTasksDAOMockup;
	}

}
