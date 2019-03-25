<template>
  <div id="test14">
    <ol>
      <li v-for="site in sites">
        {{ site.name }}
      </li>
    </ol>
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
  #test14{
    text-align: left;
  }
</style>
