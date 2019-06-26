<template>
  <div>
    <el-color-picker v-model="color3" show-alpha></el-color-picker>
  </div>
</template>
<!--支持透明度-->
<script>
  export default {
    name: "element94",
    data() {
      return {
        color3: 'rgba(19, 206, 102, 0.8)'
      }
    }
  }
</script>

<style scoped>

</style>
