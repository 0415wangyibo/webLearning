<template>
  <div>
    <el-radio disabled v-model="radio1" label="禁用">禁用</el-radio>
    <el-radio disabled v-model="radio1" label="选中且禁用">选中且禁用</el-radio>
  </div>
</template>
<!--禁用按钮-->
<script>
  export default {
    name: "element18",
    data() {
      return {
        radio1: '选中且禁用'
      };
    }
  }
</script>

<style scoped>

</style>
