package com.hszsd.webpay.dao;

import com.hszsd.webpay.po.TradeRecordPO;
import com.hszsd.webpay.condition.TradeRecordCondition;
import com.hszsd.webpay.web.dto.TradeRecordDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TradeRecordDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_TRADE_RECORD
     *
     * @mbggenerated
     */
    int countByCondition(TradeRecordCondition condition);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_TRADE_RECORD
     *
     * @mbggenerated
     */
    int deleteByCondition(TradeRecordCondition condition);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_TRADE_RECORD
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String transId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_TRADE_RECORD
     *
     * @mbggenerated
     */
    int insert(TradeRecordPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_TRADE_RECORD
     *
     * @mbggenerated
     */
    int insertSelective(TradeRecordPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_TRADE_RECORD
     *
     * @mbggenerated
     */
    List<TradeRecordDTO> selectByCondition(TradeRecordCondition condition);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_TRADE_RECORD
     *
     * @mbggenerated
     */
    TradeRecordDTO selectByPrimaryKey(String transId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_TRADE_RECORD
     *
     * @mbggenerated
     */
    int updateByConditionSelective(@Param("record") TradeRecordPO record, @Param("condition") TradeRecordCondition condition);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_TRADE_RECORD
     *
     * @mbggenerated
     */
    int updateByCondition(@Param("record") TradeRecordPO record, @Param("condition") TradeRecordCondition condition);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_TRADE_RECORD
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TradeRecordPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_TRADE_RECORD
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TradeRecordPO record);
}