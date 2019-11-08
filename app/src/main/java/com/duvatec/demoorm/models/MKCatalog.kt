package com.duvatec.demoorm.models

import com.activeandroid.Model
import com.activeandroid.annotation.Table
import com.activeandroid.annotation.Column


@Table(name = "MKCatalog")
class MKCatalog: Model() {

    @Column(name = "Name")
    var name: String? = null
}