package org.ncibi.ws.server;


import org.ncibi.db.PersistenceSession;
import org.ncibi.chipenrich.ChipEnrichInputArguments;
import org.ncibi.ws.resource.chipenrich.ChipEnrichResource;
import org.ncibi.mqueue.MessageQueue;
import org.ncibi.mqueue.task.PersistentTaskQueuer2;
import org.ncibi.mqueue.task.TaskQueuer;

import org.ncibi.task.logger.TaskLogger;

import org.restlet.resource.ServerResource;

import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;


public class ChipEnrichResourceModule extends AbstractModule
{
    private final TaskLogger taskLogger;
    private final TaskQueuer<ChipEnrichInputArguments> taskQueuer;
	
    
    public ChipEnrichResourceModule(MessageQueue queue, PersistenceSession persistence, TaskLogger taskLogger)
    {
    	System.out.println("inside ChipEnrichResourceModule calling PersistentTaskQueuer2 ");
    	
        this.taskLogger = taskLogger;
        this.taskQueuer = new PersistentTaskQueuer2<ChipEnrichInputArguments>(queue, persistence);
    }
    
    @Override
    protected void configure()
    {
        bind(ServerResource.class).to(ChipEnrichResource.class);
        bind(TaskLogger.class).toInstance(taskLogger);
        bind(new TypeLiteral<TaskQueuer<ChipEnrichInputArguments>>(){}).toInstance(taskQueuer);
    }
}
