<template>
  <div>
    <el-checkbox-group v-model="checkedCities1" :min="1" :max="2">
      <el-checkbox v-for="city in cities" :label="city" :key="city">{{city}}</el-checkbox>
    </el-checkbox-group>
  </div>
</template>
<!--对多选项进行最少最多个数限制-->
<script>
  const cityOptions = ['上海', '北京', '广州', '深圳'];
  export default {
    name: "element26",
    data() {
      return {
        checkedCities1: ['上海', '北京'],
        cities: cityOptions
      };
    }
  }
</script>

<style scoped>

</style>
