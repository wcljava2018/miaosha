package com.miaoshaproject.miaosha.service;

import com.miaoshaproject.miaosha.error.BussinessException;
import com.miaoshaproject.miaosha.service.model.ItemModel;

import java.util.List;

public interface ItemService {
    //创建商品
    ItemModel createItem(ItemModel itemModel) throws BussinessException;

    //商品列表浏览
    List<ItemModel> listItem();//查取所有商品信息


    //商品详情浏览
    ItemModel getItemById(Integer id);
}
