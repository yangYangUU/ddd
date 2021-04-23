package com.xtoon.boot.sys.interfaces.facade;

import com.xtoon.boot.sys.domain.repository.UserRepository;
import com.xtoon.boot.sys.facade.SysPermissionServiceFacade;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 权限Facade测试类
 *
 * @author haoxin
 * @date 2021-02-18
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
class SysPermissionServiceFacadeTest {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SysPermissionServiceFacade sysPermissionServiceFacade;

    @Autowired
    private UserRepository userRepository;

    @Test
    void listAllPermission() {
    }

    @Test
    void listAllMenu() {
    }

    @Test
    void getById() {
    }

    @Test
    void saveOrUpdate() {
    }

    @Test
    void delete() {
    }

}