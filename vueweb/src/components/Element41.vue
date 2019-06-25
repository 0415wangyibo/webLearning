<template>
  <div>
    <el-input-number v-model="num3" :step="2" :min="1" :max="9"></el-input-number>
  </div>
</template>
<!--步长-->
<script>
  export default {
    name: "element41",
    data() {
      return {
        num3: 5
      }
    }
  }
</script>

<style scoped>

</style>
