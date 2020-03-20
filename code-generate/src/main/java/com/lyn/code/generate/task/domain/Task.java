package com.lyn.code.generate.task.domain;

/**
 * 任务表(Task)实体类
 *
 * @author hd
 * @since 2020-03-19 17:49:10
 */
import java.io.Serializable;
import lombok.Data;
 
@Data
public class Task implements Serializable {

    private static final long serialVersionUID = -54181133671983685L;

    /**
	 * 主键
	 */ 
    private Long id;

    /**
	 * 业务号
	 */ 
    private String bizNo;

    /**
	 * 业务类型
	 */ 
    private String bizType;

    /**
	 * 状态
	 */ 
    private Integer stauts;

    /**
	 * 创建时间
	 */ 
    private Date createTime;

    /**
	 * 修改时间
	 */ 
    private Date updateTime;

    /**
	 * 创建人
	 */ 
    private String createUser;

    /**
	 * 修改人
	 */ 
    private String updateUser;

    /**
	 * 时间戳
	 */ 
    private Timestamp ts;

    /**
	 * 删除标识
	 */ 
    private Byte yn;

}