package com.zy.bysj.gwnlpg.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author zypcid
 * @Title: User
 * @ProjectName gwnlpg
 * @Description:
 * @date 2019/4/2923:47
 */
@Entity
@Data
public class User {
    @Id
    private String userId;
    private String userName;
    private Integer roleId;
    private Integer departmentId;

}
