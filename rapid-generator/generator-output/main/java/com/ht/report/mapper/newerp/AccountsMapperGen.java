package com.ht.report.mapper;

import com.ht.report.model.newerp.AccountsModel;

import java.util.List;
import java.util.Map;


public interface AccountsMapperGen {

	//===========================================代码生成开始============================================

    AccountsModel selectById(java.lang.Integer id);

    List<AccountsModel> selectListByCondition(Map<String, Object> searchParams);

    int insert (AccountsModel accountsModel);

    int insertBatch(List<AccountsModel> accountsModelList);

    int update (AccountsModel accountsModel);

    //===========================================代码生成结束============================================
}
