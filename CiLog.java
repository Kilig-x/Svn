package com.coolfun.model;

import java.io.Serializable;

public class CiLog implements Serializable {
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
    private String revision;

    /**
     * 提交日志
     *
     * @mbg.generated
     */
    private String message;

    /**
     * 提交人
     *
     * @mbg.generated
     */
    private String author;

    /**
     * 提交日期
     *
     * @mbg.generated
     */
    private String time;

    /**
     * 更改文件路径
     *
     * @mbg.generated
     */
    private String paths;

    private static final long serialVersionUID = 1L;

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPaths() {
        return paths;
    }

    public void setPaths(String paths) {
        this.paths = paths;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", repository=").append(repository);
        sb.append(", revision=").append(revision);
        sb.append(", message=").append(message);
        sb.append(", author=").append(author);
        sb.append(", time=").append(time);
        sb.append(", paths=").append(paths);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}