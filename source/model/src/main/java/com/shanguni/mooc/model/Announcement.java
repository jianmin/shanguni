package com.shanguni.mooc.model;

import java.io.File;
import java.sql.Timestamp;

import javax.xml.bind.annotation.*;

/**
 * Announcement objects provide the information of an Announcement.
 *
 * @author Jianmin Liu
 * @version 1.0 2014/01/11
 */
@XmlRootElement(name = "Announcement")
@XmlAccessorType(XmlAccessType.FIELD)
public class Announcement extends Entity
{
    public static final String COLLECTION_NAME = "announcements";

    public static final String PROP_COURSE_SID    = "course_sid";
    public static final String PROP_TITLE         = "title";
    public static final String PROP_DESCRIPTION   = "description";
    public static final String PROP_CREATION_TIME = "creation_time";

    private String courseSid = null;
    private String title = null;
    private String description = null;
    private String creationTime = null;

    /**
     * Default constructor.
     */
    public Announcement()
    {
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getCreationTime()
    {
        return creationTime;
    }

    public void setCreationTime(String creationTime)
    {
        this.creationTime = creationTime;
    }

    ////////////////////////////////////////////////////////////////////////////
    // courseSid
    ////////////////////////////////////////////////////////////////////////////

    public String getCourseSid()
    {
        return courseSid;
    }

    public void setCourseSid(String courseSid)
    {
        this.courseSid = courseSid;
    }
}
