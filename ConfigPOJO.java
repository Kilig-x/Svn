/**
 * @创建者：jun.liao
 * @时间：2024/8/8 17:36
 * @文件：configPOJO.java
 * @版本：1.0
 * @描述：
 */
package com.coolfun.model;

import java.io.Serializable;

public class ConfigPOJO implements Serializable {


    private String dictkey;

    private String dictvalue;

    /**
     * 专区名称
     *
     * @mbg.generated
     */
    private String serverzonename;

    private String isConfVer = "";

    private String isResVer = "";

    private String isScriptVer = "";

    public String getDictkey() {
        return dictkey;
    }

    public void setDictkey(String dictkey) {
        this.dictkey = dictkey;
    }

    public String getDictvalue() {
        return dictvalue;
    }

    public void setDictvalue(String dictvalue) {
        this.dictvalue = dictvalue;
    }

    public String getServerzonename() {
        return serverzonename;
    }

    public void setServerzonename(String serverzonename) {
        this.serverzonename = serverzonename;
    }

    public String getIsConfVer() {
        return isConfVer;
    }

    public void setIsConfVer(String isConfVer) {
        this.isConfVer = isConfVer;
    }

    public String getIsResVer() {
        return isResVer;
    }

    public void setIsResVer(String isResVer) {
        this.isResVer = isResVer;
    }

    public String getIsScriptVer() {
        return isScriptVer;
    }

    public void setIsScriptVer(String isScriptVer) {
        this.isScriptVer = isScriptVer;
    }
}
