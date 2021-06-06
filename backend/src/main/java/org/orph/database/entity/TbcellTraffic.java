package org.orph.database.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
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
@TableName("tbCell_traffic")
@ApiModel(value="TbcellTraffic对象", description="")
public class TbcellTraffic implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("Date")
    private Date Date;

    @TableField("Hour")
    private Integer Hour;

    @TableField("Sector_ID")
    private String sectorId;

    @TableField("Traffic")
    private Float Traffic;


}
