package io.vntr.jpa.bean;
import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class FriendshipsEntityKey implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Column(name="user_id_1", nullable=false)
    private Integer userId1 ;
    
    @Column(name="user_id_2", nullable=false)
    private Integer userId2 ;
    

    public FriendshipsEntityKey() {}

    public FriendshipsEntityKey( Integer userId1, Integer userId2 )
    {
        this.userId1 = userId1;
        this.userId2 = userId2;
    }
    
    public Integer getUserId1() { return this.userId1; }
    public void setUserId1( Integer value ) { this.userId1 = value; }

    public Integer getUserId2() { return this.userId2; }
    public void setUserId2( Integer value ) { this.userId2 = value; }


	public boolean equals(Object obj) { 
		if ( this == obj ) return true ; 
		if ( obj == null ) return false ;
		if ( this.getClass() != obj.getClass() ) return false ; 
		FriendshipsEntityKey other = (FriendshipsEntityKey) obj; 
		//--- Attribute userId1
		if ( userId1 == null ) { 
			if ( other.userId1 != null ) 
				return false ; 
		} else if ( ! userId1.equals(other.userId1) ) 
			return false ; 
		//--- Attribute userId2
		if ( userId2 == null ) { 
			if ( other.userId2 != null ) 
				return false ; 
		} else if ( ! userId2.equals(other.userId2) ) 
			return false ; 
		return true; 
	} 


	public int hashCode() { 
		final int prime = 31; 
		int result = 1; 
		
		//--- Attribute userId1
		result = prime * result + ((userId1 == null) ? 0 : userId1.hashCode() ) ; 
		//--- Attribute userId2
		result = prime * result + ((userId2 == null) ? 0 : userId2.hashCode() ) ; 
		
		return result; 
	} 


    public String toString() {
		StringBuffer sb = new StringBuffer(); 
		sb.append(userId1); 
		sb.append("|"); 
		sb.append(userId2); 
        return sb.toString();
    }
}