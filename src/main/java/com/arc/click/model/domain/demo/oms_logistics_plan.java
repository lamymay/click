package com.arc.click.model.domain.demo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单中心标准下单实体
 * 订单涉及相关维度信息
 * 1 谁和谁产生的单子
 * 2 涉及资金相关：各种费用是多少、货值、
 * 3 计费规则
 * 4 物流相关: 收发货人、承运、联系方式、运输方式、物流跟踪、目的地、
 * 物流的形式：
 * 一单多货 一单多货物
 *
 * @author yechao
 * @since 2021/4/1 10:57
 */
@Getter
@Setter
public class oms_logistics_plan implements Serializable {
    private Long id;//主键id

    private String carrier;//承运商
    private String planOrderType;// 计划单类型:大宗/多装多卸/往返/
    private Integer ownerCode;//货主code

    private Integer ownerPartyId;//货主partyId
    private Integer carrierPartyId;//承运商PartyId
    private Integer carrierName;//承运商名称

    private Integer planOrderAmount;//计划订单数量
    private Integer hasSentPlanOrderAmount;//已发计划订单数量
    private Double weight;//计划订单总质量 单位:吨?   // todo 建议使用 整数int 来存储 扩大100倍以方便计算与存储!

    private Double capacity;//计划订单总体积 单位:立方米?
    private Date expireTime;//失效时间  todo 时间精度
    private String valuationSolution;// 计价方式 todo 是否需要定义枚举


    private String price;//分单价 todo 字符串类型是否有误?
    private String goodType;//货物类型
    private Double singleFee;//单笔费用 todo 是否可以改用整数放大倍数来表示?

    private Double rate;//费率
    private Double dynamicRate;//浮动费率
    private Integer requiredCarLength;//需要的用车长度

    private Integer requiredCarModel;//需要的用车车型
    private Integer substratumOrder;// 下游单号  todo 数据类型是Integer吗
    private String from;//来源 todo用 superstratum or source or form

    private Double sendReceiveDistance;//运距 todo 数据类型是否替换为整数
    private String status;//状态 头都 定义状态有几种


    private String loadProvince;//装载地省份
    private String loadProvinceCode;//装载地省份编码
    private String loadCity;//装载地城市
    private String loadCityCode;//装载地城市编码
    private String loadDistrict;//装载地区县
    private String loadDistrictCode;//装载地区县编码
    private String loadTown;//装载地城镇
    private String loadTownCode;//装载地城镇编码
    private String loadDetail;//装载地地址详情
    private String loadLatitude;//装载地经度
    private String loadLongitude;//装载地纬度

    private String unloadProvince;//卸货地省份
    private String unloadProvinceCode;//卸货地省份编码
    private String unloadCity;//卸货地城市
    private String unloadCityCode;//卸货地城市编码
    private String unloadDistrict;//卸货地区县
    private String unloadDistrictCode;//卸货地区县编码
    private String unloadTown;//卸货地城镇
    private String unloadTownCode;//卸货地城镇编码
    private String unloadDetail;//卸货地地址详情
    private String unloadLatitude;//卸货地经度
    private String unloadLongitude;//卸货地纬度


    private String remark;//备注
    private String transportCapacityType;//运力类型: 1=路运通(路运通调度) 2=陆运通计划  todo数据类型建议改为数字类型
    private String receiver;//收货人姓名

    private String receiverCellphone;//收货人电话
    private String sender;//发货人
    private String senderCellphone;//发货人电话


}
