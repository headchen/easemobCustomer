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
      "track":{
        "title":       "100025",  //放商品编号
        "price":       "¥: 235.00",
        "desc":        "女装小香风气质蕾丝假两件短袖",
        "img_url":     "http://yourdomain.com/img/a.jpg",
        "item_url":    "http://yourdomain.com/item/a.html"
      }
      "order":{
        "order_title": "160210083",  //一般为订单号
        "title":       "2522226",   //放商品编号
        "price":       "¥: 235.00",
        "desc":        "女装小香风气质蕾丝假两件短袖", // 商品描述
        "img_url":     "http://yourdomain.com/img/a.jpg", // 商品图片链接
        "item_url":    "http://yourdomain.com/item/a.html"  // 商品页面链接
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
*  extraUserId : 客服ID,一般「集成app」时指定。
*  user ： 需要动态注册到app上去。
*  msgtype: 用了推送浏览「足迹」和「订单」，「足迹」和「订单」的区别在于：track<->order order: order_title
*  wechat: 用了推送顾客信息

具体看环信客服的文档即可
 
