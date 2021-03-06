package com.ironyard.entities;

import javax.persistence.*;

/**
 * Created by jeffryporter on 7/7/16.
 */

@Entity
@Table(name = "band_managers")
public class User
{
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String password;

    String avatar;

    public User()
    {
    }

    public User(String name, String password, String avatar)
    {
        this.name = name;
        this.password = password;
        this.avatar = avatar;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getAvatar()
    {
        return avatar;
    }

    public void setAvatar(String avatar)
    {
        this.avatar = avatar;
    }
}
