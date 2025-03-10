package com.payment_app.Entities;

import java.util.ArrayList;

public class SourceTypes {
	private int sourceId;
    private String sourceTypeCode;
    private String sourceTypeName;
	public SourceTypes() {
		super();
	}
	public SourceTypes(int sourceId, String sourceTypeCode, String sourceTypeName) {
		super();
		this.sourceId = sourceId;
		this.sourceTypeCode = sourceTypeCode;
		this.sourceTypeName = sourceTypeName;
	}
	public int getSourceId() {
		return sourceId;
	}
	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}
	public String getSourceTypeCode() {
		return sourceTypeCode;
	}
	public void setSourceTypeCode(String sourceTypeCode) {
		this.sourceTypeCode = sourceTypeCode;
	}
	public String getSourceTypeName() {
		return sourceTypeName;
	}
	public void setSourceTypeName(String sourceTypeName) {
		this.sourceTypeName = sourceTypeName;
	}
	@Override
	public String toString() {
		return "Source_Types [sourceId=" + sourceId + ", sourceTypeCode=" + sourceTypeCode + ", sourceTypeName="
				+ sourceTypeName + "]";
	}
    
}