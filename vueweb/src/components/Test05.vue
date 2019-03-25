<template>
  <div id="test05">
    <p v-if="seen">现在你看到我了</p>
    <template v-if="ok">
      <h1>菜鸟教程</h1>
      <p>学的不仅是技术，更是梦想！</p>
      <p>哈哈哈，打字辛苦啊！！！</p>
    </template>
  </div>
</template>
<script type="text/javascript">
  export default {
    data(){
      return {
        seen: false,
        ok: true
      }
    }
  };
</script>
