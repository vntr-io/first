package io.vntr.bean;

import java.io.Serializable;

import javax.validation.constraints.*;

public class Friendships implements Serializable
{
    private static final long serialVersionUID = 1L;

    @NotNull
    private Integer userId1;

    @NotNull
    private Integer userId2;


    public Friendships () {}

    public Friendships (Integer userId1, Integer userId2)
    {
        this.userId1 = userId1;
        this.userId2 = userId2;
    }


    public Integer getUserId1() { return this.userId1; }
    public void setUserId1( Integer userId1 ) { this.userId1 = userId1; }

    public Integer getUserId2() { return this.userId2; }
    public void setUserId2( Integer userId2 ) { this.userId2 = userId2; }


    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(userId1);
        sb.append("|");
        sb.append(userId2);
        return sb.toString(); 
    } 

}