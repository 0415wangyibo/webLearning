<template>
  <div id="test30">
    <div v-bind:style="styleObject">好好学习，天天向上</div>
  </div>
</template>

<script>
    export default {
      data() {
        return {
          styleObject: {
            color: 'green',
            fontSize: '30px'
          }
        }
      }
    }
</script>

<style scoped>

</style>
