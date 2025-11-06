package com.coolfun.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ManagePackLogPOJO implements Serializable {

    /**
     * 打包id
     *
     * @mbg.generated
     */
    private Integer taskId;

    /**
     * 渠道Code
     *
     * @mbg.generated
     */
    private Integer publishercode;

    /**
     * 渠道ID
     *
     * @mbg.generated
     */
    private Integer publisherid;

    /**
     * 渠道名称
     *
     * @mbg.generated
     */
    private String publishername;

    /**
     * 打包类型
     *
     * @mbg.generated
     */
    private Integer packType;

    /**
     * 打包人id 对应登录的id
     *
     * @mbg.generated
     */
    private String packAccountId;

    /**
     * 打包目的
     *
     * @mbg.generated
     */
    private Integer packPurpose;

    /**
     * 外部需求
     *
     * @mbg.generated
     */
    private String externalDemand;

    /**
     * 自填需求
     *
     * @mbg.generated
     */
    private String ownDemand;

    /**
     * 专区名称
     *
     * @mbg.generated
     */
    private String serverzonename;

    /**
     * 应用名称
     *
     * @mbg.generated
     */
    private String applicationname;

    /**
     * 应用包名
     *
     * @mbg.generated
     */
    private String packagename;

    private String taskType;

    /**
     * 是否是重要渠道
     */
    private Boolean important;

    /**
     * 是否是派生包
     *
     * @mbg.generated
     */
    private Boolean derived;

    private Date stateTime;

    /**
     * 单个打包状态
     *
     * @mbg.generated
     */
    private Integer packState;

    private Integer buildState;

    private Integer test_state;

    private String app_version;

    private Integer pack_submit_state;

    private Integer build_submit_state;

    private Integer outsourcing_state;

    private List<ManagePackLogPOJO> derivedList;


    /**
     * 此次工程svn版本号
     *
     * @mbg.generated
     */
    private String scriptVersion;

    /**
     * 此次包svn版本号
     *
     * @mbg.generated
     */
    private String resVersion;

    /**
     * 此次sdk的svn版本号
     *
     * @mbg.generated
     */
    private String sdkVersion;

    /**
     * 母包编号
     *
     * @mbg.generated
     */
    private Integer parentpublisherid;

    /**
     * 打包次数
     */
    private Integer packCount;

    /**
     * 打包成功次数
     */
    private Integer packSuccessCount;

    /**
     * 打包成功率
     */
    private BigDecimal packSuccessRate;

    /**
     * 测试任务数
     */
    private Integer taskCount;

    /**
     * 测试次数
     */
    private Integer testCount;

    /**
     * 测试成功率
     */
    private Integer testSuccessCount;

    /**
     * 测试覆盖率
     */
    private BigDecimal testSuccessRate;

    /**
     * 用例总数
     */
    private Integer caseCount;

    /**
     * 已选择用例数
     */
    private Integer choiceCaseCount;

    /**
     * 用例执行数
     */
    private Integer implementCount;

    /**
     * 测试覆盖率
     */
    private BigDecimal testCoverRate;

    //仅做查询中的判断用，并不存入数据库
    private boolean isPack = false;

    private Integer page;

    private Integer limit;
    private static final long serialVersionUID = 1L;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getPublishercode() {
        return publishercode;
    }

    public void setPublishercode(Integer publishercode) {
        this.publishercode = publishercode;
    }

    public Integer getPublisherid() {
        return publisherid;
    }

    public void setPublisherid(Integer publisherid) {
        this.publisherid = publisherid;
    }

    public String getPublishername() {
        return publishername;
    }

    public void setPublishername(String publishername) {
        this.publishername = publishername;
    }

    public Integer getPackType() {
        return packType;
    }

    public void setPackType(Integer packType) {
        this.packType = packType;
    }

    public String getPackAccountId() {
        return packAccountId;
    }

    public void setPackAccountId(String packAccountId) {
        this.packAccountId = packAccountId;
    }

    public Date getStateTime() {
        return stateTime;
    }

    public void setStateTime(Date stateTime) {
        this.stateTime = stateTime;
    }

    public Integer getTest_state() {
        return test_state;
    }

    public void setTest_state(Integer test_state) {
        this.test_state = test_state;
    }

    public String getApp_version() {
        return app_version;
    }

    public void setApp_version(String app_version) {
        this.app_version = app_version;
    }

    public Integer getPackPurpose() {
        return packPurpose;
    }

    public void setPackPurpose(Integer packPurpose) {
        this.packPurpose = packPurpose;
    }

    public String getExternalDemand() {
        return externalDemand;
    }

    public void setExternalDemand(String externalDemand) {
        this.externalDemand = externalDemand;
    }

    public String getOwnDemand() {
        return ownDemand;
    }

    public void setOwnDemand(String ownDemand) {
        this.ownDemand = ownDemand;
    }

    public String getServerzonename() {
        return serverzonename;
    }

    public void setServerzonename(String serverzonename) {
        this.serverzonename = serverzonename;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public Boolean getImportant() {
        return important;
    }

    public void setImportant(Boolean important) {
        this.important = important;
    }

    public Boolean getDerived() {
        return derived;
    }

    public void setDerived(Boolean derived) {
        this.derived = derived;
    }

    public String getApplicationname() {
        return applicationname;
    }

    public void setApplicationname(String applicationname) {
        this.applicationname = applicationname;
    }

    public String getPackagename() {
        return packagename;
    }

    public void setPackagename(String packagename) {
        this.packagename = packagename;
    }

    public List<ManagePackLogPOJO> getDerivedList() {
        return derivedList;
    }

    public void setDerivedList(List<ManagePackLogPOJO> derivedList) {
        this.derivedList = derivedList;
    }

    public Integer getParentpublisherid() {
        return parentpublisherid;
    }

    public void setParentpublisherid(Integer parentpublisherid) {
        this.parentpublisherid = parentpublisherid;
    }

    public Integer getPackState() {
        return packState;
    }

    public void setPackState(Integer packState) {
        this.packState = packState;
    }

    public Integer getBuildState() {
        return buildState;
    }

    public void setBuildState(Integer buildState) {
        this.buildState = buildState;
    }

    public Integer getPack_submit_state() {
        return pack_submit_state;
    }

    public void setPack_submit_state(Integer pack_submit_state) {
        this.pack_submit_state = pack_submit_state;
    }

    public Integer getBuild_submit_state() {
        return build_submit_state;
    }

    public void setBuild_submit_state(Integer build_submit_state) {
        this.build_submit_state = build_submit_state;
    }

    public Integer getOutsourcing_state() {
        return outsourcing_state;
    }

    public void setOutsourcing_state(Integer outsourcing_state) {
        this.outsourcing_state = outsourcing_state;
    }

    public String getScriptVersion() {
        return scriptVersion;
    }

    public void setScriptVersion(String scriptVersion) {
        this.scriptVersion = scriptVersion;
    }

    public String getResVersion() {
        return resVersion;
    }

    public void setResVersion(String resVersion) {
        this.resVersion = resVersion;
    }

    public String getSdkVersion() {
        return sdkVersion;
    }

    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public Integer getPackCount() {
        return packCount;
    }

    public void setPackCount(Integer packCount) {
        this.packCount = packCount;
    }

    public Integer getPackSuccessCount() {
        return packSuccessCount;
    }

    public void setPackSuccessCount(Integer packSuccessCount) {
        this.packSuccessCount = packSuccessCount;
    }

    public BigDecimal getPackSuccessRate() {
        return packSuccessRate;
    }

    public void setPackSuccessRate(BigDecimal packSuccessRate) {
        this.packSuccessRate = packSuccessRate;
    }

    public Integer getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }

    public Integer getTestCount() {
        return testCount;
    }

    public void setTestCount(Integer testCount) {
        this.testCount = testCount;
    }

    public Integer getTestSuccessCount() {
        return testSuccessCount;
    }

    public void setTestSuccessCount(Integer testSuccessCount) {
        this.testSuccessCount = testSuccessCount;
    }

    public BigDecimal getTestSuccessRate() {
        return testSuccessRate;
    }

    public void setTestSuccessRate(BigDecimal testSuccessRate) {
        this.testSuccessRate = testSuccessRate;
    }

    public Integer getCaseCount() {
        return caseCount;
    }

    public void setCaseCount(Integer caseCount) {
        this.caseCount = caseCount;
    }

    public Integer getChoiceCaseCount() {
        return choiceCaseCount;
    }

    public void setChoiceCaseCount(Integer choiceCaseCount) {
        this.choiceCaseCount = choiceCaseCount;
    }

    public Integer getImplementCount() {
        return implementCount;
    }

    public void setImplementCount(Integer implementCount) {
        this.implementCount = implementCount;
    }

    public BigDecimal getTestCoverRate() {
        return testCoverRate;
    }

    public void setTestCoverRate(BigDecimal testCoverRate) {
        this.testCoverRate = testCoverRate;
    }

    public boolean isPack() {
        return isPack;
    }

    public void setPack(boolean pack) {
        isPack = pack;
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
}