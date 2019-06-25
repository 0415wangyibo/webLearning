<template>
  <div>
    <div class="demo-input-suffix">
      属性方式：
      <el-input
        placeholder="请选择日期"
        suffix-icon="el-icon-date"
        v-model="input2">
      </el-input>
      <el-input
        placeholder="请输入内容"
        prefix-icon="el-icon-search"
        v-model="input21">
      </el-input>
    </div>
    <div class="demo-input-suffix">
      slot 方式：
      <el-input
        placeholder="请选择日期"
        v-model="input22">
        <i slot="suffix" class="el-input__icon el-icon-date"></i>
      </el-input>
      <el-input
        placeholder="请输入内容"
        v-model="input23">
        <i slot="prefix" class="el-input__icon el-icon-search"></i>
      </el-input>
    </div>
  </div>
</template>
<!--带有icon的输入框-->
<script>
  export default {
    name: "element32",
    data() {
      return {
        input2: '',
        input21: '',
        input22: '',
        input23: ''
      }
    }
  }
</script>

<style scoped>

</style>
