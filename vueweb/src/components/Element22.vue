<template>
  <div>
    <el-checkbox v-model="checked">备选项</el-checkbox>
  </div>
</template>
<!--多选框，仅一个按钮-->
<script>
  export default {
    name: "element22",
    data() {
      return {
        checked: true
      };
    }
  }
</script>

<style scoped>

</style>
