package com.cpy.generator.meet.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author cpy
 * @since 2019-11-18
 */
@TableName("BASA_TW_MEETING")
public class BasaTwMeeting implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 会议创建者的oid
     */
    private String openid;

    /**
     * 会议标题
     */
    private String title;

    /**
     * 会议内容
     */
    private String content;

    /**
     * 会议地址
     */
    @TableField("meetingPlace")
    private String meetingPlace;

    /**
     * 会议开始时间戳
     */
    @TableField("startDate")
    private Date startDate;

    /**
     * 会议结束时间戳
     */
    @TableField("endDate")
    private Date endDate;

    /**
     * 会议室ID
     */
    @TableField("roomId")
    private String roomId;

    /**
     * 提醒时间(-1:不提醒、0:开始时间提醒、15:开始时间前15分钟提醒、60:开始时间前1小时提醒)
     */
    @TableField("noticeTime")
    private Long noticeTime;

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
     * 会议类型(null:普通会议、sign:线下签到类会议、voice:语音类会议)
     */
    private String type;

    /**
     * 是否需要提交会议纪要(新的体会、总结)(0:否、1:是)
     */
    private Long submitexperience;

    /**
     * 会议状态(0:未完成、1:完成、2:删除)
     */
    private String meetingstatus;

    /**
     * 是否已读(0:未读、1:已读)
     */
    private Long readstatus;

    /**
     * 接受状态(0:未响应、1:不接受、2:接受）
     */
    private Long acceptstatus;

    /**
     * 创建者姓名
     */
    private String personname;

    /**
     * 完成时间戳
     */
    private Date donetime;

    /**
     * 会议创建时间
     */
    private Date  createdate;

    /**
     * 会议室订单ID
     */
    private String roomorderid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace;
    }
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
    public Long getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Long noticeTime) {
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
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public Long getSubmitexperience() {
        return submitexperience;
    }

    public void setSubmitexperience(Long submitexperience) {
        this.submitexperience = submitexperience;
    }
    public String getMeetingstatus() {
        return meetingstatus;
    }

    public void setMeetingstatus(String meetingstatus) {
        this.meetingstatus = meetingstatus;
    }
    public Long getReadstatus() {
        return readstatus;
    }

    public void setReadstatus(Long readstatus) {
        this.readstatus = readstatus;
    }
    public Long getAcceptstatus() {
        return acceptstatus;
    }

    public void setAcceptstatus(Long acceptstatus) {
        this.acceptstatus = acceptstatus;
    }
    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }
    public Date getDonetime() {
        return donetime;
    }

    public void setDonetime(Date donetime) {
        this.donetime = donetime;
    }
    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
    public String getRoomorderid() {
        return roomorderid;
    }

    public void setRoomorderid(String roomorderid) {
        this.roomorderid = roomorderid;
    }

    @Override
    public String toString() {
        return "BasaTwMeeting{" +
            "openid=" + openid +
            ", title=" + title +
            ", content=" + content +
            ", meetingPlace=" + meetingPlace +
            ", startDate=" + startDate +
            ", endDate=" + endDate +
            ", roomId=" + roomId +
            ", noticeTime=" + noticeTime +
            ", topState=" + topState +
            ", actors=" + actors +
            ", type=" + type +
            ", submitexperience=" + submitexperience +
            ", meetingstatus=" + meetingstatus +
            ", readstatus=" + readstatus +
            ", acceptstatus=" + acceptstatus +
            ", personname=" + personname +
            ", donetime=" + donetime +
            ", createdate=" + createdate +
            ", roomorderid=" + roomorderid +
        "}";
    }
}
