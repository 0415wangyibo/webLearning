<template>
  <div>
    <el-color-picker v-model="color4"></el-color-picker>
    <el-color-picker v-model="color4" size="medium"></el-color-picker>
    <el-color-picker v-model="color4" size="small"></el-color-picker>
    <el-color-picker v-model="color4" size="mini"></el-color-picker>
  </div>
</template>
<!--不同尺寸-->
<script>
  export default {
    name: "element96",
    data() {
      return {
        color4: '#409EFF'
      }
    }
  }
</script>

<style scoped>

</style>
