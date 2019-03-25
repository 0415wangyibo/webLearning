<template>
  <div id="test29">
    <div v-bind:class="[errorClass ,isActive ? activeClass : '']"></div>
  </div>
</template>

<script>
    export default {
      data() {
        return {
          isActive: true,
          activeClass: 'active',
          errorClass: 'text-danger'
        }
      }
    }
</script>

<style scoped>
  .text-danger {
    width: 100px;
    height: 100px;
    background: red;
  }
  .active {
    width: 100px;
    height: 100px;
    background: green;
  }
</style>
