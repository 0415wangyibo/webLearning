<template>
  <div id="test24">
    <div class="static"
         v-bind:class="{ active: isActive, 'text-danger': hasError }">
    </div>
  </div>
</template>

<script>
    export default {
      data() {
        return {
          isActive: true,
          hasError: true
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
