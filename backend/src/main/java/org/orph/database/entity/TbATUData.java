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
@TableName("tbATUData")
@ApiModel(value="TbATUData对象", description="")
public class TbATUData implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long seq;

    @TableField("FileName")
    private String FileName;

    @TableField("Time")
    private String Time;

    @TableField("Longitude")
    private Float Longitude;

    @TableField("Latitude")
    private Float Latitude;

    @TableField("CellID")
    private String CellID;

    @TableField("TAC")
    private Integer tac;

    @TableField("EARFCN")
    private Integer earfcn;

    @TableField("PCI")
    private Integer pci;

    @TableField("RSRP")
    private Float rsrp;

    @TableField("RS_SINR")
    private Float rsSinr;

    @TableField("NCell_ID_1")
    private String ncellId1;

    @TableField("NCell_EARFCN_1")
    private Integer ncellEarfcn1;

    @TableField("NCell_PCI_1")
    private Integer ncellPci1;

    @TableField("NCell_RSRP_1")
    private Float ncellRsrp1;

    @TableField("NCell_ID_2")
    private String ncellId2;

    @TableField("NCell_EARFCN_2")
    private Integer ncellEarfcn2;

    @TableField("NCell_PCI_2")
    private Integer ncellPci2;

    @TableField("NCell_RSRP_2")
    private Float ncellRsrp2;

    @TableField("NCell_ID_3")
    private String ncellId3;

    @TableField("NCell_EARFCN_3")
    private Integer ncellEarfcn3;

    @TableField("NCell_PCI_3")
    private Integer ncellPci3;

    @TableField("NCell_RSRP_3")
    private Float ncellRsrp3;

    @TableField("NCell_ID_4")
    private String ncellId4;

    @TableField("NCell_EARFCN_4")
    private Integer ncellEarfcn4;

    @TableField("NCell_PCI_4")
    private Integer ncellPci4;

    @TableField("NCell_RSRP_4")
    private Float ncellRsrp4;

    @TableField("NCell_ID_5")
    private String ncellId5;

    @TableField("NCell_EARFCN_5")
    private Integer ncellEarfcn5;

    @TableField("NCell_PCI_5")
    private Integer ncellPci5;

    @TableField("NCell_RSRP_5")
    private Float ncellRsrp5;

    @TableField("NCell_ID_6")
    private String ncellId6;

    @TableField("NCell_EARFCN_6")
    private Integer ncellEarfcn6;

    @TableField("NCell_PCI_6")
    private Integer ncellPci6;

    @TableField("NCell_RSRP_6")
    private Float ncellRsrp6;


}
