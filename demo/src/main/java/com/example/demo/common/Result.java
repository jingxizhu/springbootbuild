package com.example.demo.common;

import lombok.Data;

/**
 * Author: JingXi
 * Date:2019/2/21
 * Description:
 */
@Data
public class Result<T> {
    /** 错误码. */
    private Integer code;

    /** 提示信息.*/
    private String msg;

    /** 具体内容. 用泛型来表示*/
    private T data;

    public Result(){
        this.code= 200;
        this.msg = "success";
        this.data = null;
    }
}
