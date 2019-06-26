<template>
  <div>
    <el-switch
      v-model="value2"
      active-color="#13ce66"
      inactive-color="#ff4949">
    </el-switch>
  </div>
</template>
<!--Switch 开关-->
<script>
  export default {
    name: "element62",
    data() {
      return {
        value1: true,
        value2: true
      }
    }
  }
</script>

<style scoped>

</style>
