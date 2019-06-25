<template>
  <div>
    <el-input-number v-model="num1" @change="handleChange" :min="1" :max="10" label="描述文字"></el-input-number>
  </div>
</template>
<!--InputNumber 计数器-->
<script>
  export default {
    name: "element39",
    data() {
      return {
        num1: 1
      };
    },
    methods: {
      handleChange(value) {
        console.log(value);
      }
    }
  }
</script>

<style scoped>

</style>
