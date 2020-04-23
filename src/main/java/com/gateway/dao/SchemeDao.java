package com.gateway.dao;

import com.gateway.entity.Scheme;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Scheme)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-23 09:53:08
 */
public interface SchemeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Scheme queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Scheme> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param scheme 实例对象
     * @return 对象列表
     */
    List<Scheme> queryAll(Scheme scheme);

    /**
     * 新增数据
     *
     * @param scheme 实例对象
     * @return 影响行数
     */
    int insert(Scheme scheme);

    /**
     * 修改数据
     *
     * @param scheme 实例对象
     * @return 影响行数
     */
    int update(Scheme scheme);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}