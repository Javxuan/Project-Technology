package com.ht.report.mapper;

import com.ht.report.model.newerp.ErpOrdersModel;

import java.util.List;
import java.util.Map;


public interface ErpOrdersMapperGen {

	//===========================================代码生成开始============================================

    ErpOrdersModel selectById(java.lang.Integer id);

    List<ErpOrdersModel> selectListByCondition(Map<String, Object> searchParams);

    int insert (ErpOrdersModel erpOrdersModel);

    int insertBatch(List<ErpOrdersModel> erpOrdersModelList);

    int update (ErpOrdersModel erpOrdersModel);

    //===========================================代码生成结束============================================
}
