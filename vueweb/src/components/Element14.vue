<template>
    <div>
      <el-row>
        <el-button-group>
          <el-button type="primary" icon="el-icon-arrow-left">上一页</el-button>
          <el-button type="primary">下一页<i class="el-icon-arrow-right el-icon--right"></i></el-button>
        </el-button-group>
        <el-button-group>
          <el-button type="primary" icon="el-icon-edit"></el-button>
          <el-button type="primary" icon="el-icon-share"></el-button>
          <el-button type="primary" icon="el-icon-delete"></el-button>
        </el-button-group>
      </el-row>
    </div>
</template>
<!--按钮组-->
<script>
    import ElRow from "element-ui/packages/row/src/row";

    export default {
      components: {ElRow},
      name: "element14"
    }
</script>

<style scoped>

</style>
