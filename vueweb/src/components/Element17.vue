<template>
  <div>
    <el-radio v-model="radio" label="1">备选项1</el-radio>
    <el-radio v-model="radio" label="2">备选项2</el-radio>
  </div>
</template>
<!--单选按钮-->
<script>
  export default {
    name: "element17",
    data() {
      return {
        radio: '1'
      };
    }
  }
</script>

<style scoped>

</style>
