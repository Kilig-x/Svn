package com.coolfun.model;

import java.io.Serializable;

public class ConfigData implements Serializable {
    /**
     * 通用配置名称
     *
     * @mbg.generated
     */
    private String configName;

    /**
     * 通用配置内容
     *
     * @mbg.generated
     */
    private String configValue;

    /**
     * 游戏项目(8,9,12)
     *
     * @mbg.generated
     */
    private String version;

    private static final long serialVersionUID = 1L;

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", configName=").append(configName);
        sb.append(", configValue=").append(configValue);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}