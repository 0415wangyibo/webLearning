<template>
  <div id="test29">
    <div v-bind:style="{ color: activeColor, fontSize: fontSize + 'px' }">好好学习，天天向上</div>
  </div>
</template>

<script>
    export default {
      data(){
        return {
          activeColor: 'green',
          fontSize: 30
        }
      }
    }
</script>

<style scoped>

</style>
