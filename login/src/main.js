import Vue from 'vue'
import App from './App.vue'
import router from './router'

import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';

// ------------------------------
//引入 封装好的请求
import { postRequest } from "@/utils/request.js";
import { putRequest } from "@/utils/request.js";
import { getRequest } from "@/utils/request.js";
import { deleteRequest } from "@/utils/request.js";

//插件形式使用请求
Vue.prototype.postRequest = postRequest;
Vue.prototype.putRequest = putRequest;
Vue.prototype.getRequest = getRequest;
Vue.prototype.deleteRequest = deleteRequest;
// --------------------------------


Vue.use(ElementUI);
Vue.config.productionTip = false


new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
