<template>
  <div>
    <el-input
      type="textarea"
      autosize
      placeholder="请输入内容"
      v-model="textarea2">
    </el-input>
    <div style="margin: 20px 0;"></div>
    <el-input
      type="textarea"
      :autosize="{ minRows: 2, maxRows: 4}"
      placeholder="请输入内容"
      v-model="textarea3">
    </el-input>
  </div>
</template>
<!--可自适应文本高度的文本域-->
<script>
  export default {
    name: "element34",
    data() {
      return {
        textarea2: '',
        textarea3: ''
      }
    }
  }
</script>

<style scoped>

</style>
