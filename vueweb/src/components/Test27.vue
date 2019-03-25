<template>
  <div id="test27">
    <div v-bind:class="[activeClass, errorClass]"></div>
  </div>
</template>

<script>
    export default {
      data(){
        return {
          activeClass: 'active',
          errorClass: 'text-danger'
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
