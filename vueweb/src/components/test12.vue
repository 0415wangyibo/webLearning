<template>
  <div id="test12">
    <div v-if="type === 'A'">
      A
    </div>
    <div v-else-if="type === 'B'">
      B
    </div>
    <div v-else-if="type === 'C'">
      C
    </div>
    <div v-else>
      Not A/B/C
    </div>
  </div>
</template>

<script>
    export default {
      data(){
        return{
          type: 'C'
        }
      }
    }
</script>

<style scoped>

</style>
