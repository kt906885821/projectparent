package com.kt.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

import java.util.List;

/*
品牌服务接口层
 */
public interface BrandService {

/*
返回全部列表
 */

    public List<TbBrand> findAll();

    /*
    返回分页列表
     */
    public PageResult findPage(int pageNum,int pageSize);

    /*
    增加
     */
    public void add(TbBrand brand);

    /*
    修改
     */
    public void update(TbBrand brand);

    /*
    根据ID获取实体
     */
    public TbBrand findOne(Long id);


    /*
    批量删除
     */
    public void delete(Long[] ids);

    /*
    实现品牌条件查询功能，输入品牌名称、首字母后查询，并分页。
     */
    public PageResult findPage(TbBrand brand,int pageNum,int pageSize);
}
