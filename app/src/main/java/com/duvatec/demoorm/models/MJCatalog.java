package com.duvatec.demoorm.models;

import com.activeandroid.Model;

import com.activeandroid.annotation.Table;
import com.activeandroid.annotation.Column;

@Table(name = "MJCatalog")
public class MJCatalog extends Model {

    @Column(name = "Name")
    public String name;
}
