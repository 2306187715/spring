"use strict";(self["webpackChunklogin"]=self["webpackChunklogin"]||[]).push([[614],{5614:function(e,r,s){s.r(r),s.d(r,{default:function(){return c}});var t=function(){var e=this,r=e._self._c;return r("el-container",[r("el-header",[e._v("Web程序设计作业 - register")]),r("el-divider",[r("i",{staticClass:"el-icon-mobile-phone"})]),r("el-main",{attrs:{id:"centered-content"}},[r("el-form",{ref:"Form",attrs:{model:e.Form,rules:e.loginRules,"layout-center":"","label-width":"100px","label-position":"left"}},[r("el-form-item",{attrs:{label:"账号",prop:"username"}},[r("el-input",{attrs:{placeholder:"Username",type:"text",tabindex:"1","auto-complete":"on"},model:{value:e.Form.username,callback:function(r){e.$set(e.Form,"username",r)},expression:"Form.username"}})],1),r("el-form-item",{attrs:{label:"密码",prop:"password"}},[r("el-input",{attrs:{placeholder:"Password",type:"password",name:"password",tabindex:"2","auto-complete":"on"},on:{keyup:function(r){return e.LoginFunc("Form")}},model:{value:e.Form.password,callback:function(r){e.$set(e.Form,"password",r)},expression:"Form.password"}})],1),r("el-form-item",{attrs:{label:"确认密码",prop:"checkPass"}},[r("el-input",{attrs:{type:"password",autocomplete:"off"},model:{value:e.Form.checkPass,callback:function(r){e.$set(e.Form,"checkPass",r)},expression:"Form.checkPass"}})],1),r("el-form-item",[r("el-button",{attrs:{url:""},on:{click:function(r){return e.RegisterFunc("Form")}}},[e._v("注册")])],1)],1)],1)],1)},o=[],n=(s(560),s(8898)),a={data(){var e=(e,r,s)=>{""===r?s(new Error("请输入密码")):(""!==this.Form.checkPass&&this.$refs.Form.validateField("checkPass"),s())},r=(e,r,s)=>{""===r?s(new Error("请再次输入密码")):r!==this.Form.password?s(new Error("两次输入密码不一致!")):s()};return{Form:{username:"",password:"",checkPass:""},loading:!1,loginRules:{username:[{required:!0,trigger:"blur",message:"请输入用户名"},{min:3,max:8,message:"3-8",trigger:"blur"}],password:[{required:!0,trigger:"blur",message:"密码呢"},{min:3,max:16,message:"3-16",trigger:"blur"},{validator:e,trigger:"blur"}],checkPass:[{validator:r,trigger:"blur"}]}}},methods:{RegisterFunc(e){this.$refs[e].validate((e=>{if(!e)return this.$message({type:"error",message:"请设置密码"}),!1;this.$message.success("正在注册"),this.loading=!0,(0,n.aX)(this.Form).then((e=>{console.log(e),1==e.data.code?(this.$message.success("注册成功"),this.$router.push("/login")):(this.loading=!1,this.Form.password="",this.Form.checkPass="",this.$message.error("用户名已存在"))}))}))}}},i=a,l=s(1001),u=(0,l.Z)(i,t,o,!1,null,null,null),c=u.exports},8898:function(e,r,s){s.d(r,{BN:function(){return a},O4:function(){return l},Yj:function(){return i},aX:function(){return n},m3:function(){return o}});var t=s(4471);function o(e){return(0,t.j0)("/login",e)}function n(e){return(0,t.j0)("/register",e)}function a(e){return(0,t.GH)("/login",e)}function i(e){return(0,t.Jl)("/login/"+e)}function l(){return(0,t.j0)("/dashboard")}}}]);
//# sourceMappingURL=614.5e1977ce.js.map