<template>
  <div id="test15">
    <ul>
      <template v-for="site in sites">
        <li>{{ site.name }}</li>
        <li>--------------</li>
      </template>
    </ul>
  </div>
</template>

<script>
    export default {
      data(){
        return {
          sites: [
            {name: 'Runoob'},
            {name: 'Google'},
            {name: 'Taobao'}
          ]
        }
      }
    }
</script>

<style scoped>
  #test15{
    text-align: left;
  }
</style>
