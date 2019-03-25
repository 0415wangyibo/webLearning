<template>
  <div id="test07">
    <p>{{ message }}</p>
    <input v-model="message">
  </div>
</template>

<script>
    export default {
      data(){
        return{
          message: 'Runoob!'
        }
      }
    }
</script>

<style scoped>

</style>
