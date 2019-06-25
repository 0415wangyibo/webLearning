<template>
  <div class="demo-input-size">
    <el-input
      placeholder="请输入内容"
      suffix-icon="el-icon-date"
      v-model="input6">
    </el-input>
    <el-input
      size="medium"
      placeholder="请输入内容"
      suffix-icon="el-icon-date"
      v-model="input7">
    </el-input>
    <el-input
      size="small"
      placeholder="请输入内容"
      suffix-icon="el-icon-date"
      v-model="input8">
    </el-input>
    <el-input
      size="mini"
      placeholder="请输入内容"
      suffix-icon="el-icon-date"
      v-model="input9">
    </el-input>
  </div>
<!--输入框尺寸-->
</template>

<script>
  export default {
    name: "element36",
    data() {
      return {
        input6: '',
        input7: '',
        input8: '',
        input9: ''
      }
    }
  }
</script>

<style scoped>

</style>
