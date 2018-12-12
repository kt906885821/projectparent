package com.pinyougou.manager.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.kt.sellergoods.service.BrandService;
import com.pinyougou.pojo.TbBrand;
import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {


    @Reference
    private BrandService brandService;


    /*
    返回全部列表
     */

    @RequestMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }

    /*
    返回全部列表
     */
    @RequestMapping("/findPage")
    public PageResult findPage(int page,int rows){
        return brandService.findPage(page,rows);
    }

    /*
    增加
     */
    @RequestMapping("/add")
    public Result add(@RequestBody TbBrand brand) {
        try {
            brandService.add(brand);
            return new Result(true, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"添加失败");
        }
    }

    /*
    修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody TbBrand brand) {
        brandService.update(brand);
        try {
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    /*
    获取实体
     */
    @RequestMapping("/findOne")
    public TbBrand findOne(Long id){
        return brandService.findOne(id);
    }

    /*
    批量删除
     */
    @RequestMapping("/delete")
    public Result delete(Long[] ids){
        brandService.delete(ids);
        try {
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(true,"删除失败");
        }
    }
    /*
    查询+分页
     */
    @RequestMapping("/search")
    public PageResult search(@RequestBody TbBrand brand,int page,int rows){
        return brandService.findPage(brand,page,rows);
    }
}
