<template>
  <div>
    <el-input
      type="textarea"
      :rows="2"
      placeholder="请输入内容"
      v-model="textarea">
    </el-input>
  </div>
</template>
<!--文本域-->
<script>
  export default {
    name: "element33",
    data() {
      return {
        textarea: ''
      }
    }
  }
</script>

<style scoped>

</style>
