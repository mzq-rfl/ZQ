package com.xingchuang.manage_cms.service;

import com.xingchuang.framework.domain.system.SysDictionary;
import com.xingchuang.manage_cms.dao.SysDictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysDictionaryService {

    @Autowired
    SysDictionaryRepository sysDictionaryRepository;
    //根据字典分类type查询字典信息
    public SysDictionary findDictionaryByType(String type){
        return sysDictionaryRepository.findBydType(type);
    }
}
