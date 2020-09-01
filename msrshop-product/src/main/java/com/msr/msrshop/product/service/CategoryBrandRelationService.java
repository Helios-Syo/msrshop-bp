package com.msr.msrshop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msr.common.utils.PageUtils;
import com.msr.msrshop.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author tom
 * @email tom@gmail.com
 * @date 2020-09-01 14:59:28
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

