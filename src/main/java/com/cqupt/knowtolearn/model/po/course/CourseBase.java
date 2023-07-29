package com.cqupt.knowtolearn.model.po.course;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Ray
 * @date 2023/7/28 22:37
 * @description
 */
@Data
@TableName("course_base")
public class CourseBase implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 机构ID
     */
    private Long companyId;

    /**
     * 机构名称
     */
    private String companyName;

    /**
     * 课程名称
     */
    private String name;

    /**
     * 授课教师
     */
    private String teachers;

    /**
     * 课程标签
     */
    private String tags;

    /**
     * 大分类
     */
    private String mt;

    /**
     * 小分类
     */
    private String st;

    /**
     * 课程等级
     */
    private String grade;

    /**
     * 教育模式(common普通，record 录播，live直播等)
     */
    private String teachMode;

    /**
     * 课程介绍
     */
    private String description;

    /**
     * 课程封面
     */
    private String pic;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createDate;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime changeDate;

    /**
     * 创建人
     */
    private String createPeople;

    /**
     * 更新人
     */
    private String changePeople;

    /**
     * 课程状态
     */
    private Integer status;

    /**
     * 发布时间
     */
    private LocalDateTime publishDate;

}
