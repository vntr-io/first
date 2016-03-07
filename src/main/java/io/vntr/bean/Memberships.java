package io.vntr.bean;

import java.io.Serializable;

import javax.validation.constraints.*;

public class Memberships implements Serializable
{
    private static final long serialVersionUID = 1L;

    @NotNull
    private Integer userId;

    @NotNull
    private Integer groupId;


    public Memberships () {}

    public Memberships (Integer userId, Integer groupId)
    {
        this.userId = userId;
        this.groupId = groupId;
    }


    public Integer getUserId() { return this.userId; }
    public void setUserId( Integer userId ) { this.userId = userId; }

    public Integer getGroupId() { return this.groupId; }
    public void setGroupId( Integer groupId ) { this.groupId = groupId; }


    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(userId);
        sb.append("|");
        sb.append(groupId);
        return sb.toString(); 
    } 

}