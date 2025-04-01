<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

var menus = [

	{
        "backMenu":[
            {
                "child":[
                    {
                        "buttons":[
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"管理员管理",
                        "menuJump":"列表",
                        "tableName":"users"
                    }
                ],
                "menu":"管理员信息"
            }
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
			                "删除"
			            ],
			            "menu":"用户管理",
			            "menuJump":"列表",
			            "tableName":"yonghu"
			        }
			    ],
			    "menu":"用户管理"
			}
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
			                "删除"
			            ],
			            "menu":"选牌信息管理",
			            "menuJump":"列表",
			            "tableName":"xuanpai"
			        }
			    ],
			    "menu":"选牌信息管理"
			}
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "审核",
			                "删除"
			            ],
			            "menu":"上牌信息管理",
			            "menuJump":"列表",
			            "tableName":"shangpai"
			        }
			    ],
			    "menu":"上牌信息管理"
			}
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"保险信息管理",
                        "menuJump":"列表",
                        "tableName":"baoxian"
                    }
                ],
                "menu":"保险信息管理"
            }
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
			                "删除"
			            ],
			            "menu":"保险类型管理",
			            "menuJump":"列表",
			            "tableName":"dictionaryBaoxian"
			        }
			        ,
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
			                "删除"
			            ],
			            "menu":"电动车类型管理",
			            "menuJump":"列表",
			            "tableName":"dictionaryDiandongche"
			        }
			        ,
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
			                "删除"
			            ],
			            "menu":"公告类型管理",
			            "menuJump":"列表",
			            "tableName":"dictionaryNews"
			        }
			        ,
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
			                "删除"
			            ],
			            "menu":"驾照类型管理",
			            "menuJump":"列表",
			            "tableName":"dictionaryXuanpai"
			        }
			    ],
			    "menu":"基础数据管理"
			}
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
			                "删除"
			            ],
			            "menu":"公告管理",
			            "menuJump":"列表",
			            "tableName":"news"
			        }
			    ],
			    "menu":"公告管理"
			}
        ],
        "frontMenu":[

        ],
        "roleName":"管理员",
        "tableName":"users"
    }
	,
	{
	    "backMenu":[
	        {
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "选择"
			            ],
			            "menu":"选牌信息管理",
			            "menuJump":"列表",
			            "tableName":"xuanpai"
			        }
			    ],
			    "menu":"选牌信息管理"
			}
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看"
			            ],
			            "menu":"上牌信息管理",
			            "menuJump":"列表",
			            "tableName":"shangpai"
			        }
			    ],
			    "menu":"上牌信息管理"
			}
	        ,{
	            "child":[
	                {
	                    "buttons":[
	                        "查看"
	                    ],
	                    "menu":"保险信息管理",
	                    "menuJump":"列表",
	                    "tableName":"baoxian"
	                }
	            ],
	            "menu":"保险信息管理"
	        }
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看"
			            ],
			            "menu":"公告管理",
			            "menuJump":"列表",
			            "tableName":"news"
			        }
			    ],
			    "menu":"公告管理"
			}
	    ],
	    "frontMenu":[
	
	    ],
	    "roleName":"用户",
	    "tableName":"yonghu"
	}
];

var hasMessage = '';
