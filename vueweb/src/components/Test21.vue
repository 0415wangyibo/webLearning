<template>
  <div id="test21">
    <p>{{ site }}</p>
  </div>
</template>

<script>
    export default {
      data() {
        return {
          name: 'Google',
          url: 'http://www.google.com'
        }
      },
      computed: {
        site: {
          // getter
        get: function () {
            return this.name + ' ' + this.url
          }
        }
      }
    };
</script>

<style scoped>

</style>
