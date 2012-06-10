package com.nightspawn.tasktree.webservices;

import java.util.Collections;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.nightspawn.tasktree.business.tasks.TaskFinderService;
import com.nightspawn.tasktree.dtos.Task;
import com.sun.jersey.api.json.JSONWithPadding;

@Stateless
@Path("/task")
@Produces({ "application/x-javascript", "application/javascript",
		MediaType.APPLICATION_JSON })
public class TaskListResource {
	@Inject
	TaskFinderService finder;

	// @GET
	// @Path("/all")
	public List<Task> getAllTasks() {
		List<Task> allTasks = finder.getAllTasks();
		Collections.sort(allTasks);
		return allTasks;
	}

	@GET
	@Path("/all")
	public JSONWithPadding getAllTasks(
			@QueryParam("callback") @DefaultValue("fn") String callback) {
		System.out.println("penis " + callback);
		List<Task> allTasks = getAllTasks();
		return new JSONWithPadding(allTasks, callback);
	}

}
