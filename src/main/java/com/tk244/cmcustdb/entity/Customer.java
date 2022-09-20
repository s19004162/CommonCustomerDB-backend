package com.tk244.cmcustdb.entity;

import lombok.Data;

@Data
public class Customer {
    /**
     * ID
     */
    private Long custId;
    /**
     * 名前
     */
    private String custName;
    /**
     * 年齢
     */
    private Integer custAge;
}
