package com.lyn.code.generate.task.service.impl;

import com.lyn.code.generate.task.domain.Task;
import com.lyn.code.generate.task.manager.TaskManager;
import com.lyn.code.generate.task.service.TaskService;
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
@Service("taskService")
public class TaskServiceImpl implements TaskService {

    @Resource
    private TaskManager taskManager;

    @Override
    public Task getTask(Long id) {
        return this.taskManager.getTask(id);
    }

    @Override
    public List<Task> selectTaskList(Page page, Task task) {
        return this.taskManager.selectTaskList(page, task);
    }

    @Override
    public void insertTask(Task task) {
        this.taskManager.insertTask(task);
    }

    @Override
    public void updateTask(Task task) {
        this.taskManager.updateTask(task);
    }

    @Override
    public void deleteTask(Long id) {
        this.taskManager.deleteTask(id);
    }
}