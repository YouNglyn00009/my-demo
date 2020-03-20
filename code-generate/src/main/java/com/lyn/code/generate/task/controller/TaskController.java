package com.lyn.code.generate.task.controller;

import com.lyn.code.generate.task.domain.Task;
import com.lyn.code.generate.task.service.TaskService;
import com.lyn.common.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 任务表(Task)表控制层
 *
 * @author makejava
 * @since 2020-03-19 17:49:10
 */
@RestController
@RequestMapping("task")
public class TaskController {

    @Resource
    private TaskService taskService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     */
    @GetMapping("getTask")
    public Task getTask(Long id) {
        return taskService.getTask(id);
    }
    
    /**
     * 批量查询，分页
     *
     */
    @GetMapping("selectTaskList")
    public List<Task> selectTaskList(Page page, Task task) {
        return taskService.selectTaskList(page, task);
    }

}