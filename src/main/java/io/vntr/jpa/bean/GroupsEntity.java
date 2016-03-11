package io.vntr.jpa.bean;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="groups", schema="public" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="Groups.countAll", query="SELECT COUNT(x) FROM GroupsEntity x" )
} )
public class GroupsEntity implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @SequenceGenerator(name="groups_id_seq", sequenceName="groups_id_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="groups_id_seq")
    @Column(name="id", nullable=false)
    private Integer id ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="name", nullable=false, length=63)
    private String name ;

    @Column(name="description", nullable=false, length=255)
    private String description ;

    @Column(name="manager_id")
    private Integer managerId ;


    public GroupsEntity ()
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
    //--- DATABASE MAPPING : name ( varchar ) 
    public String getName() { return this.name; }
    public void setName( String name ) { this.name = name; }

    //--- DATABASE MAPPING : description ( varchar ) 
    public String getDescription() { return this.description; }
    public void setDescription( String description ) { this.description = description; }

    //--- DATABASE MAPPING : manager_id ( int4 ) 
    public Integer getManagerId() { return this.managerId; }
    public void setManagerId( Integer managerId ) { this.managerId = managerId; }


    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(name);
        sb.append("|");
        sb.append(description);
        sb.append("|");
        sb.append(managerId);
        return sb.toString(); 
    } 

}