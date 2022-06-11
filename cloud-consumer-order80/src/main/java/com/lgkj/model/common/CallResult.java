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


    public static <T>CallResult<T> success(){
        return new CallResult<>(200, "success", null);
    }
    public static <T>CallResult<T> success(String message, T data){
        return new CallResult<>(200, message, data);
    }
    public static <T>CallResult<T> success(String message){
        return new CallResult<>(200, message, null);
    }
    public static <T>CallResult<T> fail(){
        return new CallResult<>(500, "fail", null);
    }
    public static <T>CallResult<T> fail(String message){
        return new CallResult<>(200, message, null);
    }

}
