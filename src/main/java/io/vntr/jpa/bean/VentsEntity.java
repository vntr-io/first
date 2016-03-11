package io.vntr.jpa.bean;

import java.io.Serializable;

import java.util.Date;
import javax.persistence.*;
@Entity
@Table(name="vents", schema="public" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="Vents.countAll", query="SELECT COUNT(x) FROM VentsEntity x" )
} )
public class VentsEntity implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @SequenceGenerator(name="vents_id_seq", sequenceName="vents_id_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="vents_id_seq")
    @Column(name="id", nullable=false)
    private Integer id ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="user_id")
    private Integer userId ;

    @Column(name="text", nullable=false, length=255)
    private String text ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="zeit", nullable=false)
    private Date zeit ;


    public VentsEntity ()
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
    //--- DATABASE MAPPING : user_id ( int4 ) 
    public Integer getUserId() { return this.userId; }
    public void setUserId( Integer userId ) { this.userId = userId; }

    //--- DATABASE MAPPING : text ( varchar ) 
    public String getText() { return this.text; }
    public void setText( String text ) { this.text = text; }

    //--- DATABASE MAPPING : zeit ( timestamp ) 
    public Date getZeit() { return this.zeit; }
    public void setZeit( Date zeit ) { this.zeit = zeit; }


    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(userId);
        sb.append("|");
        sb.append(text);
        sb.append("|");
        sb.append(zeit);
        return sb.toString(); 
    } 

}