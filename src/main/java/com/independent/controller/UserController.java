package com.independent.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mark-liu
 */
@RestController
@RequestMapping(value = "/users")
@Api(value = "User API", description = "用户管理接口")
public class UserController {

    @ApiOperation(value = "用户列表查询 #2018-12-29#")
    @RequestMapping(method = RequestMethod.GET)
    public HttpEntity<?> getUserList() {
        return ResponseEntity.ok(null);
    }
}
