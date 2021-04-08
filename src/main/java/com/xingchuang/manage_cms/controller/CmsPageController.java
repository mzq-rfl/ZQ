package com.xingchuang.manage_cms.controller;

import com.xingchuang.api.cms.CmsPageControllerApi;
import com.xingchuang.framework.domain.cms.CmsPage;
import com.xingchuang.framework.domain.cms.request.QueryPageRequest;
import com.xingchuang.framework.domain.cms.response.CmsPageResult;
import com.xingchuang.framework.domain.cms.response.CmsPostPageResult;
import com.xingchuang.framework.model.response.CommonCode;
import com.xingchuang.framework.model.response.QueryResponseResult;
import com.xingchuang.framework.model.response.QueryResult;
import com.xingchuang.framework.model.response.ResponseResult;
import com.xingchuang.manage_cms.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cms/page")
public class CmsPageController implements CmsPageControllerApi {
    @Autowired
    PageService pageService;
    //分页查询所有
    @Override
    @GetMapping("/list/{page}/{size}")
    public QueryResponseResult findList(@PathVariable("page") int page, @PathVariable("size")
            int size, QueryPageRequest queryPageRequest) {
        return pageService.findList(page,size,queryPageRequest);
    }
    //添加页面
    @Override
    @PostMapping("/add")
    public CmsPageResult add(@RequestBody CmsPage cmsPage) {
        return pageService.add(cmsPage);
    }
    //根据ID查询
    @Override
    @GetMapping("/get/{id}")
    public CmsPage findById(@PathVariable("id") String id) {
        return pageService.getById(id);
    }
    //修改页面信息
    @Override
    @PutMapping("/edit/{id}")//这里使用put方法，http 方法中put表示更新
    public CmsPageResult edit(@PathVariable("id") String id, @RequestBody CmsPage cmsPage) {
        return pageService.update(id,cmsPage);
    }
    //根据ID删除页面
    @DeleteMapping("/del/{id}") //使用http的delete方法完成岗位操作
    public ResponseResult delete(@PathVariable("id") String id) {
        return pageService.delete(id);
    }

    @Override
    @PostMapping("/postPage/{pageId}")
    public ResponseResult post(@PathVariable("pageId") String pageId) {
        return pageService.post(pageId);
    }
    @Override
    @PostMapping("/save")
    public CmsPageResult save(@RequestBody CmsPage cmsPage) {
        return pageService.save(cmsPage);
    }
    //课程发布
    @Override
    @PostMapping("/postPageQuick")
    public CmsPostPageResult postPageQuick(@RequestBody CmsPage cmsPage) {
        return pageService.postPageQuick(cmsPage);
    }
}

