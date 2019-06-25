<template>
  <div>
    <el-input-number v-model="num9" :precision="2" :step="0.1" :max="10"></el-input-number>
  </div>
</template>
<!--带精度-->
<script>
  export default {
    name: "element42",
    data() {
      return {
        num9: 1
      }
    }
  }
</script>

<style scoped>

</style>
