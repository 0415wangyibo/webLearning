<template>
  <div id="test31">
    <div v-bind:style="[baseStyles, overridingStyles]">好好学习，天天向上</div>
  </div>
</template>

<script>
    export default {
      data() {
       return {
         baseStyles: {
           color: 'green',
           fontSize: '30px'
         },
         overridingStyles: {
           'font-weight': 'bold'
         }
       }
      }
    }
</script>

<style scoped>

</style>
