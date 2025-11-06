package com.coolfun.model;

import java.io.Serializable;
import java.util.Date;

public class CiPublisherConfig implements Serializable {
    /**
     * 游戏编号
     *
     * @mbg.generated
     */
    private String gameid;

    /**
     * 渠道代码
     *
     * @mbg.generated
     */
    private Integer publishercode;

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
     * 渠道名称
     *
     * @mbg.generated
     */
    private String platform;

    /**
     * 最新版本号
     *
     * @mbg.generated
     */
    private String lastest;

    /**
     * 支持的最小版本号(低于此版本强制更新)
     *
     * @mbg.generated
     */
    private String min;

    /**
     * 版本更新提示内容
     *
     * @mbg.generated
     */
    private String msg;

    /**
     * 应用更新方式(1-Web方式 谷歌/IOS需要使用这种 2-增量更新)(增量更新失败后按全包更新)
     *
     * @mbg.generated
     */
    private Integer updatetype;

    /**
     * 版本更新下载地址
     *
     * @mbg.generated
     */
    private String appurlv2;

    /**
     * 配置版本
     *
     * @mbg.generated
     */
    private String confver;

    /**
     * 更新配置的Hash(为MD5值)
     *
     * @mbg.generated
     */
    private String confhash;

    /**
     * 配置下载地址
     *
     * @mbg.generated
     */
    private String configurlv2;

    /**
     * 资源版本(AssetBundle)
     *
     * @mbg.generated
     */
    private String resver;

    /**
     * 更新资源的Hash(为MD5值)
     *
     * @mbg.generated
     */
    private String reshash;

    /**
     * 资源更新下载地址
     *
     * @mbg.generated
     */
    private String resurlv2;

    /**
     * 脚本更新版本
     *
     * @mbg.generated
     */
    private String scriptver;

    /**
     * 脚本Hash(为MD5值)
     *
     * @mbg.generated
     */
    private String scripthash;

    /**
     * 脚本更新地址
     *
     * @mbg.generated
     */
    private String scripturlv2;

    /**
     * 登录界面版本[0-老版本 1-新版登录界面]
     *
     * @mbg.generated
     */
    private Integer loginsceneversion;

    /**
     * 加密扩展信息
     *
     * @mbg.generated
     */
    private String extrainfo;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public String getGameid() {
        return gameid;
    }

    public void setGameid(String gameid) {
        this.gameid = gameid;
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

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getLastest() {
        return lastest;
    }

    public void setLastest(String lastest) {
        this.lastest = lastest;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getUpdatetype() {
        return updatetype;
    }

    public void setUpdatetype(Integer updatetype) {
        this.updatetype = updatetype;
    }

    public String getAppurlv2() {
        return appurlv2;
    }

    public void setAppurlv2(String appurlv2) {
        this.appurlv2 = appurlv2;
    }

    public String getConfver() {
        return confver;
    }

    public void setConfver(String confver) {
        this.confver = confver;
    }

    public String getConfhash() {
        return confhash;
    }

    public void setConfhash(String confhash) {
        this.confhash = confhash;
    }

    public String getConfigurlv2() {
        return configurlv2;
    }

    public void setConfigurlv2(String configurlv2) {
        this.configurlv2 = configurlv2;
    }

    public String getResver() {
        return resver;
    }

    public void setResver(String resver) {
        this.resver = resver;
    }

    public String getReshash() {
        return reshash;
    }

    public void setReshash(String reshash) {
        this.reshash = reshash;
    }

    public String getResurlv2() {
        return resurlv2;
    }

    public void setResurlv2(String resurlv2) {
        this.resurlv2 = resurlv2;
    }

    public String getScriptver() {
        return scriptver;
    }

    public void setScriptver(String scriptver) {
        this.scriptver = scriptver;
    }

    public String getScripthash() {
        return scripthash;
    }

    public void setScripthash(String scripthash) {
        this.scripthash = scripthash;
    }

    public String getScripturlv2() {
        return scripturlv2;
    }

    public void setScripturlv2(String scripturlv2) {
        this.scripturlv2 = scripturlv2;
    }

    public Integer getLoginsceneversion() {
        return loginsceneversion;
    }

    public void setLoginsceneversion(Integer loginsceneversion) {
        this.loginsceneversion = loginsceneversion;
    }

    public String getExtrainfo() {
        return extrainfo;
    }

    public void setExtrainfo(String extrainfo) {
        this.extrainfo = extrainfo;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gameid=").append(gameid);
        sb.append(", publishercode=").append(publishercode);
        sb.append(", publisherid=").append(publisherid);
        sb.append(", publishername=").append(publishername);
        sb.append(", platform=").append(platform);
        sb.append(", lastest=").append(lastest);
        sb.append(", min=").append(min);
        sb.append(", msg=").append(msg);
        sb.append(", updatetype=").append(updatetype);
        sb.append(", appurlv2=").append(appurlv2);
        sb.append(", confver=").append(confver);
        sb.append(", confhash=").append(confhash);
        sb.append(", configurlv2=").append(configurlv2);
        sb.append(", resver=").append(resver);
        sb.append(", reshash=").append(reshash);
        sb.append(", resurlv2=").append(resurlv2);
        sb.append(", scriptver=").append(scriptver);
        sb.append(", scripthash=").append(scripthash);
        sb.append(", scripturlv2=").append(scripturlv2);
        sb.append(", loginsceneversion=").append(loginsceneversion);
        sb.append(", extrainfo=").append(extrainfo);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}