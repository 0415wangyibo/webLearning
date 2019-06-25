<template>
  <div>
    <el-input
      placeholder="请输入内容"
      v-model="input10"
      clearable>
    </el-input>
  </div>
</template>
<!--可清空的输入框-->
<script>
  export default {
    name: "element31",
    data() {
      return {
        input10: ''
      }
    }
  }
</script>

<style scoped>

</style>
