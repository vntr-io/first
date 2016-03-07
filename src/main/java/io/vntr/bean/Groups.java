package io.vntr.bean;

import java.io.Serializable;

import javax.validation.constraints.*;

public class Groups implements Serializable
{
    private static final long serialVersionUID = 1L;

    @NotNull
    private Integer id;

    @NotNull
    @Size( min = 1, max = 63 )
    private String name;

    @NotNull
    @Size( min = 1, max = 255 )
    private String description;


    private Integer managerId;


    public Groups () {}

    public Groups (Integer id, String name, String description, Integer managerId)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.managerId = managerId;
    }


    public Integer getId() { return this.id; }
    public void setId( Integer id ) { this.id = id; }

    public String getName() { return this.name; }
    public void setName( String name ) { this.name = name; }

    public String getDescription() { return this.description; }
    public void setDescription( String description ) { this.description = description; }

    public Integer getManagerId() { return this.managerId; }
    public void setManagerId( Integer managerId ) { this.managerId = managerId; }


    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(description);
        sb.append("|");
        sb.append(managerId);
        return sb.toString(); 
    } 

}