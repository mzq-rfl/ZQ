package com.xingchuang.manage_cms.dao;

import com.xingchuang.framework.domain.cms.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CmsSiteRepository extends MongoRepository<CmsSite,String> {

}
