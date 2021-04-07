package com.example.knife4j.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(tags = "测试模块")
@RestController
public class IndexController {

    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "姓名",required = true),
            @ApiImplicitParam(name = "age", value = "年龄", required = true)
    })
    @ApiOperation(value = "测试接口")
    @PostMapping("/sayHi")
    public ResponseEntity<String> sayHi(@RequestBody String name, @RequestBody String age){
        return ResponseEntity.ok("Hi:"+name + ",age:" + age);
    }
}
