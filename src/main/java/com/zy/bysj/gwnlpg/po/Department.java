package com.zy.bysj.gwnlpg.po;

import lombok.Data;

import javax.persistence.Entity;

/**
 * @author zypcid
 * @Title: Department
 * @ProjectName gwnlpg
 * @Description:
 * @date 2019/4/300:00
 */
@Entity
@Data
public class Department {
    private Integer departmentId;
    private String departmentName;
}
