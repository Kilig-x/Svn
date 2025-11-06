package com.coolfun.model;

import java.io.Serializable;
import java.util.Date;

public class ManageOutconfigLog implements Serializable {
	
	public boolean isInsert;
	
	public boolean isUpdate;
    /**
     * 发布id
     *
     * @mbg.generated
     */
    private Integer outconfigId;

    /**
     * 发布的包
     *
     * @mbg.generated
     */
    private Integer publishercode;

    /**
     * 状态 0默认 1准备发布 2发布中 3成功
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * 版本数据
     *
     * @mbg.generated
     */
    private String versionData;

    /**
     * 项目版本
     */
    private String version;

    private static final long serialVersionUID = 1L;

    public Integer getOutconfigId() {
        return outconfigId;
    }

    public void setOutconfigId(Integer outconfigId) {
        this.outconfigId = outconfigId;
    }

    public Integer getPublishercode() {
        return publishercode;
    }

    public void setPublishercode(Integer publishercode) {
        this.publishercode = publishercode;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", outconfigId=").append(outconfigId);
        sb.append(", publishercode=").append(publishercode);
        sb.append(", state=").append(state);
        sb.append(", createtime=").append(createtime);
        sb.append(", version=").append(version);
        sb.append(", versionData=").append(versionData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}