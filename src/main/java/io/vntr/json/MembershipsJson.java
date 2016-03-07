package io.vntr.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(Include.NON_NULL)
@ApiModel(value = "MembershipsJson", description = "Memberships details object")
public class MembershipsJson implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer groupId;


    public MembershipsJson () {}

    public MembershipsJson (Integer userId, Integer groupId)
    {
        this.userId = userId;
        this.groupId = groupId;
    }


    @ApiModelProperty(required = false)
    public Integer getUserId() { return this.userId; }
    public void setUserId( Integer userId ) { this.userId = userId; }

    @ApiModelProperty(required = false)
    public Integer getGroupId() { return this.groupId; }
    public void setGroupId( Integer groupId ) { this.groupId = groupId; }
}