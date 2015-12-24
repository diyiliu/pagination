package com.diyiliu.web.entity;

import com.diyiliu.annotetion.TableField;
import com.diyiliu.web.entity.base.BaseEntity;
import org.springframework.stereotype.Component;

/**
 * Description: User
 * Author: DIYILIU
 * Update: 2015-11-12 16:13
 */

@Component
@TableField(tableName = "user", primaryKey = "id")
public class User extends BaseEntity {

    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
