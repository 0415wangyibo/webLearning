<template>
  <div>
    <div class="block">
      <p>组件值：{{ value13 }}</p>
      <el-date-picker
        v-model="value13"
        type="daterange"
        start-placeholder="开始日期"
        end-placeholder="结束日期"
        :default-time="['00:00:00', '23:59:59']">
      </el-date-picker>
    </div>
  </div>
</template>
<!--默认显示时间-->
<script>
  export default {
    name: "element79",
    data() {
      return {
        value13: []
      };
    }
  }
</script>

<style scoped>

</style>
