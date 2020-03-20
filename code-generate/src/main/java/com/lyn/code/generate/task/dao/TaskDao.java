package com.lyn.code.generate.task.dao;

import com.lyn.code.generate.task.domain.Task;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 任务表(Task)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-19 17:49:10
 */
public interface TaskDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Task getTask(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Task> selectTaskList(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 新增数据
     *
     * @param task 实例对象
     * @return 影响行数
     */
    void insertTask(Task task);

    /**
     * 修改数据
     *
     * @param task 实例对象
     * @return 影响行数
     */
    void updateTask(Task task);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    void deleteTask(Long id);

}