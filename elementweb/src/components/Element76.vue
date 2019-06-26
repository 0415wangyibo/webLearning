<template>
  <div>
    <div class="container">
      <div class="block">
        <span class="demonstration">周</span>
        <el-date-picker
          v-model="value3"
          type="week"
          format="yyyy 第 WW 周"
          placeholder="选择周">
        </el-date-picker>
      </div>
      <div class="block">
        <span class="demonstration">月</span>
        <el-date-picker
          v-model="value4"
          type="month"
          placeholder="选择月">
        </el-date-picker>
      </div>
    </div>
    <div class="container">
      <div class="block">
        <span class="demonstration">年</span>
        <el-date-picker
          v-model="value5"
          type="year"
          placeholder="选择年">
        </el-date-picker>
      </div>
      <div class="block">
        <span class="demonstration">多个日期</span>
        <el-date-picker
          type="dates"
          v-model="value14"
          placeholder="选择一个或多个日期">
        </el-date-picker>
      </div>
    </div>
  </div>
</template>
<!--通过扩展基础的日期选择，可以选择周、月、年或多个日期-->
<script>
  export default {
    name: "element76",
    data() {
      return {
        value3: '',
        value4: '',
        value5: '',
        value14: []
      };
    }
  }
</script>

<style scoped>

</style>
