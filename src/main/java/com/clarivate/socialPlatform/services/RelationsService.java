package com.clarivate.socialPlatform.services;

import java.util.List;

import com.clarivate.socialPlatform.entities.Relations;

public interface RelationsService {

	List<Relations> getRelations();
	void refresh();
}
