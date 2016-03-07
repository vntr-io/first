package io.vntr.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
@JsonInclude(Include.NON_NULL)
@ApiModel(value = "VentsJson", description = "Vents details object")
public class VentsJson implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer userId;

    private String text;

    private Date zeit;


    public VentsJson () {}

    public VentsJson (Integer id, Integer userId, String text, Date zeit)
    {
        this.id = id;
        this.userId = userId;
        this.text = text;
        this.zeit = zeit;
    }


    @ApiModelProperty(required = false)
    public Integer getId() { return this.id; }
    public void setId( Integer id ) { this.id = id; }

    @ApiModelProperty(required = false)
    public Integer getUserId() { return this.userId; }
    public void setUserId( Integer userId ) { this.userId = userId; }

    @ApiModelProperty(required = false)
    public String getText() { return this.text; }
    public void setText( String text ) { this.text = text; }

    @ApiModelProperty(required = false)
    public Date getZeit() { return this.zeit; }
    public void setZeit( Date zeit ) { this.zeit = zeit; }
}