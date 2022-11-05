package com.liujing.learn.learn01.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 学校
 * </p>
 *
 * @author liujing278
 * @since 2022-11-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class School extends Model<School> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 地址
     */
    private String address;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
