package com.zking.real.system.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.io.Serializable;

@ToString
public class Dict implements Serializable{
    @JsonProperty("did")
    private Integer id;

    private String rType;
    @JsonProperty("text")
    private String rItem;
    @JsonProperty("id")
    private String rValue;

    private Boolean rIsEditable;

    public Dict(Integer id, String rType, String rItem, String rValue, Boolean rIsEditable) {
        this.id = id;
        this.rType = rType;
        this.rItem = rItem;
        this.rValue = rValue;
        this.rIsEditable = rIsEditable;
    }

    public Dict() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getrType() {
        return rType;
    }

    public void setrType(String rType) {
        this.rType = rType;
    }

    public String getrItem() {
        return rItem;
    }

    public void setrItem(String rItem) {
        this.rItem = rItem;
    }

    public String getrValue() {
        return rValue;
    }

    public void setrValue(String rValue) {
        this.rValue = rValue;
    }

    public Boolean getrIsEditable() {
        return rIsEditable;
    }

    public void setrIsEditable(Boolean rIsEditable) {
        this.rIsEditable = rIsEditable;
    }
}