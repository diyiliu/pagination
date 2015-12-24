package com.diyiliu.web.dao.base;

import com.diyiliu.plugin.Pagination;

import java.util.List;

/**
 * Description: BaseDao
 * Author: DIYILIU
 * Update: 2015-12-07 16:55
 */
public interface BaseDao {

    /**
     * 保存数据
     *
     * @param entity
     */
    public void addEntity(Object entity);

    /**
     * 删除数据
     *
     * @param entity
     */
    public void deleteByKey(Object entity);

    /**
     * 修改数据
     *
     * @param entity
     */
    public void editEntity(Object entity);

    /**
     * 查询数据
     *
     * @param entity
     * @param <T>
     * @return
     */
    public <T> T findByKey(Object entity);

    /**
     * 批量保存
     *
     * @param list
     */
    public void batchSave(List list);

    /**
     * 分页查询
     *
     * @param entity
     * @return
     */
    public List<?> findByPage(Object entity, Pagination pagination, int offset, int limit);
}
