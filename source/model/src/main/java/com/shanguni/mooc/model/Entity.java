package com.shanguni.mooc.model;

import java.io.Serializable;

import javax.xml.bind.annotation.*;

/**
 * Simple JavaBean domain object with an id property.
 * Used as a base class for objects needing this property.
 *
 * @author Jianmin Liu
 * @version 1.0 2013/11/27
 */
@XmlRootElement(name = "Entity")
@XmlAccessorType(XmlAccessType.FIELD)
public class Entity implements Serializable, Cloneable
{
    private String sid;

    // UI attribute indicating whether this entity is selected.
    private boolean selected = false;

    /**
     * Default constructor.
     */
    public Entity()
    {
    }

    public String getSid()
    {
        return sid;
    }

    public void setSid(String sid)
    {
        this.sid = sid;
	}

    ////////////////////////////////////////////////////////////////////////////
    // selected
    ////////////////////////////////////////////////////////////////////////////

    public boolean getSelected()
    {
        return selected;
    }

    public void setSelected(boolean selected)
    {
        this.selected = selected;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     */
    public boolean equals(Object another)
    {
        Entity other = (Entity)another;
        return sid.equals(other.getSid());
    }

    /**
     * Returns a hash code value for the object. This method is supported for
     * the benefit of hashtables such as those provided by java.util.Hashtable.
     */
    public int hashCode()
    {
        return getSid().hashCode();
    }
}
