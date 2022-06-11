package com.lgkj.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dty
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CallResult<T> {

    private Integer code;

    private String message;

    private T data;

    public CallResult(Integer code, String message ){
        this(code, message, null);
    }
}
