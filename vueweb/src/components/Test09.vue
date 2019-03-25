<template>
  <div id="test09">
    {{ message | capitalize }}
  </div>
</template>

<script>
    export default {
      data(){
        return {
          message: 'runoob'
        }
      },
      filters: {
        capitalize: function (value) {
          if (!value) return '';
          value = value.toString();
          return value.charAt(0).toUpperCase() + value.slice(1)
        }
      }
    }
</script>

<style scoped>

</style>
