# easemobCustomer
为了环信客服做的cordova接口
使用时，需要修改plugin.xml 把其中的  <preference name="EASEMOB_APPKEY" value="XXXX#yyyy" /> 为相应的appkey即可。
调用时，可以直接用 
```javascript
cordova.exec(function( success){},function(error){},"EasemobCustomer","callCustomer",[kfJson])
```
这里的kfJson是类似于这样的形式的Json对象
``` json
{
 "appkey":"zgsoft#ygyjs",
 "extraUserId":"headchen",
"user":{
 "userId":"minnie",
 "password":"123456"
},
"msgtype":{
      track:{
        title:       "我正在看：",
        price:       "¥: 235.00",
        desc:        "女装小香风气质蕾丝假两件短袖",
        img_url:     "http://yourdomain.com/img/a.jpg",
        item_url:    "http://yourdomain.com/item/a.html"
      }
	},
"weichat":{
   "agentUsername":"xxx@xxx.com",
   "queueName":"shouqian",
      "visitor":{
        "trueName":"李明",
        "qq":"13512345678",
        "companyName":"环信",
        "userNickname":"小明",
        "description":"",
        "email":"abc@123.com",
        "tags": ["vip1", "vip2"]
      }
    }
	
}
```

这样的形式：  
*  extraUserId : 客服ID
*  user ： 需要动态注册到app上去。
*  msgtype: 用了推送浏览足迹
*  wechat: 用了推送客户信息

具体看环信客服的文档即可
 
