package com.cpy.generator.age.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author cpy
 * @since 2019-11-07
 */
@TableName("BASA_TW_AGENDA")
public class BasaTwAgenda implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日程创建者的oid
     */
    private String openid;

    /**
     * 日程内容
     */
    private String content;

    /**
     * 日程开始时间戳
     */
    @TableField("startDate")
    private LocalDateTime startDate;

    /**
     * 日程结束时间戳
     */
    @TableField("endDate")
    private LocalDateTime endDate;

    /**
     * 提醒时间(-1:不提醒、0:开始时间提醒、15:开始时间前15分钟提醒、60:开始时间前1小时提醒)
     */
    @TableField("noticeTime")
    private Integer noticeTime;

    /**
     * 是否标记为重要(0:否、1:是)
     */
    @TableField("topState")
    private Integer topState;

    /**
     * 协作人oid的集合
     */
    private String actors;

    /**
     * 是否需要提交日程纪要(新的体会、总结)(0:否、1:是)
     */
    @TableField("submitExperience")
    private Integer submitExperience;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }
    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
    public Integer getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Integer noticeTime) {
        this.noticeTime = noticeTime;
    }
    public Integer getTopState() {
        return topState;
    }

    public void setTopState(Integer topState) {
        this.topState = topState;
    }
    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }
    public Integer getSubmitExperience() {
        return submitExperience;
    }

    public void setSubmitExperience(Integer submitExperience) {
        this.submitExperience = submitExperience;
    }

    @Override
    public String toString() {
        return "BasaTwAgenda{" +
            "openid=" + openid +
            ", content=" + content +
            ", startDate=" + startDate +
            ", endDate=" + endDate +
            ", noticeTime=" + noticeTime +
            ", topState=" + topState +
            ", actors=" + actors +
            ", submitExperience=" + submitExperience +
        "}";
    }
}
