<template>
  <div id="test10">
    <p v-if="seen">现在你看到我了</p>
    <template v-if="ok">
      <h1>菜鸟教程</h1>
      <p>学的不仅是技术，更是梦想！</p>
      <p>哈哈哈，打字辛苦啊！！！</p>
    </template>
  </div>
</template>

<script>
    export default {
      name: "test10",
      data(){
        return {
          seen: true,
          ok: true
        }
      }
    }
</script>

<style scoped>

</style>
