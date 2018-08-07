package com.mtx.sell.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
@Api(description =  "测试专用")
public class TestController {

    @Value("${sj.address}")
    private String sjAddress;

    @ApiOperation(value =  "获取会管IP", nickname = "获取会管IP")
    @RequestMapping(value = "/getSjAddress", method = RequestMethod.GET)
    public String get(){
        return getSjAddress();
    }

    public String getSjAddress() {
        return sjAddress;
    }

    public void setSjAddress(String sjAddress) {
        this.sjAddress = sjAddress;
    }
}
