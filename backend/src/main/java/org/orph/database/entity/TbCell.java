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
@TableName("tbCell")
@ApiModel(value="TbCell对象", description="")
public class TbCell implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("CITY")
    private String city;

    @TableId(value = "SECTOR_ID", type = IdType.ID_WORKER_STR)
    private String sectorId;

    @TableField("SECTOR_NAME")
    private String sectorName;

    @TableField("ENODEBID")
    private Integer enodebid;

    @TableField("ENODEB_NAME")
    private String enodebName;

    @TableField("EARFCN")
    private Integer earfcn;

    @TableField("PCI")
    private Integer pci;

    @TableField("PSS")
    private Integer pss;

    @TableField("SSS")
    private Integer sss;

    @TableField("TAC")
    private Integer tac;

    @TableField("VENDOR")
    private String vendor;

    @TableField("LONGITUDE")
    private Float longitude;

    @TableField("LATITUDE")
    private Float latitude;

    @TableField("STYLE")
    private String style;

    @TableField("AZIMUTH")
    private Float azimuth;

    @TableField("HEIGHT")
    private Float height;

    @TableField("ELECTTILT")
    private Float electtilt;

    @TableField("MECHTILT")
    private Float mechtilt;

    @TableField("TOTLETILT")
    private Float totletilt;


}
