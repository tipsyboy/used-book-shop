import "reflect-metadata";

import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'

import "bootstrap/dist/css/bootstrap-utilities.css"

import { createPinia } from 'pinia'
import piniaPluginPersistedstate from 'pinia-plugin-persistedstate'

import CenterLayout from '@/components/CenterLayout.vue'

const app = createApp(App)

app.use(router)
app.use(ElementPlus)
app.use(createPinia().use(piniaPluginPersistedstate))
app.mount('#app')
app.component('CenterLayout', CenterLayout)
