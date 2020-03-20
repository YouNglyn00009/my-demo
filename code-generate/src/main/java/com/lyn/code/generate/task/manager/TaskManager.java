package com.lyn.code.generate.task.manager;

import com.lyn.code.generate.task.domain.Task;
import com.lyn.common.Page;

import java.util.List;

/**
 * 任务表(Task)表服务实现类
 *
 * @since 2020-03-19 17:49:10
 * @Description
 */
public interface TaskManager {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Task getTask(Long id);

    /**
     * 查询多条数据
     *
     * @param page 分页
     * @param task 查询条件
     */
    List<Task> selectTaskList(Page page, Task task);

    /**
     * 新增数据
     *
     */
    void insertTask(Task task);

    /**
     * 修改数据
     *
     * @param task 实例对象
     */
    void updateTask(Task task);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     */
    void deleteTask(Long id);
}