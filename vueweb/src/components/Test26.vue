<template>
  <div id="test27">
    <div v-bind:class="classObject"></div>
  </div>
</template>

<script>
    export default {
      data() {
        return {
          isActive: true,
          error: {
            value: false,
            type: 'fatal'
          }
        }
      },
      computed: {
        classObject: function () {
          return {
            base: true,
            active: this.isActive && !this.error.value,
            'text-danger': this.error.value && this.error.type === 'fatal',
          }
        }
      }
    }
</script>

<style scoped>
  .base {
    width: 100px;
    height: 100px;
  }

  .active {
    background: green;
  }

  .text-danger {
    background: red;
  }
</style>
