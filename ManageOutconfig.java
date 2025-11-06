package com.coolfun.model;

import java.io.Serializable;
import java.util.Date;

public class ManageOutconfig implements Serializable {
	
	public boolean isInsert;
	
	public boolean isUpdate;
    /**
     * 发布id
     *
     * @mbg.generated
     */
    private Integer outconfigId;

    /**
     * 发布内容
     *
     * @mbg.generated
     */
    private String outconfigContent;

    /**
     * 发布的包
     *
     * @mbg.generated
     */
    private String publishercodes;

    /**
     * 发布的专区
     *
     * @mbg.generated
     */
    private String serverzonenames;

    /**
     * 提交人
     *
     * @mbg.generated
     */
    private String outconfigAccountId;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createtime;

    private String version;

    private String versionData;
    
    private Integer state;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    private Integer page;

    private Integer limit;

    private static final long serialVersionUID = 1L;

    public Integer getOutconfigId() {
        return outconfigId;
    }

    public void setOutconfigId(Integer outconfigId) {
        this.outconfigId = outconfigId;
    }

    public String getOutconfigContent() {
        return outconfigContent;
    }

    public void setOutconfigContent(String outconfigContent) {
        this.outconfigContent = outconfigContent;
    }

    public String getPublishercodes() {
        return publishercodes;
    }

    public void setPublishercodes(String publishercodes) {
        this.publishercodes = publishercodes;
    }

    public String getServerzonenames() {
        return serverzonenames;
    }

    public void setServerzonenames(String serverzonenames) {
        this.serverzonenames = serverzonenames;
    }

    public String getOutconfigAccountId() {
        return outconfigAccountId;
    }

    public void setOutconfigAccountId(String outconfigAccountId) {
        this.outconfigAccountId = outconfigAccountId;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersionData() {
        return versionData;
    }

    public void setVersionData(String versionData) {
        this.versionData = versionData;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ManageOutconfig{");
        sb.append("outconfigId=").append(outconfigId);
        sb.append(", outconfigContent='").append(outconfigContent).append('\'');
        sb.append(", publishercodes='").append(publishercodes).append('\'');
        sb.append(", serverzonenames='").append(serverzonenames).append('\'');
        sb.append(", outconfigAccountId='").append(outconfigAccountId).append('\'');
        sb.append(", createtime=").append(createtime);
        sb.append(", version='").append(version).append('\'');
        sb.append(", versionData='").append(versionData).append('\'');
        sb.append(", state=").append(state);
        sb.append(", startTime='").append(startTime).append('\'');
        sb.append(", endTime='").append(endTime).append('\'');
        sb.append(", page=").append(page);
        sb.append(", limit=").append(limit);
        sb.append('}');
        return sb.toString();
    }
}