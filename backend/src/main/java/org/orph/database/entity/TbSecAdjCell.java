package org.orph.database.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author dylanhz
 * @since 2021-04-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tbSecAdjCell")
@ApiModel(value="TbSecAdjCell对象", description="")
public class TbSecAdjCell implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("S_SECTOR_ID")
    private String sSectorId;

    @TableField("N_SECTOR_ID")
    private String nSectorId;


}
