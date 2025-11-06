package com.coolfun.model;

import java.io.Serializable;

public class InnerTestApp implements Serializable {
    /**
     * id
     *
     * @mbg.generated
     */
    private Integer buildid;

    /**
     * 游戏编号
     *
     * @mbg.generated
     */
    private String gameid;

    /**
     * 渠道编号
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
     * 游戏版本
     *
     * @mbg.generated
     */
    private String version;

    /**
     * 游戏下载链接
     *
     * @mbg.generated
     */
    private String url;

    /**
     * 版本描述内容
     *
     * @mbg.generated
     */
    private String description;

    /**
     * 渠道代码
     *
     * @mbg.generated
     */
    private Integer publishercode;

    /**
     * 包名
     *
     * @mbg.generated
     */
    private String packagename;

    /**
     * 平台
     *
     * @mbg.generated
     */
    private Integer platform;

    /**
     * 应用名称
     *
     * @mbg.generated
     */
    private String applicationname;

    private static final long serialVersionUID = 1L;

    public Integer getBuildid() {
        return buildid;
    }

    public void setBuildid(Integer buildid) {
        this.buildid = buildid;
    }

    public String getGameid() {
        return gameid;
    }

    public void setGameid(String gameid) {
        this.gameid = gameid;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPublishercode() {
        return publishercode;
    }

    public void setPublishercode(Integer publishercode) {
        this.publishercode = publishercode;
    }

    public String getPackagename() {
        return packagename;
    }

    public void setPackagename(String packagename) {
        this.packagename = packagename;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public String getApplicationname() {
        return applicationname;
    }

    public void setApplicationname(String applicationname) {
        this.applicationname = applicationname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", buildid=").append(buildid);
        sb.append(", gameid=").append(gameid);
        sb.append(", publisherid=").append(publisherid);
        sb.append(", publishername=").append(publishername);
        sb.append(", version=").append(version);
        sb.append(", url=").append(url);
        sb.append(", description=").append(description);
        sb.append(", publishercode=").append(publishercode);
        sb.append(", packagename=").append(packagename);
        sb.append(", platform=").append(platform);
        sb.append(", applicationname=").append(applicationname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}