<template>
  <div id="test17">
    <ul>
      <!--v-for中value和key的顺序不能变-->
      <li v-for="(value,key) in object">
        {{ key }} : {{ value }}
      </li>
    </ul>
  </div>
</template>

<script>
    export default {
      data() {
        return{
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
  #test17{
    text-align: left;
  }
</style>
