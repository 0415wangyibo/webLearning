<template>
  <div id="test32">
    <button v-on:click="counter += 1">增加 1</button>
    <p>这个按钮被点击了 {{ counter }} 次。</p>
  </div>
</template>

<script>
    export default {
        data(){
          return{
            counter:0
          }
        }
    }
</script>

<style scoped>

</style>
