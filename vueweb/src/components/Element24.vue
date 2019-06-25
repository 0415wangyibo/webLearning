<template>
  <div>
    <el-checkbox-group v-model="checkList">
      <el-checkbox label="复选框 A"></el-checkbox>
      <el-checkbox label="复选框 B"></el-checkbox>
      <el-checkbox label="复选框 C"></el-checkbox>
      <el-checkbox label="禁用" disabled></el-checkbox>
      <el-checkbox label="选中且禁用" disabled></el-checkbox>
    </el-checkbox-group>
  </div>
</template>
<!--复选框组禁用-->
<script>
  export default {
    name: "element24",
    data() {
      return {
        checkList: ['选中且禁用', '复选框 A']
      };
    }
  }
</script>

<style scoped>

</style>
