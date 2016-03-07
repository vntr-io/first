package io.vntr.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(Include.NON_NULL)
@ApiModel(value = "GroupsJson", description = "Groups details object")
public class GroupsJson implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String description;

    private Integer managerId;


    public GroupsJson () {}

    public GroupsJson (Integer id, String name, String description, Integer managerId)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.managerId = managerId;
    }


    @ApiModelProperty(required = false)
    public Integer getId() { return this.id; }
    public void setId( Integer id ) { this.id = id; }

    @ApiModelProperty(required = false)
    public String getName() { return this.name; }
    public void setName( String name ) { this.name = name; }

    @ApiModelProperty(required = false)
    public String getDescription() { return this.description; }
    public void setDescription( String description ) { this.description = description; }

    @ApiModelProperty(required = false)
    public Integer getManagerId() { return this.managerId; }
    public void setManagerId( Integer managerId ) { this.managerId = managerId; }
}