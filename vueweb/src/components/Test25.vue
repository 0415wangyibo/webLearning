<template>
  <div id="test25">
    <div v-bind:class="classObject"></div>
  </div>
</template>

<script>
    export default {
      data() {
        return {
          classObject: {
            active: true,
            'text-danger': true
          }
        }
      }
    }
</script>

<style scoped>
  .active {
    width: 100px;
    height: 100px;
    background: green;
  }
  .text-danger {
    background: red;
  }
</style>
