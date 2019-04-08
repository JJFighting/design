package com.djj.design.test;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("user")
public class User extends Model<User> implements Serializable {


    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;

}
