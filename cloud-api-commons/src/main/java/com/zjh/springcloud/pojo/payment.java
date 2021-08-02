package com.zjh.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther zheng jianghai
 * @create 2021-06-24 14:29
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class payment {

    private Long id;
    private String serial;
}
