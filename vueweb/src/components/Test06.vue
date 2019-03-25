<template>
  <div id="test06">
    <pre><a v-bind:href="url">菜鸟教程</a></pre>
  </div>
</template>

<script>
    export default {
      data() {
        return {
          url: 'http://www.runoob.com'
        }
      }
    }
</script>

<style scoped>

</style>
