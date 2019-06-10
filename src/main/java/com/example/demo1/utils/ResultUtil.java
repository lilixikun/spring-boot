package com.example.demo1.utils;

import com.example.demo1.domain.Result;

public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(200);
        result.setData(object);
        result.setMessage("成功!");
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result err(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }

}
