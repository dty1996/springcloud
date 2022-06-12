package com.lgkj.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dty
 */
@Data
public class Payment implements Serializable {
    /**
     * id
     */
    private Long id;
    /**
     * 流水号
     */
    private String serial;
}
