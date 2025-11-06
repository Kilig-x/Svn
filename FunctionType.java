package com.coolfun.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class FunctionType implements Serializable {

    public boolean isInsert;

    public boolean isUpdate;

    /**
     * 主键
     *
     * @mbg.generated
     */
    private Integer featureId;

    /**
     * 功能名称
     *
     * @mbg.generated
     */
    private String featureName;

    /**
     * 项目
     *
     * @mbg.generated
     */
    private String version;

    /**
     * 创建人员ID 对应登录的ID
     *
     * @mbg.generated
     */
    private String createAccountId;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 状态(0禁用,1启用)
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     * 功能描述
     *
     * @mbg.generated
     */
    private String description;

    private List<TestCases> testCasesList;

    private static final long serialVersionUID = 1L;

    public Integer getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCreateAccountId() {
        return createAccountId;
    }

    public void setCreateAccountId(String createAccountId) {
        this.createAccountId = createAccountId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public List<TestCases> getTestCasesList() {
        return testCasesList;
    }

    public void setTestCasesList(List<TestCases> testCasesList) {
        this.testCasesList = testCasesList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", featureId=").append(featureId);
        sb.append(", featureName=").append(featureName);
        sb.append(", version=").append(version);
        sb.append(", createAccountId=").append(createAccountId);
        sb.append(", createTime=").append(createTime);
        sb.append(", state=").append(state);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}