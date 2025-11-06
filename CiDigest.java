package com.coolfun.model;

import java.io.Serializable;

public class CiDigest implements Serializable {
    /**
     * 版本库
     *
     * @mbg.generated
     */
    private String repository;

    /**
     * 版本
     *
     * @mbg.generated
     */
    private Integer revision;

    private static final long serialVersionUID = 1L;

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", repository=").append(repository);
        sb.append(", revision=").append(revision);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}