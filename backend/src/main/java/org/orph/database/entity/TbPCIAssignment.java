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
@TableName("tbPCIAssignment")
@ApiModel(value="TbPCIAssignment对象", description="")
public class TbPCIAssignment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ASSIGN_ID")
    private Integer assignId;

    @TableField("EARFCN")
    private Integer earfcn;

    @TableField("SECTOR_ID")
    private String sectorId;

    @TableField("SECTOR_NAME")
    private String sectorName;

    @TableField("ENODEB_ID")
    private Integer enodebId;

    @TableField("PCI")
    private Integer pci;

    @TableField("PSS")
    private Integer pss;

    @TableField("SSS")
    private Integer sss;

    @TableField("LONGITUDE")
    private Float longitude;

    @TableField("LATITUDE")
    private Float latitude;

    @TableField("STYLE")
    private String style;

    @TableField("OPT_DATETIME")
    private Date optDatetime;


}
