<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.mapper;

import com.ht.report.model.${databaseName}.${className}Model;

import java.util.List;
import java.util.Map;


public interface ${className}MapperGen {

	//===========================================代码生成开始============================================

    ${className}Model selectById(${table.idColumn.javaType} ${table.idColumn.columnName?uncap_first});

    List<${className}Model> selectListByCondition(Map<String, Object> searchParams);

    int insert (${className}Model ${classNameLower}Model);

    int insertBatch(List<${className}Model> ${classNameLower}ModelList);

    int update (${className}Model ${classNameLower}Model);

    //===========================================代码生成结束============================================
}
