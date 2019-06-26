<template>
  <div>
    <div class="block">
      <span class="demonstration">有默认值</span>
      <el-color-picker v-model="color1"></el-color-picker>
    </div>
    <div class="block">
      <span class="demonstration">无默认值</span>
      <el-color-picker v-model="color2"></el-color-picker>
    </div>
  </div>
</template>
<!--ColorPicker 颜色选择器-->
<script>
  export default {
    name: "element93",
    data() {
      return {
        color1: '#409EFF',
        color2: null
      }
    }
  }
</script>

<style scoped>

</style>
