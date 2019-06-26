<template>
  <div>
    <el-rate
      v-model="value4"
      :icon-classes="['icon-rate-face-1', 'icon-rate-face-2', 'icon-rate-face-3']"
      void-icon-class="icon-rate-face-off"
      :colors="['#99A9BF', '#F7BA2A', '#FF9900']">
    </el-rate>
  </div>
</template>
<!--当有多层评价时，可以用不同类型的 icon 区分评分层级-->
<script>
  export default {
    name: "element92",
    data() {
      return {
        value4: null
      }
    }
  }
</script>

<style scoped>

</style>
