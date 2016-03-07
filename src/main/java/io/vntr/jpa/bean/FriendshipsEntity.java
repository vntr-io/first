
package io.vntr.jpa.bean;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="friendships", schema="public" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="Friendships.countAll", query="SELECT COUNT(x) FROM Friendships x" )
} )
public class FriendshipsEntity implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( EMBEDDED IN AN EXTERNAL CLASS )  
    //----------------------------------------------------------------------
	@EmbeddedId
    private FriendshipsEntityKey compositePrimaryKey ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    

    public FriendshipsEntity ()
    {
		this.compositePrimaryKey = new FriendshipsEntityKey();       
    }


    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE COMPOSITE KEY 
    //----------------------------------------------------------------------
    public Integer getUserId1() { return this.compositePrimaryKey.getUserId1() ; }
    public void setUserId1( Integer userId1 ) { this.compositePrimaryKey.setUserId1( userId1 ) ; }
    public Integer getUserId2() { return this.compositePrimaryKey.getUserId2() ; }
    public void setUserId2( Integer userId2 ) { this.compositePrimaryKey.setUserId2( userId2 ) ; }


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