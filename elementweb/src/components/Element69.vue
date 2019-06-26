<template>
  <div>
    <div class="block">
      <el-slider
        v-model="value9"
        range
        show-stops
        :max="10">
      </el-slider>
    </div>
  </div>
</template>
<!--范围选择,鼠标进行滑动时可以滑出该范围-->
<script>
  export default {
    name: "element69",
    data() {
      return {
        value9: [4, 8]
      }
    }
  }
</script>

<style scoped>

</style>
