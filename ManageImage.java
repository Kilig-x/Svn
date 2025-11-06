package com.coolfun.model;

import java.io.Serializable;

public class ManageImage implements Serializable {
    private Integer id;

    private Integer publisherCode;

    /**
     * Logo名称
     *
     * @mbg.generated
     */
    private String logoName;

    /**
     * LogoMD5
     *
     * @mbg.generated
     */
    private String logoMd5;

    /**
     * 封面图片MD5
     *
     * @mbg.generated
     */
    private String coverMd5;

    /**
     * 过场图片MD5
     *
     * @mbg.generated
     */
    private String transitionMd5;

    /**
     * LogoBase64
     *
     * @mbg.generated
     */
    private String logoBase64;

    /**
     * 封面图片Base64
     *
     * @mbg.generated
     */
    private String coverBase64;

    /**
     * 过场图片Base64
     *
     * @mbg.generated
     */
    private String transitionBase64;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPublisherCode() {
        return publisherCode;
    }

    public void setPublisherCode(Integer publisherCode) {
        this.publisherCode = publisherCode;
    }

    public String getLogoName() {
        return logoName;
    }

    public void setLogoName(String logoName) {
        this.logoName = logoName;
    }

    public String getLogoMd5() {
        return logoMd5;
    }

    public void setLogoMd5(String logoMd5) {
        this.logoMd5 = logoMd5;
    }

    public String getCoverMd5() {
        return coverMd5;
    }

    public void setCoverMd5(String coverMd5) {
        this.coverMd5 = coverMd5;
    }

    public String getTransitionMd5() {
        return transitionMd5;
    }

    public void setTransitionMd5(String transitionMd5) {
        this.transitionMd5 = transitionMd5;
    }

    public String getLogoBase64() {
        return logoBase64;
    }

    public void setLogoBase64(String logoBase64) {
        this.logoBase64 = logoBase64;
    }

    public String getCoverBase64() {
        return coverBase64;
    }

    public void setCoverBase64(String coverBase64) {
        this.coverBase64 = coverBase64;
    }

    public String getTransitionBase64() {
        return transitionBase64;
    }

    public void setTransitionBase64(String transitionBase64) {
        this.transitionBase64 = transitionBase64;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", publisherCode=").append(publisherCode);
        sb.append(", logoName=").append(logoName);
        sb.append(", logoMd5=").append(logoMd5);
        sb.append(", coverMd5=").append(coverMd5);
        sb.append(", transitionMd5=").append(transitionMd5);
        sb.append(", logoBase64=").append(logoBase64);
        sb.append(", coverBase64=").append(coverBase64);
        sb.append(", transitionBase64=").append(transitionBase64);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}