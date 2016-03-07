package io.vntr.bean;

import java.io.Serializable;

import javax.validation.constraints.*;

public class Users implements Serializable
{
    private static final long serialVersionUID = 1L;

    @NotNull
    private Integer id;

    @NotNull
    @Size( min = 1, max = 63 )
    private String username;

    @NotNull
    @Size( min = 1, max = 31 )
    private String password;

    @NotNull
    @Size( min = 1, max = 255 )
    private String email;


    public Users () {}

    public Users (Integer id, String username, String password, String email)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }


    public Integer getId() { return this.id; }
    public void setId( Integer id ) { this.id = id; }

    public String getUsername() { return this.username; }
    public void setUsername( String username ) { this.username = username; }

    public String getPassword() { return this.password; }
    public void setPassword( String password ) { this.password = password; }

    public String getEmail() { return this.email; }
    public void setEmail( String email ) { this.email = email; }


    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(username);
        sb.append("|");
        sb.append(password);
        sb.append("|");
        sb.append(email);
        return sb.toString(); 
    } 

}