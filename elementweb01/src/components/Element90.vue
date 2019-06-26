<template>
  <div>
    <div class="block">
      <span class="demonstration">默认不区分颜色</span>
      <el-rate v-model="value1"></el-rate>
    </div>
    <div class="block">
      <span class="demonstration">区分颜色</span>
      <el-rate
        v-model="value2"
        :colors="['#99A9BF', '#F7BA2A', '#FF9900']">
      </el-rate>
    </div>
  </div>
</template>
<!--评分基本用法-->
<script>
  export default {
    name: "element90",
    data() {
      return {
        value1: null,
        value2: null
      }
    }
  }
</script>

<style scoped>

</style>
