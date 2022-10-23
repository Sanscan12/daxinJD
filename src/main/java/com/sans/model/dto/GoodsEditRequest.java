package com.sans.model.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * 商品编辑请求
 * @author Sans
 */
@Data
public class GoodsEditRequest implements Serializable {

    /**
     * 标题
     */
    private String goodsTitle;

    /**
     * 名称
     */
    private String goodsName;

    /**
     * 型号
     */
    private String goodsModel;

    /**
     * 商品SKU
     */
    private String goodsSku;

    /**
     * 分类id
     */
    private long goodsClassId;

    /**
     * 品牌
     */
    private String goodsBrand;

    /**
     * 单价
     */
    private double goodsPrice;

    /**
     * 最低单价
     */
    private double goodsSmallPrice;

    /**
     * 状态
     */
    private int goodsStatus;

    /**
     * 备注
     */
    private String goodsRemarks;

    /**
     * 大图
     */
    private String goodsBigLogo;

    /**
     * 小图
     */
    private String goodsSmallLogo;

}
