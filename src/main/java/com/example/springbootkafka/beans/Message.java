package com.example.springbootkafka.beans;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author xiejiqing
 * @description
 * @create 2019/10/18 15:14
 */
@Data
public class Message implements Serializable {

    private Long id;    //id

    private String msg; //消息

    private Date sendTime;  //时间戳

}