package com.xtoon.boot.sys.domain.specification;

import com.xtoon.boot.common.domain.AbstractSpecification;
import com.xtoon.boot.sys.domain.model.permission.Permission;
import com.xtoon.boot.sys.domain.model.permission.PermissionId;
import com.xtoon.boot.sys.domain.model.permission.PermissionRepository;

/**
 * 权限删除Specification
 *
 * @author haoxin
 * @date 2021-02-20
 **/
public class PermissionDeleteSpecification extends AbstractSpecification<PermissionId> {

    private PermissionRepository permissionRepository;

    public PermissionDeleteSpecification(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }

    @Override
    public boolean isSatisfiedBy(PermissionId permissionId) {
        Permission permission = permissionRepository.find(permissionId);
        if(permission.hasSub()) {
            throw new RuntimeException("请先删除子菜单或按钮");
        }
        return true;
    }
}
