package io.vntr.jpa.bean;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="users", schema="public" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="Users.countAll", query="SELECT COUNT(x) FROM UsersEntity x" )
} )
public class UsersEntity implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @SequenceGenerator(name="users_id_seq", sequenceName="users_id_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="users_id_seq")
    @Column(name="id", nullable=false)
    private Integer id ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="username", nullable=false, length=63)
    private String username ;

    @Column(name="password", nullable=false, length=31)
    private String password ;

    @Column(name="email", nullable=false, length=255)
    private String email ;


    public UsersEntity ()
    {
    }


    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public Integer getId() { return this.id; }
    public void setId( Integer id ) { this.id = id ; }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : username ( varchar ) 
    public String getUsername() { return this.username; }
    public void setUsername( String username ) { this.username = username; }

    //--- DATABASE MAPPING : password ( varchar ) 
    public String getPassword() { return this.password; }
    public void setPassword( String password ) { this.password = password; }

    //--- DATABASE MAPPING : email ( varchar ) 
    public String getEmail() { return this.email; }
    public void setEmail( String email ) { this.email = email; }


    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(username);
        sb.append("|");
        sb.append(password);
        sb.append("|");
        sb.append(email);
        return sb.toString(); 
    } 

}