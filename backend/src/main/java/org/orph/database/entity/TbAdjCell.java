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
@TableName("tbAdjCell")
@ApiModel(value="TbAdjCell对象", description="")
public class TbAdjCell implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("S_SECTOR_ID")
    private String sSectorId;

    @TableField("N_SECTOR_ID")
    private String nSectorId;

    @TableField("S_EARFCN")
    private Integer sEarfcn;

    @TableField("N_EARFCN")
    private Integer nEarfcn;


}
