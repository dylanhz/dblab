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
@TableName("tbPRB")
@ApiModel(value="TbPRB对象", description="")
public class TbPRB implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("StartTime")
    private Date StartTime;

    @TableField("ENODEB_NAME")
    private String enodebName;

    @TableField("SECTOR_DESCRIPTION")
    private String sectorDescription;

    @TableField("SECTOR_NAME")
    private String sectorName;

    @TableField("avgInterferingNoiseOnPRB00_dBmW")
    private Integer avginterferingnoiseonprb00Dbmw;

    @TableField("avgInterferingNoiseOnPRB01_dBmW")
    private Integer avginterferingnoiseonprb01Dbmw;

    @TableField("avgInterferingNoiseOnPRB02_dBmW")
    private Integer avginterferingnoiseonprb02Dbmw;

    @TableField("avgInterferingNoiseOnPRB03_dBmW")
    private Integer avginterferingnoiseonprb03Dbmw;

    @TableField("avgInterferingNoiseOnPRB04_dBmW")
    private Integer avginterferingnoiseonprb04Dbmw;

    @TableField("avgInterferingNoiseOnPRB05_dBmW")
    private Integer avginterferingnoiseonprb05Dbmw;

    @TableField("avgInterferingNoiseOnPRB06_dBmW")
    private Integer avginterferingnoiseonprb06Dbmw;

    @TableField("avgInterferingNoiseOnPRB07_dBmW")
    private Integer avginterferingnoiseonprb07Dbmw;

    @TableField("avgInterferingNoiseOnPRB08_dBmW")
    private Integer avginterferingnoiseonprb08Dbmw;

    @TableField("avgInterferingNoiseOnPRB09_dBmW")
    private Integer avginterferingnoiseonprb09Dbmw;

    @TableField("avgInterferingNoiseOnPRB10_dBmW")
    private Integer avginterferingnoiseonprb10Dbmw;

    @TableField("avgInterferingNoiseOnPRB11_dBmW")
    private Integer avginterferingnoiseonprb11Dbmw;

    @TableField("avgInterferingNoiseOnPRB12_dBmW")
    private Integer avginterferingnoiseonprb12Dbmw;

    @TableField("avgInterferingNoiseOnPRB13_dBmW")
    private Integer avginterferingnoiseonprb13Dbmw;

    @TableField("avgInterferingNoiseOnPRB14_dBmW")
    private Integer avginterferingnoiseonprb14Dbmw;

    @TableField("avgInterferingNoiseOnPRB15_dBmW")
    private Integer avginterferingnoiseonprb15Dbmw;

    @TableField("avgInterferingNoiseOnPRB16_dBmW")
    private Integer avginterferingnoiseonprb16Dbmw;

    @TableField("avgInterferingNoiseOnPRB17_dBmW")
    private Integer avginterferingnoiseonprb17Dbmw;

    @TableField("avgInterferingNoiseOnPRB18_dBmW")
    private Integer avginterferingnoiseonprb18Dbmw;

    @TableField("avgInterferingNoiseOnPRB19_dBmW")
    private Integer avginterferingnoiseonprb19Dbmw;

    @TableField("avgInterferingNoiseOnPRB20_dBmW")
    private Integer avginterferingnoiseonprb20Dbmw;

    @TableField("avgInterferingNoiseOnPRB21_dBmW")
    private Integer avginterferingnoiseonprb21Dbmw;

    @TableField("avgInterferingNoiseOnPRB22_dBmW")
    private Integer avginterferingnoiseonprb22Dbmw;

    @TableField("avgInterferingNoiseOnPRB23_dBmW")
    private Integer avginterferingnoiseonprb23Dbmw;

    @TableField("avgInterferingNoiseOnPRB24_dBmW")
    private Integer avginterferingnoiseonprb24Dbmw;

    @TableField("avgInterferingNoiseOnPRB25_dBmW")
    private Integer avginterferingnoiseonprb25Dbmw;

    @TableField("avgInterferingNoiseOnPRB26_dBmW")
    private Integer avginterferingnoiseonprb26Dbmw;

    @TableField("avgInterferingNoiseOnPRB27_dBmW")
    private Integer avginterferingnoiseonprb27Dbmw;

    @TableField("avgInterferingNoiseOnPRB28_dBmW")
    private Integer avginterferingnoiseonprb28Dbmw;

    @TableField("avgInterferingNoiseOnPRB29_dBmW")
    private Integer avginterferingnoiseonprb29Dbmw;

    @TableField("avgInterferingNoiseOnPRB30_dBmW")
    private Integer avginterferingnoiseonprb30Dbmw;

    @TableField("avgInterferingNoiseOnPRB31_dBmW")
    private Integer avginterferingnoiseonprb31Dbmw;

    @TableField("avgInterferingNoiseOnPRB32_dBmW")
    private Integer avginterferingnoiseonprb32Dbmw;

    @TableField("avgInterferingNoiseOnPRB33_dBmW")
    private Integer avginterferingnoiseonprb33Dbmw;

    @TableField("avgInterferingNoiseOnPRB34_dBmW")
    private Integer avginterferingnoiseonprb34Dbmw;

    @TableField("avgInterferingNoiseOnPRB35_dBmW")
    private Integer avginterferingnoiseonprb35Dbmw;

    @TableField("avgInterferingNoiseOnPRB36_dBmW")
    private Integer avginterferingnoiseonprb36Dbmw;

    @TableField("avgInterferingNoiseOnPRB37_dBmW")
    private Integer avginterferingnoiseonprb37Dbmw;

    @TableField("avgInterferingNoiseOnPRB38_dBmW")
    private Integer avginterferingnoiseonprb38Dbmw;

    @TableField("avgInterferingNoiseOnPRB39_dBmW")
    private Integer avginterferingnoiseonprb39Dbmw;

    @TableField("avgInterferingNoiseOnPRB40_dBmW")
    private Integer avginterferingnoiseonprb40Dbmw;

    @TableField("avgInterferingNoiseOnPRB41_dBmW")
    private Integer avginterferingnoiseonprb41Dbmw;

    @TableField("avgInterferingNoiseOnPRB42_dBmW")
    private Integer avginterferingnoiseonprb42Dbmw;

    @TableField("avgInterferingNoiseOnPRB43_dBmW")
    private Integer avginterferingnoiseonprb43Dbmw;

    @TableField("avgInterferingNoiseOnPRB44_dBmW")
    private Integer avginterferingnoiseonprb44Dbmw;

    @TableField("avgInterferingNoiseOnPRB45_dBmW")
    private Integer avginterferingnoiseonprb45Dbmw;

    @TableField("avgInterferingNoiseOnPRB46_dBmW")
    private Integer avginterferingnoiseonprb46Dbmw;

    @TableField("avgInterferingNoiseOnPRB47_dBmW")
    private Integer avginterferingnoiseonprb47Dbmw;

    @TableField("avgInterferingNoiseOnPRB48_dBmW")
    private Integer avginterferingnoiseonprb48Dbmw;

    @TableField("avgInterferingNoiseOnPRB49_dBmW")
    private Integer avginterferingnoiseonprb49Dbmw;

    @TableField("avgInterferingNoiseOnPRB50_dBmW")
    private Integer avginterferingnoiseonprb50Dbmw;

    @TableField("avgInterferingNoiseOnPRB51_dBmW")
    private Integer avginterferingnoiseonprb51Dbmw;

    @TableField("avgInterferingNoiseOnPRB52_dBmW")
    private Integer avginterferingnoiseonprb52Dbmw;

    @TableField("avgInterferingNoiseOnPRB53_dBmW")
    private Integer avginterferingnoiseonprb53Dbmw;

    @TableField("avgInterferingNoiseOnPRB54_dBmW")
    private Integer avginterferingnoiseonprb54Dbmw;

    @TableField("avgInterferingNoiseOnPRB55_dBmW")
    private Integer avginterferingnoiseonprb55Dbmw;

    @TableField("avgInterferingNoiseOnPRB56_dBmW")
    private Integer avginterferingnoiseonprb56Dbmw;

    @TableField("avgInterferingNoiseOnPRB57_dBmW")
    private Integer avginterferingnoiseonprb57Dbmw;

    @TableField("avgInterferingNoiseOnPRB58_dBmW")
    private Integer avginterferingnoiseonprb58Dbmw;

    @TableField("avgInterferingNoiseOnPRB59_dBmW")
    private Integer avginterferingnoiseonprb59Dbmw;

    @TableField("avgInterferingNoiseOnPRB60_dBmW")
    private Integer avginterferingnoiseonprb60Dbmw;

    @TableField("avgInterferingNoiseOnPRB61_dBmW")
    private Integer avginterferingnoiseonprb61Dbmw;

    @TableField("avgInterferingNoiseOnPRB62_dBmW")
    private Integer avginterferingnoiseonprb62Dbmw;

    @TableField("avgInterferingNoiseOnPRB63_dBmW")
    private Integer avginterferingnoiseonprb63Dbmw;

    @TableField("avgInterferingNoiseOnPRB64_dBmW")
    private Integer avginterferingnoiseonprb64Dbmw;

    @TableField("avgInterferingNoiseOnPRB65_dBmW")
    private Integer avginterferingnoiseonprb65Dbmw;

    @TableField("avgInterferingNoiseOnPRB66_dBmW")
    private Integer avginterferingnoiseonprb66Dbmw;

    @TableField("avgInterferingNoiseOnPRB67_dBmW")
    private Integer avginterferingnoiseonprb67Dbmw;

    @TableField("avgInterferingNoiseOnPRB68_dBmW")
    private Integer avginterferingnoiseonprb68Dbmw;

    @TableField("avgInterferingNoiseOnPRB69_dBmW")
    private Integer avginterferingnoiseonprb69Dbmw;

    @TableField("avgInterferingNoiseOnPRB70_dBmW")
    private Integer avginterferingnoiseonprb70Dbmw;

    @TableField("avgInterferingNoiseOnPRB71_dBmW")
    private Integer avginterferingnoiseonprb71Dbmw;

    @TableField("avgInterferingNoiseOnPRB72_dBmW")
    private Integer avginterferingnoiseonprb72Dbmw;

    @TableField("avgInterferingNoiseOnPRB73_dBmW")
    private Integer avginterferingnoiseonprb73Dbmw;

    @TableField("avgInterferingNoiseOnPRB74_dBmW")
    private Integer avginterferingnoiseonprb74Dbmw;

    @TableField("avgInterferingNoiseOnPRB75_dBmW")
    private Integer avginterferingnoiseonprb75Dbmw;

    @TableField("avgInterferingNoiseOnPRB76_dBmW")
    private Integer avginterferingnoiseonprb76Dbmw;

    @TableField("avgInterferingNoiseOnPRB77_dBmW")
    private Integer avginterferingnoiseonprb77Dbmw;

    @TableField("avgInterferingNoiseOnPRB78_dBmW")
    private Integer avginterferingnoiseonprb78Dbmw;

    @TableField("avgInterferingNoiseOnPRB79_dBmW")
    private Integer avginterferingnoiseonprb79Dbmw;

    @TableField("avgInterferingNoiseOnPRB80_dBmW")
    private Integer avginterferingnoiseonprb80Dbmw;

    @TableField("avgInterferingNoiseOnPRB81_dBmW")
    private Integer avginterferingnoiseonprb81Dbmw;

    @TableField("avgInterferingNoiseOnPRB82_dBmW")
    private Integer avginterferingnoiseonprb82Dbmw;

    @TableField("avgInterferingNoiseOnPRB83_dBmW")
    private Integer avginterferingnoiseonprb83Dbmw;

    @TableField("avgInterferingNoiseOnPRB84_dBmW")
    private Integer avginterferingnoiseonprb84Dbmw;

    @TableField("avgInterferingNoiseOnPRB85_dBmW")
    private Integer avginterferingnoiseonprb85Dbmw;

    @TableField("avgInterferingNoiseOnPRB86_dBmW")
    private Integer avginterferingnoiseonprb86Dbmw;

    @TableField("avgInterferingNoiseOnPRB87_dBmW")
    private Integer avginterferingnoiseonprb87Dbmw;

    @TableField("avgInterferingNoiseOnPRB88_dBmW")
    private Integer avginterferingnoiseonprb88Dbmw;

    @TableField("avgInterferingNoiseOnPRB89_dBmW")
    private Integer avginterferingnoiseonprb89Dbmw;

    @TableField("avgInterferingNoiseOnPRB90_dBmW")
    private Integer avginterferingnoiseonprb90Dbmw;

    @TableField("avgInterferingNoiseOnPRB91_dBmW")
    private Integer avginterferingnoiseonprb91Dbmw;

    @TableField("avgInterferingNoiseOnPRB92_dBmW")
    private Integer avginterferingnoiseonprb92Dbmw;

    @TableField("avgInterferingNoiseOnPRB93_dBmW")
    private Integer avginterferingnoiseonprb93Dbmw;

    @TableField("avgInterferingNoiseOnPRB94_dBmW")
    private Integer avginterferingnoiseonprb94Dbmw;

    @TableField("avgInterferingNoiseOnPRB95_dBmW")
    private Integer avginterferingnoiseonprb95Dbmw;

    @TableField("avgInterferingNoiseOnPRB96_dBmW")
    private Integer avginterferingnoiseonprb96Dbmw;

    @TableField("avgInterferingNoiseOnPRB97_dBmW")
    private Integer avginterferingnoiseonprb97Dbmw;

    @TableField("avgInterferingNoiseOnPRB98_dBmW")
    private Integer avginterferingnoiseonprb98Dbmw;

    @TableField("avgInterferingNoiseOnPRB99_dBmW")
    private Integer avginterferingnoiseonprb99Dbmw;


}
