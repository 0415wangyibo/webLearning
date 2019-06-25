<template>
    <div>
      <el-input-number v-model="num2" :disabled="true"></el-input-number>
    </div>
</template>
<!--InputNumber 计数器 禁用-->
<script>
    export default {
        name: "element40",
      data() {
        return {
          num2: 1
        }
      }
    }
</script>

<style scoped>

</style>
