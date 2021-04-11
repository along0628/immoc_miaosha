package com.along.controller;

import com.along.result.Result;
import com.along.result.CodeMsg;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO：
 *      test result code
 * @author wangalong
 * @version：1.0
 * @date 2021/4/11 12:03
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/hello")
    @ResponseBody
    public Result<String> hello(){
        return Result.success("Hello this is success");
    }

    @RequestMapping("/helloError")
    @ResponseBody
    Result<String> helloError(){
        return Result.error(CodeMsg.SERVER_ERROR);
    }

}
