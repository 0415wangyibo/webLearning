<template>
  <div>
    <el-input-number v-model="num8" controls-position="right" @change="handleChange" :min="1"
                     :max="10"></el-input-number>
  </div>
</template>
<!--设置 controls-position 属性可以控制按钮位置。-->
<script>
  export default {
    name: "element44",
    data() {
      return {
        num8: 1
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
