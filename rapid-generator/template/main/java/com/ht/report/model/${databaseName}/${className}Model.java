<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.model.${databaseName};

/** 
* ${table.sqlName} 表的Model
*/
public class ${className}Model extends ${className}ModelGen {
	
}