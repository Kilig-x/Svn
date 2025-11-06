package com.coolfun.model;

import org.assertj.core.util.Lists;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ManageTask implements Serializable {
	
	public boolean isInsert;
	
	public boolean isUpdate;
	
	/**
	 * 任务id
	 *
	 * @mbg.generated
	 */
	private Integer taskId;

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
	 * 打包名称
	 *
	 * @mbg.generated
	 */
	private String packName;

	/**
	 * logo验证状态
	 *
	 * @mbg.generated
	 */
	private Integer logoState;

	/**
	 * 封面验证状态
	 *
	 * @mbg.generated
	 */
	private Integer coverState;

	/**
	 * 自检状态
	 *
	 * @mbg.generated
	 */
	private Integer selfTest;

	/**
	 * 创建时间
	 *
	 * @mbg.generated
	 */
	private Date createTime;

	/**
	 * 打包状态 0未打包  1:准备打包 2:调用打包 3:打包成功
	 *
	 * @mbg.generated
	 */
	private Integer state;
	
	private Integer notState;
	
	private String packType;
	
	private String pack_account_id;

	/**
	 * 打包状态
	 *
	 * @mbg.generated
	 */
	private List<Publisher> publishers;
	
	private Integer page;
	
	private Integer limit;
	
	private String buildType;
	
	private String version;
    
    private String submit_num;
    
    private Integer submit_state;

	// 其他地方不用 publishercode=0 特殊处理 避免报错
	private Integer publishercode = 0;

	private Integer packCount;

	private Integer successCount;

	private Integer failCount;
    
    private String pack_num;

	/**
	 * 开始时间
	 */
	private String startTime;

	/**
	 * 结束时间
	 */
	private String endTime;
	
	private String app_version;

    private List<Publisher> selectedRowsData = Lists.newArrayList();

	private static final long serialVersionUID = 1L;

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
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

	public String getPackName() {
		return packName;
	}

	public void setPackName(String packName) {
		this.packName = packName;
	}

	public Integer getLogoState() {
		return logoState;
	}

	public void setLogoState(Integer logoState) {
		this.logoState = logoState;
	}

	public Integer getCoverState() {
		return coverState;
	}

	public void setCoverState(Integer coverState) {
		this.coverState = coverState;
	}

	public Integer getSelfTest() {
		return selfTest;
	}

	public void setSelfTest(Integer selfTest) {
		this.selfTest = selfTest;
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

	public List<Publisher> getPublishers() {
		return publishers;
	}

	public void setPublishers(List<Publisher> publishers) {
		this.publishers = publishers;
	}

	public String getPackType() {
		return packType;
	}

	public void setPackType(String packType) {
		this.packType = packType;
	}

	public String getPack_account_id() {
		return pack_account_id;
	}

	public void setPack_account_id(String pack_account_id) {
		this.pack_account_id = pack_account_id;
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

	public String getBuildType() {
		return buildType;
	}

	public void setBuildType(String buildType) {
		this.buildType = buildType;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSubmit_num() {
		return submit_num;
	}

	public void setSubmit_num(String submit_num) {
		this.submit_num = submit_num;
	}
	
	public Integer getSubmit_state() {
		return submit_state;
	}

	public void setSubmit_state(Integer submit_state) {
		this.submit_state = submit_state;
	}
	
	public Integer getNotState() {
		return notState;
	}

	public void setNotState(Integer notState) {
		this.notState = notState;
	}

	public Integer getPublishercode() {
		return publishercode;
	}

	public void setPublishercode(Integer publishercode) {
		this.publishercode = publishercode;
	}

	public Integer getPackCount() {
		return packCount;
	}

	public void setPackCount(Integer packCount) {
		this.packCount = packCount;
	}

	public Integer getSuccessCount() {
		return successCount;
	}

	public void setSuccessCount(Integer successCount) {
		this.successCount = successCount;
	}

	public Integer getFailCount() {
		return failCount;
	}

	public void setFailCount(Integer failCount) {
		this.failCount = failCount;
	}

	public List<Publisher> getSelectedRowsData() {
		return selectedRowsData;
	}

	public void setSelectedRowsData(List<Publisher> selectedRowsData) {
		this.selectedRowsData = selectedRowsData;
	}

	public String getPack_num() {
		return pack_num;
	}

	public void setPack_num(String pack_num) {
		this.pack_num = pack_num;
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

	public String getApp_version() {
		return app_version;
	}

	public void setApp_version(String app_version) {
		this.app_version = app_version;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", taskId=").append(taskId);
		sb.append(", packPurpose=").append(packPurpose);
		sb.append(", externalDemand=").append(externalDemand);
		sb.append(", ownDemand=").append(ownDemand);
		sb.append(", packName=").append(packName);
		sb.append(", logoState=").append(logoState);
		sb.append(", coverState=").append(coverState);
		sb.append(", selfTest=").append(selfTest);
		sb.append(", createTime=").append(createTime);
		sb.append(", state=").append(state);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}