package com.coolfun.model;

import java.io.Serializable;
import java.util.Date;

public class ManageAgent implements Serializable {
    private String agentId;

    private Integer publisherCode;

    private Integer taskId;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public Integer getPublisherCode() {
        return publisherCode;
    }

    public void setPublisherCode(Integer publisherCode) {
        this.publisherCode = publisherCode;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", agentId=").append(agentId);
        sb.append(", publisherCode=").append(publisherCode);
        sb.append(", taskId=").append(taskId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}