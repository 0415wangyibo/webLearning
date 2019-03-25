<template>
  <div id="test08">
    <p>{{ message }}</p>
    <button v-on:click="reverseMessage">反转字符串</button>
  </div>
</template>

<script>
    export default {
      data() {
        return {
          message: 'Runoob!'
        }
      },
      methods: {
        reverseMessage: function () {
          this.message = this.message.split('').reverse().join('')
        }
      }
    }
</script>

<style scoped>

</style>
