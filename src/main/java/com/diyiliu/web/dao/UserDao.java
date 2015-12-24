package com.diyiliu.web.dao;

import com.diyiliu.web.dao.base.BaseDao;

import java.util.List;

/**
 * Description: UserDao
 * Author: DIYILIU
 * Update: 2015-12-07 16:55
 */
public interface UserDao extends BaseDao{

    public List findUserByPage(String name);
}
