<template>
  <div>
    <el-time-select
      v-model="value1"
      :picker-options="{
    start: '08:30',
    step: '00:15',
    end: '18:30'
  }"
      placeholder="选择时间">
    </el-time-select>
  </div>
</template>
<!--TimePicker 时间选择器，固定步长-->
<script>
  export default {
    name: "element71",
    data() {
      return {
        value1: ''
      };
    }
  }
</script>

<style scoped>

</style>
