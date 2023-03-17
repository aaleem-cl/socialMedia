package com.clarivate.socialPlatform.pages.address;

import org.apache.tapestry5.alerts.AlertManager;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

import com.clarivate.socialPlatform.entities.Relations;
import com.clarivate.socialPlatform.pages.Index;


public class CreateRelations {
	
	@Property
    private Relations relations;
	 @Inject
	    private AlertManager alertManager;	
		@Inject
	    private Session session;
	    @InjectPage
	    private Index index;
	    
	    @CommitAfter
	    Object onSuccess()
	    {
	    	alertManager.success("Successfully Relation Created");
	        session.persist(relations);

	        return index;
	    }

}
