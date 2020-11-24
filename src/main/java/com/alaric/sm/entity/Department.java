package com.alaric.sm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Department
 * @Description TODO 院系实体类
 * @Author Alaric
 * @Date 2020/11/23
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {
    private Integer id;
    private String departmentName;
    private String logo;
}
