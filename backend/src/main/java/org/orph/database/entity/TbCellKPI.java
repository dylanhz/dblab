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
@TableName("tbCellKPI")
@ApiModel(value="TbCellKPI对象", description="")
public class TbCellKPI implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("StartTime")
    private Date StartTime;

    @TableField("ENODEB_NAME")
    private String enodebName;

    @TableField("SECTOR_DESCRIPTION")
    private String sectorDescription;

    @TableField("SECTOR_NAME")
    private String sectorName;

    @TableField("RRC_COMPLETE")
    private Integer rrcComplete;

    @TableField("RRC_REQUEST")
    private Integer rrcRequest;

    @TableField("RRC_SUCCESS_PER")
    private Float rrcSuccessPer;

    @TableField("ERAB_SUCCESS")
    private Integer erabSuccess;

    @TableField("ERAB_TRY")
    private Integer erabTry;

    @TableField("ERAB_SUCCESS_PER")
    private Double erabSuccessPer;

    @TableField("eNodeB_TRING_ERAB_EXCEPTION")
    private Integer enodebTringErabException;

    @TableField("SECTOR_SWITCH_OUT_ERAB_EXCEPTION")
    private Integer sectorSwitchOutErabException;

    @TableField("ERAB_OFFLINE_PER")
    private Double erabOfflinePer;

    @TableField("WIRELESS_ONLINE_PER")
    private Double wirelessOnlinePer;

    @TableField("eNodeB_S1_RESET_UE_Context_RELEASE")
    private Integer enodebS1ResetUeContextRelease;

    @TableField("UE_Context_EXCEPTION")
    private Integer ueContextException;

    @TableField("UE_Context_SUCCESS")
    private Integer ueContextSuccess;

    @TableField("WIRELESS_OFFLINE_PER")
    private Double wirelessOfflinePer;

    @TableField("eNodeB_IN_DIFF_FREQ_SWITCH_OUT_SUCCESS")
    private Integer enodebInDiffFreqSwitchOutSuccess;

    @TableField("eNodeB_IN_DIFF_FREQ_SWITCH_OUT_TRY")
    private Integer enodebInDiffFreqSwitchOutTry;

    @TableField("eNodeB_IN_SAME_FREQ_SWITCH_OUT_SUCCESS")
    private Integer enodebInSameFreqSwitchOutSuccess;

    @TableField("eNodeB_IN_SAME_FREQ_SWITCH_OUT_TRY")
    private Integer enodebInSameFreqSwitchOutTry;

    @TableField("eNodeB_BETWEEN_DIFF_FREQ_SWITCH_OUT_SUCCESS")
    private Integer enodebBetweenDiffFreqSwitchOutSuccess;

    @TableField("eNodeB_BETWEEN_DIFF_FREQ_SWITCH_OUT_TRY")
    private Integer enodebBetweenDiffFreqSwitchOutTry;

    @TableField("eNodeB_BETWEEN_SAME_FREQ_SWITCH_OUT_SUCCESS")
    private Integer enodebBetweenSameFreqSwitchOutSuccess;

    @TableField("eNodeB_BETWEEN_SAME_FREQ_SWITCH_OUT_TRY")
    private Integer enodebBetweenSameFreqSwitchOutTry;

    @TableField("eNB_IN_SWITCH_SUCCESS_PER")
    private Double enbInSwitchSuccessPer;

    @TableField("eNB_BETWEEN_SWITCH_SUCCESS_PER")
    private Double enbBetweenSwitchSuccessPer;

    @TableField("SAME_FREQ_SWITCH_SUCCESS_PER")
    private Double sameFreqSwitchSuccessPer;

    @TableField("DIFF_FREQ_SWITCH_SUCCESS_PER")
    private Double diffFreqSwitchSuccessPer;

    @TableField("SWITCH_SUCCESS_PER")
    private Double switchSuccessPer;

    @TableField("SECTOR_PDCP_LAYER_RECV_UPLOAD_THROUGHPUT_BIT")
    private Long sectorPdcpLayerRecvUploadThroughputBit;

    @TableField("SECTOR_PDCP_LAYER_SEND_DNLOAD_THROUGHPUT_BIT")
    private Long sectorPdcpLayerSendDnloadThroughputBit;

    @TableField("RRC_RECONNECT")
    private Integer rrcReconnect;

    @TableField("RRC_RECONNECT_PER")
    private Double rrcReconnectPer;

    @TableField("THROUGH_REBUILD_BACK_eNodeB_BETEEEN_SAME_FREQ_SWITCH_OUT_SUCCESS")
    private Integer throughRebuildBackEnodebBeteeenSameFreqSwitchOutSuccess;

    @TableField("THROUGH_REBUILD_BACK_eNodeB_BETEEEN_DIFF_FREQ_SWITCH_OUT_SUCCESS")
    private Integer throughRebuildBackEnodebBeteeenDiffFreqSwitchOutSuccess;

    @TableField("THROUGH_REBUILD_BACK_eNodeB_IN_SAME_FREQ_SWITCH_OUT_SUCCESS")
    private Integer throughRebuildBackEnodebInSameFreqSwitchOutSuccess;

    @TableField("THROUGH_REBUILD_BACK_eNodeB_IN_DIFF_FREQ_SWITCH_OUT_SUCCESS")
    private Integer throughRebuildBackEnodebInDiffFreqSwitchOutSuccess;

    @TableField("eNB_IN_SWITCH_OUT_SUCCESS")
    private Integer enbInSwitchOutSuccess;

    @TableField("eNB_IN_SWITCH_OUT_TRY")
    private Integer enbInSwitchOutTry;


}
