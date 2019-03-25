<template>
  <div id="test03">
    <label for="r1">修改颜色</label><input type="checkbox" v-model="use" id="r1">
    <br><br>
    <div v-bind:class="{'class1': use}">
      v-bind:class 指令
    </div>
  </div>
</template>
<script type="text/javascript">
  export default {
    data(){
      return {
        use: false
      }
    }
  };
</script>

<style>
  .class1{
    background: #444;
    color: #eee;
  }
</style>
