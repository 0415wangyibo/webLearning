<template>
  <div id="test16">
    <ul>
      <li v-for="value in object">
        {{ value }}
      </li>
    </ul>
  </div>
</template>

<script>
    export default {
      data(){
       return {
         object: {
           name: '菜鸟教程',
           url: 'http://www.runoob.com',
           slogan: '学的不仅是技术，更是梦想！'
         }
       }
      }
    }
</script>

<style scoped>
  #test16{
    text-align: left;
  }
</style>
