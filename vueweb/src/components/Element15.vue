<template>
    <div>
      <el-row>
        <el-button type="primary" :loading="true">加载中</el-button>
      </el-row>
    </div>
</template>
<!--加载中-->
<script>
    import ElRow from "element-ui/packages/row/src/row";

    export default {
      components: {ElRow},
      name: "element15"
    }
</script>

<style scoped>

</style>
