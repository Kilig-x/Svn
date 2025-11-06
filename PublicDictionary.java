package com.coolfun.model;

import java.io.Serializable;

public class PublicDictionary implements Serializable {
	
	public boolean isInsertChannel = false;
	public boolean isInsertAndroid = false;
	public boolean isInsertCurrency = false;

	public boolean isUpdateChannel = false;
	public boolean isUpdateAndroid = false;
	public boolean isUpdateCurrency = false;
	
    private Integer id;

    private String dictkey;

    private String dictvalue;

    private String type;

    private String extendContent;
    
    private String cfversion;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExtendContent() {
        return extendContent;
    }

    public void setExtendContent(String extendContent) {
        this.extendContent = extendContent;
    }

    public String getCfversion() {
		return cfversion;
	}

	public void setCfversion(String cfversion) {
		this.cfversion = cfversion;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dictkey=").append(dictkey);
        sb.append(", dictvalue=").append(dictvalue);
        sb.append(", type=").append(type);
        sb.append(", extendContent=").append(extendContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}