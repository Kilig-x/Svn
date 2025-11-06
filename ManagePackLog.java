package com.coolfun.model;

import java.io.Serializable;
import java.util.Date;

public class ManagePackLog implements Serializable {
	
	public boolean isInsert;
	
	public boolean isUpdate;
    /**
     * 打包id
     *
     * @mbg.generated
     */
    private Integer taskId;

    /**
     * 渠道号
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
     * 打包类型   并不准确   历史遗留问题，此处不要拿来用，之前用的暂时用着，并不影响主要流程
     *
     * @mbg.generated
     */
    private Integer packType;

    /**
     * 单个打包状态
     *
     * @mbg.generated
     */
    private Integer packState;

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
     * 打包人id 对应登录的id
     *
     * @mbg.generated
     */
    private String packAccountId;

    private Date stateTime;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 包地址，默认为空
     *
     * @mbg.generated
     */
    private String packUrl;

    private Integer buildState;
    
    private String version;

    private Integer test_state;

    private Integer pack_submit_state;
    
    private Integer build_submit_state;

    private Integer outsourcing_state;
    
    private String agent_id;
    
    private String pack_agent_id;

    private String build_agent_id;
	
	private String app_version;
	
	private Integer retryNumber = 0;
	
	private String startTime;
	
	private String endTime;
    
    //仅做查询中的判断用，并不存入数据库
    private boolean isPack = false;
    
    private boolean isNotSubmit = false;
    
    private String distributor;
    
    private String serverZoneName;

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

    public Integer getPackState() {
        return packState;
    }

    public void setPackState(Integer packState) {
        this.packState = packState;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPackUrl() {
        return packUrl;
    }

    public void setPackUrl(String packUrl) {
        this.packUrl = packUrl;
    }

	public Integer getBuildState() {
		return buildState;
	}

	public void setBuildState(Integer buildState) {
		this.buildState = buildState;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public Integer getTest_state() {
		return test_state;
	}

	public void setTest_state(Integer test_state) {
		this.test_state = test_state;
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

	public String getAgent_id() {
		return agent_id;
	}

	public void setAgent_id(String agent_id) {
		this.agent_id = agent_id;
	}

	public String getPack_agent_id() {
		return pack_agent_id;
	}

	public void setPack_agent_id(String pack_agent_id) {
		this.pack_agent_id = pack_agent_id;
	}

	public String getBuild_agent_id() {
		return build_agent_id;
	}

	public void setBuild_agent_id(String build_agent_id) {
		this.build_agent_id = build_agent_id;
	}

	public boolean isPack() {
		return isPack;
	}

	public void setPack(boolean isPack) {
		this.isPack = isPack;
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

	public boolean isNotSubmit() {
		return isNotSubmit;
	}

	public void setNotSubmit(boolean isNotSubmit) {
		this.isNotSubmit = isNotSubmit;
	}

    public String getApp_version() {
        return app_version;
    }

    public void setApp_version(String app_version) {
        this.app_version = app_version;
    }

	public Integer getRetryNumber() {
		return retryNumber;
	}

	public void setRetryNumber(Integer retryNumber) {
		this.retryNumber = retryNumber;
	}

	public void addRetryNumber() {
		this.retryNumber ++;
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

	public String getDistributor() {
		return distributor;
	}

	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}

	public String getServerZoneName() {
		return serverZoneName;
	}

	public void setServerZoneName(String serverZoneName) {
		this.serverZoneName = serverZoneName;
	}
    
}