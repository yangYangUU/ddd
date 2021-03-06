package com.xtoon.boot.sys.domain.model.role;

import com.xtoon.boot.sys.domain.model.role.RoleCode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * RoleCodeTest
 *
 * @author haoxin
 * @date 2021-02-25
 **/
class RoleCodeTest {

    @Test
    void sameValueAs() {
        assertThrows(IllegalArgumentException.class, () -> {
            new RoleCode("你");
        });
        assertThat(new RoleCode("5252com").sameValueAs(new RoleCode("5252com"))).isTrue();
        assertThat(new RoleCode("5252com").sameValueAs(new RoleCode("5252co1"))).isFalse();
    }
}