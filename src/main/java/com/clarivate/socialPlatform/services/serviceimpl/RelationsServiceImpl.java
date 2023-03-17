package com.clarivate.socialPlatform.services.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;

import com.clarivate.socialPlatform.entities.Relations;
import com.clarivate.socialPlatform.services.RelationsService;

public class RelationsServiceImpl implements RelationsService {
private List<Relations> relations;

@Inject
private Session session;
	
	@Override
	public List<Relations> getRelations(){
		if (relations == null) {
			refresh();
		}
		return relations;
	}
	
	@Override
	public void refresh() {
		relations = session.createCriteria(Relations.class).list();
	}
	
}

	