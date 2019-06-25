<template>
  <div>
    <el-input
      placeholder="请输入内容"
      v-model="input1"
      :disabled="true">
    </el-input>
  </div>
</template>
<!--禁用输入框-->
<script>
  export default {
    name: "element30",
    data() {
      return {
        input1: ''
      }
    }
  }
</script>

<style scoped>

</style>
