<template>
  <div>
    <el-switch
      v-model="value3"
      active-text="按月付费"
      inactive-text="按年付费">
    </el-switch>
    <el-switch
      style="display: block"
      v-model="value4"
      active-color="#13ce66"
      inactive-color="#ff4949"
      active-text="按月付费"
      inactive-text="按年付费">
    </el-switch>
  </div>
</template>
<!--增加文字描述-->
<script>
  export default {
    name: "element63",
    data() {
      return {
        value3: true,
        value4: true
      }
    }
  }
</script>

<style scoped>

</style>
