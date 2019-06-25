<template>
  <div>
    <el-radio-group v-model="radio2">
      <el-radio :label="1">备选项1</el-radio>
      <el-radio :label="2">备选项2</el-radio>
      <el-radio :label="3">备选项3</el-radio>
    </el-radio-group>
  </div>
</template>
<!--单选框组-->
<script>
  export default {
    name: "element19",
    data() {
      return {
        radio2: 2
      };
    }
  }
</script>

<style scoped>

</style>
