package io.vntr.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(Include.NON_NULL)
@ApiModel(value = "UsersJson", description = "Users details object")
public class UsersJson implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String username;

    private String password;

    private String email;


    public UsersJson () {}

    public UsersJson (Integer id, String username, String password, String email)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }


    @ApiModelProperty(required = false)
    public Integer getId() { return this.id; }
    public void setId( Integer id ) { this.id = id; }

    @ApiModelProperty(required = false)
    public String getUsername() { return this.username; }
    public void setUsername( String username ) { this.username = username; }

    @ApiModelProperty(required = false)
    public String getPassword() { return this.password; }
    public void setPassword( String password ) { this.password = password; }

    @ApiModelProperty(required = false)
    public String getEmail() { return this.email; }
    public void setEmail( String email ) { this.email = email; }
}