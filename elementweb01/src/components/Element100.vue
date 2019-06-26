<template>
  <div>
    <el-transfer
      v-model="value5"
      :props="{
      key: 'value',
      label: 'desc'
    }"
      :data="data3">
    </el-transfer>
  </div>
</template>
<!--数据项属性别名-->
<script>
  export default {
    name: "element100",
    data() {
      const generateData3 = _ => {
        const data = [];
        for (let i = 1; i <= 15; i++) {
          data.push({
            value: i,
            desc: `备选项 ${ i }`,
            disabled: i % 4 === 0
          });
        }
        return data;
      };
      return {
        data3: generateData3(),
        value5: []
      };
    }
  }
</script>

<style scoped>

</style>
