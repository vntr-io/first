package io.vntr.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(Include.NON_NULL)
@ApiModel(value = "FriendshipsJson", description = "Friendships details object")
public class FriendshipsJson implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer userId1;

    private Integer userId2;


    public FriendshipsJson () {}

    public FriendshipsJson (Integer userId1, Integer userId2)
    {
        this.userId1 = userId1;
        this.userId2 = userId2;
    }


    @ApiModelProperty(required = false)
    public Integer getUserId1() { return this.userId1; }
    public void setUserId1( Integer userId1 ) { this.userId1 = userId1; }

    @ApiModelProperty(required = false)
    public Integer getUserId2() { return this.userId2; }
    public void setUserId2( Integer userId2 ) { this.userId2 = userId2; }
}