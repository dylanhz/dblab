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
@TableName("tbMROData")
@ApiModel(value="TbMROData对象", description="")
public class TbMROData implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("TimeStamp")
    private String TimeStamp;

    @TableField("ServingSector")
    private String ServingSector;

    @TableField("InterferingSector")
    private String InterferingSector;

    @TableField("LteScRSRP")
    private Float LteScRSRP;

    @TableField("LteNcRSRP")
    private Float LteNcRSRP;

    @TableField("LteNcEarfcn")
    private Integer LteNcEarfcn;

    @TableField("LteNcPci")
    private Integer LteNcPci;


}
