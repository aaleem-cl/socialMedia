package com.clarivate.socialPlatform.pages.address;

import java.util.List;

import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

import com.clarivate.socialPlatform.entities.Relations;
import com.clarivate.socialPlatform.services.RelationsService;
import com.google.j2objc.annotations.Property;




public class ViewRelations {
	@Property
	private Relations relations;
	@Inject
	private RelationsService relationsService;
	@Inject
	private Session session;
	public List<Relations> getRelations(){
		return relationsService.getRelations();
	}
	
	
	
	//@Inject
//	private Relations relations;
//	public List<Relations> getRelations{
//		
//		return session.createCriteria(Relations.class).list();
//	}
//	

}
