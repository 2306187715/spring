# web程序设计作业

### 1.登录

#### 1.1基本信息

> 请求路径：/login
>
> 请求方式：POST
>
> 接口描述：该接口用于登录，并在完毕后下发JWT令牌。 



#### 1.2请求参数

参数格式：application/json

参数说明：

| 名称     | 类型   | 是否必须 | 备注   |
| -------- | ------ | -------- | :----- |
| username | string | 必须     | 用户名 |
| password | string | 必须     | 密码   |

请求数据样例：

```json
{
	"username": "jtz",
    "password": "123456"
}
```



#### 1.3 响应数据

参数格式：application/json

参数说明：

| 名称 | 类型   | 是否必须 | 默认值 | 备注                     | 其他信息 |
| ---- | ------ | -------- | ------ | ------------------------ | -------- |
| code | number | 必须     |        | 响应码, 1 成功 ; 0  失败 |          |
| msg  | string | 非必须   |        | 提示信息                 |          |
| data | string | 必须     |        | 返回的数据 , jwt令牌     |          |



响应数据样例：

```json
{
  "code": 1,
  "msg": "success",
  "data": "eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoi6YeR5bq4IiwiaWQiOjEsInVzZXJuYW1lIjoiamlueW9uZyIsImV4cCI6MTY2MjIwNzA0OH0.KkUc_CXJZJ8Dd063eImx4H9Ojfrr6XMJ-yVzaWCVZCo"
}
```







### 2.注册

#### 2.1 基本信息

> 请求路径：/register
>
> 请求方式：POST
>
> 接口描述：该接口用于注册用户




#### 2.2 请求参数

格式：application/json

参数说明：

| 参数名   | 类型   | 是否必须 | 备注   |
| -------- | ------ | -------- | ------ |
| username | string | 必须     | 用户名 |
| password | string | 必须     | 密码   |

请求参数样例：

```json
{
	"username": "jtz",
    "password": "123456"
}
```



#### 2.3 响应数据

参数格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注                           |
| ------ | ------ | -------- | ------------------------------ |
| code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg    | string | 非必须   | 提示信息                       |
| data   | object | 非必须   | 返回的数据                     |

响应数据样例：

```json
{
    "code":1,
    "msg":"success",
    "data":null
}
```





### 3 删除用户

#### 3.1 基本信息

> 请求路径：/login/{username}
>
> 请求方式：DELETE
>
> 接口描述：该接口用于删除用户



#### 3.2 请求参数

参数格式：路径参数

参数说明：

| 参数名   | 类型   | 是否必须 | 备注   |
| -------- | ------ | -------- | ------ |
| username | string | 必须     | 用户名 |

请求参数样例：

```
/login/jtz
```



#### 3.3 响应数据

参数格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注                           |
| ------ | ------ | -------- | ------------------------------ |
| code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg    | string | 非必须   | 提示信息                       |
| data   | object | 非必须   | 返回的数据                     |

响应数据样例：

```json
{
    "code":1,
    "msg":"success",
    "data":null
}
```





### 4 修改密码

#### 4.1 基本信息

> 请求路径：/login
>
> 请求方式：PUT
>
> 接口描述：该接口用于修改密码



#### 2.2 请求参数

格式：application/json

参数说明：

| 参数名   | 类型   | 是否必须 | 备注   |
| -------- | ------ | -------- | ------ |
| username | string | 必须     | 用户名 |
| password | string | 必须     | 密码   |

请求参数样例：

```json
{
	"username": "jtz",
    "password": "654321"
}
```



#### 4.3 响应数据 

参数格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注                           |
| ------ | ------ | -------- | ------------------------------ |
| code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg    | string | 非必须   | 提示信息                       |
| data   | object | 非必须   | 返回的数据                     |

响应数据样例：

```json
{
    "code":1,
    "msg":"success",
    "data":null
}
```





