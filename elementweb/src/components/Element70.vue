<template>
  <div>
    <div class="block">
      <el-slider
        v-model="value10"
        vertical
        height="200px">
      </el-slider>
    </div>
  </div>
</template>
<!--竖向滑块模式-->
<script>
  export default {
    name: "element70",
    data() {
      return {
        value10: 0
      }
    }
  }
</script>

<style scoped>

</style>
