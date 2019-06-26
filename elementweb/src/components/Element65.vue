<template>
  <div>
    <el-switch
      v-model="value6"
      disabled>
    </el-switch>
    <el-switch
      v-model="value7"
      disabled>
    </el-switch>
  </div>
</template>
<!--禁用状态-->
<script>
  export default {
    name: "element65",
    data() {
      return {
        value6: true,
        value7: false
      }
    }
  }
</script>

<style scoped>

</style>
