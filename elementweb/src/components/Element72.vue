<template>
  <div>
    <el-time-picker
      v-model="value2"
      :picker-options="{
      selectableRange: '18:30:00 - 20:30:00'
    }"
      placeholder="任意时间点">
    </el-time-picker>
    <el-time-picker
      arrow-control
      v-model="value3"
      :picker-options="{
      selectableRange: '18:30:00 - 20:30:00'
    }"
      placeholder="任意时间点">
    </el-time-picker>
  </div>
</template>
<!--可以选择任意时间点-->
<script>
  export default {
    name: "element72",
    data() {
      return {
        value2: new Date(2016, 9, 10, 18, 40),
        value3: new Date(2016, 9, 10, 18, 40)
      };
    }
  }
</script>

<style scoped>

</style>
