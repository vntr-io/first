
package io.vntr.jpa.bean;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="memberships", schema="public" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="Memberships.countAll", query="SELECT COUNT(x) FROM Memberships x" )
} )
public class MembershipsEntity implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( EMBEDDED IN AN EXTERNAL CLASS )  
    //----------------------------------------------------------------------
	@EmbeddedId
    private MembershipsEntityKey compositePrimaryKey ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    

    public MembershipsEntity ()
    {
		this.compositePrimaryKey = new MembershipsEntityKey();       
    }


    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE COMPOSITE KEY 
    //----------------------------------------------------------------------
    public Integer getUserId() { return this.compositePrimaryKey.getUserId() ; }
    public void setUserId( Integer userId ) { this.compositePrimaryKey.setUserId( userId ) ; }
    public Integer getGroupId() { return this.compositePrimaryKey.getGroupId() ; }
    public void setGroupId( Integer groupId ) { this.compositePrimaryKey.setGroupId( groupId ) ; }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------

    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        if ( compositePrimaryKey != null ) {  
            sb.append(compositePrimaryKey.toString());  
        }  
        else {  
            sb.append( "(null-key)" ); 
        }  
        sb.append("]:"); 
        return sb.toString(); 
    } 

}