package com.pinyougou.pojogroup;

import com.pinyougou.pojo.TbOrderItem;
import com.pinyougou.pojo.TbSeller;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: QiangyuGao
 * @Description:
 * @Date: Created in 20:46 2018/8/17
 * @Modified By:
 * @Project: ideapinyougou
 */
public class Cart implements Serializable {

    private String sellerId;//商家id

    private String sellerName;//商家name

    private List<TbOrderItem> orderItemList;//购物商品明细列表

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public List<TbOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<TbOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
