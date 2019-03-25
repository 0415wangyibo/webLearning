<template>
  <div id="app">
    <h1 v-show="ok">Hello!</h1>
  </div>
</template>

<script>
    export default {
      data() {
        return {
          ok: true
        }
      }
    }
</script>

<style scoped>

</style>
