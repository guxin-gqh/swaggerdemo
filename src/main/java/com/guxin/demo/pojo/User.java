package com.guxin.demo.pojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author founder
 */
@ApiModel("用户实体类")
public class User {
    @ApiModelProperty("姓名")
    public String username;
    @ApiModelProperty("密码")
    public String password;
}
