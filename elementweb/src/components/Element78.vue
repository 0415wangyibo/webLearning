<template>
  <div>
    <div class="block">
      <span class="demonstration">默认为 Date 对象</span>
      <div class="demonstration">值：{{ value10 }}</div>
      <el-date-picker
        v-model="value10"
        type="date"
        placeholder="选择日期"
        format="yyyy 年 MM 月 dd 日">
      </el-date-picker>
    </div>
    <div class="block">
      <span class="demonstration">使用 value-format</span>
      <div class="demonstration">值：{{ value11 }}</div>
      <el-date-picker
        v-model="value11"
        type="date"
        placeholder="选择日期"
        format="yyyy 年 MM 月 dd 日"
        value-format="yyyy-MM-dd">
      </el-date-picker>
    </div>
    <div class="block">
      <span class="demonstration">时间戳</span>
      <div class="demonstration">值：{{ value12 }}</div>
      <el-date-picker
        v-model="value12"
        type="date"
        placeholder="选择日期"
        format="yyyy 年 MM 月 dd 日"
        value-format="timestamp">
      </el-date-picker>
    </div>
  </div>
</template>
<!--不同的日期格式-->
<script>
  export default {
    name: "element78",
    data() {
      return {
        value10: '',
        value11: '',
        value12: ''
      };
    }
  }
</script>

<style scoped>

</style>
