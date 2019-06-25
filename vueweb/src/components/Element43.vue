<template>
  <div>
    <el-input-number v-model="num4"></el-input-number>
    <el-input-number size="medium" v-model="num5"></el-input-number>
    <el-input-number size="small" v-model="num6"></el-input-number>
    <el-input-number size="mini" v-model="num7"></el-input-number>
  </div>
</template>

<script>
  export default {
    name: "element43",
    data() {
      return {
        num4: 1,
        num5: 1,
        num6: 1,
        num7: 1
      }
    }
  }
</script>

<style scoped>

</style>
