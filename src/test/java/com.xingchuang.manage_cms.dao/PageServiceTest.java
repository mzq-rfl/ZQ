package com.xingchuang.manage_cms.dao;

import com.xingchuang.manage_cms.service.PageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PageServiceTest {

    @Autowired
    PageService pageService;

    @Test
    public void testGetPageHtml()  {
        String ss=pageService.getPageHtml("604038f41866562cccd341ff");
        System.out.println(ss);
    }
}
