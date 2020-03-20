package com.lyn.code.generate.task.manager.impl;

import com.lyn.code.generate.task.domain.Task;
import com.lyn.code.generate.task.manager.TaskManager;
import com.lyn.code.generate.task.dao.TaskDao;
import com.lyn.common.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 任务表(Task)表服务实现类
 *
 * @author makejava
 * @since 2020-03-19 17:49:10
 */
@Service
public class TaskManagerImpl implements TaskManager {

    @Resource
    private TaskDao taskDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     */
    @Override
    public Task getTask(Long id) {
        return this.taskDao.getTask(id);
    }

    /**
     * 查询多条数据
     *
     */
    @Override
    public List<Task> selectTaskList(Page page, Task task) {
        return this.taskDao.selectTaskList(task);
    }

    /**
     * 新增数据
     *
     */
    @Override
    public void insertTask(Task task) {
        this.taskDao.insertTask(task);
    }

    /**
     * 修改数据
     *
     */
    @Override
    public void updateTask(Task task) {
        this.taskDao.updateTask(task);
    }

    /**
     * 通过主键删除数据
     *
     */
    @Override
    public void deleteTask(Long id) {
        this.taskDao.deleteTask(id);
    }
}