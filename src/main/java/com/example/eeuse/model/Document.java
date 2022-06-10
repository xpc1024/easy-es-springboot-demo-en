package com.example.eeuse.model;

import cn.easyes.annotation.TableName;
import lombok.Data;

/**
 * ES data model
 * we use the lombok(https://github.com/projectlombok/lombok) to generate getter and setter function
 * <p>
 * Copyright © 2021 xpc1024 All Rights Reserved
 **/
@Data
@TableName("document")
public class Document {
    /**
     * just like the primary key in MySQL
     */
    private String id;

    /**
     * title of document
     */
    private String title;
    /**
     * content of document
     */
    private String content;

    /**
     * creator of document
     */
    private String creator;
}
