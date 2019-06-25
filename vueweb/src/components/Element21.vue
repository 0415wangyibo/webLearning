<template>
  <div>
    <div>
      <el-radio v-model="radio7" label="1" border>备选项1</el-radio>
      <el-radio v-model="radio7" label="2" border>备选项2</el-radio>
    </div>
    <div style="margin-top: 20px">
      <el-radio v-model="radio8" label="1" border size="medium">备选项1</el-radio>
      <el-radio v-model="radio8" label="2" border size="medium">备选项2</el-radio>
    </div>
    <div style="margin-top: 20px">
      <el-radio-group v-model="radio9" size="small">
        <el-radio label="1" border>备选项1</el-radio>
        <el-radio label="2" border disabled>备选项2</el-radio>
      </el-radio-group>
    </div>
    <div style="margin-top: 20px">
      <el-radio-group v-model="radio10" size="mini" disabled>
        <el-radio label="1" border>备选项1</el-radio>
        <el-radio label="2" border>备选项2</el-radio>
      </el-radio-group>
    </div>
  </div>
</template>
<!--带有边框单选组-->
<script>
  export default {
    name: "element21",
    data() {
      return {
        radio7: '1',
        radio8: '1',
        radio9: '1',
        radio10: '1'
      };
    }
  }
</script>

<style scoped>

</style>
