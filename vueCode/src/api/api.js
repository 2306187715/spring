import { deleteRequest, getRequest, postRequest, putRequest } from '@/utils/request'

/**
 * 登录
 * post /login
 * json
 */
export function Login(data) {
    return postRequest('http://localhost:8080/login', data)
}

/**
 * 注册账号
 * post /register
 * json
 */
export function Register(data) {
    return postRequest('http://localhost:8080/register', data)
}

/**
 * 查找用户
 * get /login/{username}
 * string
 */
export function Select(username) {
    return getRequest('http://localhost:8080/login/' + username)
}

/**
 * 修改密码
 * put /login
 * json
 */
export function Update(data){
    return putRequest('http://localhost:8080/login',data)
}

/**
 * 删除用户
 * delete /login/{username}
 * string
 */
export function deleteByUsername(username){
    return deleteRequest('http://localhost:8080/login/'+username)
}

/**
 * 查询所有用户
 */
export function SelectAll(){
    return getRequest('http://localhost:8080/dashboard')
}

/**
 * JustReturn
 */
export function dashboardNull(){
    return postRequest('http://localhost:8080/dashboard')
}