package io.vntr.jpa.bean;
import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class MembershipsEntityKey implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Column(name="user_id", nullable=false)
    private Integer userId ;
    
    @Column(name="group_id", nullable=false)
    private Integer groupId ;
    

    public MembershipsEntityKey() {}

    public MembershipsEntityKey( Integer userId, Integer groupId )
    {
        this.userId = userId;
        this.groupId = groupId;
    }
    
    public Integer getUserId() { return this.userId; }
    public void setUserId( Integer value ) { this.userId = value; }

    public Integer getGroupId() { return this.groupId; }
    public void setGroupId( Integer value ) { this.groupId = value; }


	public boolean equals(Object obj) { 
		if ( this == obj ) return true ; 
		if ( obj == null ) return false ;
		if ( this.getClass() != obj.getClass() ) return false ; 
		MembershipsEntityKey other = (MembershipsEntityKey) obj; 
		//--- Attribute userId
		if ( userId == null ) { 
			if ( other.userId != null ) 
				return false ; 
		} else if ( ! userId.equals(other.userId) ) 
			return false ; 
		//--- Attribute groupId
		if ( groupId == null ) { 
			if ( other.groupId != null ) 
				return false ; 
		} else if ( ! groupId.equals(other.groupId) ) 
			return false ; 
		return true; 
	} 


	public int hashCode() { 
		final int prime = 31; 
		int result = 1; 
		
		//--- Attribute userId
		result = prime * result + ((userId == null) ? 0 : userId.hashCode() ) ; 
		//--- Attribute groupId
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode() ) ; 
		
		return result; 
	} 


    public String toString() {
		StringBuffer sb = new StringBuffer(); 
		sb.append(userId); 
		sb.append("|"); 
		sb.append(groupId); 
        return sb.toString();
    }
}