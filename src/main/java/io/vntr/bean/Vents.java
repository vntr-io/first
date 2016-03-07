package io.vntr.bean;

import java.io.Serializable;

import javax.validation.constraints.*;

import java.util.Date;
public class Vents implements Serializable
{
    private static final long serialVersionUID = 1L;

    @NotNull
    private Integer id;


    private Integer userId;

    @NotNull
    @Size( min = 1, max = 255 )
    private String text;

    @NotNull
    private Date zeit;


    public Vents () {}

    public Vents (Integer id, Integer userId, String text, Date zeit)
    {
        this.id = id;
        this.userId = userId;
        this.text = text;
        this.zeit = zeit;
    }


    public Integer getId() { return this.id; }
    public void setId( Integer id ) { this.id = id; }

    public Integer getUserId() { return this.userId; }
    public void setUserId( Integer userId ) { this.userId = userId; }

    public String getText() { return this.text; }
    public void setText( String text ) { this.text = text; }

    public Date getZeit() { return this.zeit; }
    public void setZeit( Date zeit ) { this.zeit = zeit; }


    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(userId);
        sb.append("|");
        sb.append(text);
        sb.append("|");
        sb.append(zeit);
        return sb.toString(); 
    } 

}